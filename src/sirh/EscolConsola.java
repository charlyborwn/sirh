
package sirh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EscolConsola extends javax.swing.JFrame {


    public EscolConsola() {
        initComponents();
        setDefaultCloseOperation(0);
        Iniciar();
    }

    private void Limpiar(JTable tabla){
        while(tabla.getRowCount()>0){
            ((DefaultTableModel) tabla.getModel()).removeRow(0);
        }
    }
    
    private void Iniciar(){
        fecha.setText(fechaActual());
        usuario.setText(Acceso.getClaveUsuario());
        txtNombre.setText(Acceso.getNombreUsuario());
        txtEmpresa.setText(Acceso.getEmpresaUsuario());
        txtNumero.setText(String.valueOf(Traba.getNumTrabaja()));
        txtTrabaja.setText(Traba.getNomTrabaja());
        
        int NumTra = Traba.getNumTrabaja();
        Limpiar(tablaescol);
        DefaultTableModel modelo=(DefaultTableModel) tablaescol.getModel();
        Escol e=new Escol();
        e.LlenarDatos(modelo, NumTra);
        
        tipo.removeAllItems();
        tipo.addItem("");
        Escol e1=new Escol();
        e1.LlenarTipo(tipo);
        finicio.setDate(null);
        ftermino.setDate(null);
        años.setText("");
        certificado.removeAllItems();
        certificado.addItem("");
        Escol e2=new Escol();
        e2.LlenarSino(certificado);
        espec.removeAllItems();
        espec.addItem("");
        Escol e3=new Escol();
        e3.LlenarEspec(espec);
        path.setText("FTP://SIRH.DYNDNS.ORG/ESCUELAS/ESCUELAS.GIF");
        observa.setText("");
        status.setText("");
        crear.setEnabled(true);
        tipo.setEnabled(true);
    }

    public static String fechaActual(){
        Date fecha= new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        return formatoFecha.format(fecha);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaescol = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        finicio = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        ftermino = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        años = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        certificado = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        espec = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        observa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        crear = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtTrabaja = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SNTIAISCRM Sistema de Recursos Humanos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tablaescol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Inicio", "Término", "Años Cursados", "Certificado", "Especialidad", "Path", "Observaciones", "Status", "Ultima Fecha", "Ultimo Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaescol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaescolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaescol);

        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Tipo:");

        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Fecha Inicio:");

        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Fecha Término:");

        jLabel5.setText("Años Cursados:");

        años.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                añosKeyTyped(evt);
            }
        });

        jLabel6.setText("Certificado:");

        jLabel7.setText("Especialidad:");

        jLabel8.setText("Observaciones:");

        jLabel9.setText("Path:");

        path.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pathMouseClicked(evt);
            }
        });

        jLabel10.setText("Status:");

        status.setEditable(false);

        jLabel11.setText("Fecha:");

        fecha.setEditable(false);

        jLabel12.setText("Usuario:");

        usuario.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ftermino, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                    .addComponent(finicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(años, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(certificado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(espec, 0, 353, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(observa)
                            .addComponent(path)
                            .addComponent(status)
                            .addComponent(fecha)
                            .addComponent(usuario))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(observa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(años, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(certificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(espec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addComponent(crear)
                .addGap(18, 18, 18)
                .addComponent(actualizar)
                .addGap(18, 18, 18)
                .addComponent(eliminar)
                .addGap(18, 18, 18)
                .addComponent(cancelar)
                .addGap(18, 18, 18)
                .addComponent(salir)
                .addGap(306, 306, 306))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crear)
                    .addComponent(actualizar)
                    .addComponent(eliminar)
                    .addComponent(cancelar)
                    .addComponent(salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MOVIMIENTOS DE ESCOLARIDADES (Trabajadores)");

        txtEmpresa.setEditable(false);
        txtEmpresa.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtEmpresa.setForeground(new java.awt.Color(204, 0, 0));
        txtEmpresa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEmpresa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNumero.setEditable(false);

        txtTrabaja.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTrabaja, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrabaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        Escol e=new Escol();
        String dtipo=tipo.getSelectedItem().toString();
        if(dtipo.isEmpty()){
            JOptionPane.showMessageDialog(this, "Se requiere un tipo de escolaridad, verifique .....");
            Iniciar();
        }
        else{
            if(finicio.getDate() == null){
                JOptionPane.showMessageDialog(this, "Se requiere la fecha de inicio de la escolaridad, verifique .....");
                finicio.grabFocus();
            }
            else{
                if(ftermino.getDate() == null){
                    JOptionPane.showMessageDialog(this, "Se requiere la fecha de término de la escolaridad, verifique .....");
                    ftermino.grabFocus();
                }
                else{
                    int añoi=finicio.getCalendar().get(Calendar.YEAR);
                    int mesi=finicio.getCalendar().get(Calendar.MONTH)+1;
                    int diai=finicio.getCalendar().get(Calendar.DAY_OF_MONTH);
                    String dfinicio=(añoi+"/"+mesi+"/"+diai);
                    int añot=ftermino.getCalendar().get(Calendar.YEAR);
                    int mest=ftermino.getCalendar().get(Calendar.MONTH)+1;
                    int diat=ftermino.getCalendar().get(Calendar.DAY_OF_MONTH);
                    String dftermino=(añot+"/"+mest+"/"+diat);
                    float daños=Float.parseFloat(años.getText());
                    String dcertificado=certificado.getSelectedItem().toString();
                    String despec=espec.getSelectedItem().toString();
                    String dpath=path.getText().toUpperCase();
                    String dobserva=observa.getText().toUpperCase();
                    e.Agregar(Traba.getNumTrabaja(), dtipo, dfinicio, dftermino, daños, dcertificado, despec, dpath, dobserva, Acceso.getClaveUsuario());
                    JOptionPane.showMessageDialog(this, "Registro creado .....");
                    Iniciar();
                }
            }
        }
    }//GEN-LAST:event_crearActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        Escol e=new Escol();
        String dtipo=tipo.getSelectedItem().toString();
        if(dtipo.isEmpty()){
            JOptionPane.showMessageDialog(this, "Se requiere un tipo de escolaridad, verifique .....");
            Iniciar();
        }
        else{
            if(finicio.getDate() == null){
                JOptionPane.showMessageDialog(this, "Se requiere la fecha de inicio de la escolaridad, verifique .....");
                finicio.grabFocus();
            }
            else{
                if(ftermino.getDate() == null){
                    JOptionPane.showMessageDialog(this, "Se requiere la fecha de término de la escolaridad, verifique .....");
                    ftermino.grabFocus();
                }
                else{
                    int añoi=finicio.getCalendar().get(Calendar.YEAR);
                    int mesi=finicio.getCalendar().get(Calendar.MONTH)+1;
                    int diai=finicio.getCalendar().get(Calendar.DAY_OF_MONTH);
                    String dfinicio=(añoi+"/"+mesi+"/"+diai);
                    int añot=ftermino.getCalendar().get(Calendar.YEAR);
                    int mest=ftermino.getCalendar().get(Calendar.MONTH)+1;
                    int diat=ftermino.getCalendar().get(Calendar.DAY_OF_MONTH);
                    String dftermino=(añot+"/"+mest+"/"+diat);
                    float daños=Float.parseFloat(años.getText());
                    String dcertificado=certificado.getSelectedItem().toString();
                    String despec=espec.getSelectedItem().toString();
                    String dpath=path.getText().toUpperCase();
                    String dobserva=observa.getText().toUpperCase();
                    e.Actualizar(Traba.getNumTrabaja(), dtipo, dfinicio, dftermino, daños, dcertificado, despec, dpath, dobserva, Acceso.getClaveUsuario());
                    JOptionPane.showMessageDialog(this, "Registro actualizado .....");
                    Iniciar();
                }
            }
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        Escol e=new Escol();
        String dtipo=tipo.getSelectedItem().toString();
        if(dtipo.isEmpty()){
            JOptionPane.showMessageDialog(this, "Se requiere un tipo de escolaridad, verifique .....");
            Iniciar();
        }
        else{
            e.Eliminar(Traba.getNumTrabaja(), dtipo, Acceso.getClaveUsuario());
            JOptionPane.showMessageDialog(this, "Registro eliminado .....");
            Iniciar();
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Iniciar();
    }//GEN-LAST:event_cancelarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void pathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pathMouseClicked
        Escol.setPathUsuario(path.getText().toUpperCase());
        VEscolConsola object=new VEscolConsola();
        object.setVisible(true);
    }//GEN-LAST:event_pathMouseClicked

    private void tablaescolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaescolMouseClicked
        DefaultTableModel modelo= (DefaultTableModel) tablaescol.getModel();
        tipo.setSelectedItem(modelo.getValueAt(tablaescol.getSelectedRow(), 0)+"");
        String fecini = (modelo.getValueAt(tablaescol.getSelectedRow(), 1)+"");
        if("null".equals(fecini)){
            System.out.println("La fecha de inicio esta vacia .....");
        }
        else{
            SimpleDateFormat formatofecha1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try{
                Date fecha1 = formatofecha1.parse(fecini);
                finicio.setDate(fecha1);
            }
            catch(ParseException pe1){
            System.out.println("Error Parse1: "+pe1.getMessage());
            }
        }
        String fecter = (modelo.getValueAt(tablaescol.getSelectedRow(), 2)+"");
        if("null".equals(fecter)){
            System.out.println("La fecha de término esta vacia .....");
        }
        else{
            SimpleDateFormat formatofecha2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try{
                Date fecha1 = formatofecha2.parse(fecter);
                ftermino.setDate(fecha1);
            }
            catch(ParseException pe2){
                System.out.println("Error Parse2: "+pe2.getMessage());
            }
        }
        años.setText(modelo.getValueAt(tablaescol.getSelectedRow(), 3)+"");
        certificado.setSelectedItem(modelo.getValueAt(tablaescol.getSelectedRow(), 4)+"");
        espec.setSelectedItem(modelo.getValueAt(tablaescol.getSelectedRow(), 5)+"");
        path.setText(modelo.getValueAt(tablaescol.getSelectedRow(), 6)+"");
        observa.setText(modelo.getValueAt(tablaescol.getSelectedRow(), 7)+"");
        status.setText(modelo.getValueAt(tablaescol.getSelectedRow(), 8)+"");
        fecha.setText(modelo.getValueAt(tablaescol.getSelectedRow(), 9)+"");
        usuario.setText(modelo.getValueAt(tablaescol.getSelectedRow(), 10)+"");
        crear.setEnabled(false);
        tipo.setEnabled(false);
    }//GEN-LAST:event_tablaescolMouseClicked

    private void añosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_añosKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car != '.'))
        {
            evt.consume();
        }
    }//GEN-LAST:event_añosKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EscolConsola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolConsola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolConsola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolConsola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolConsola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField años;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox certificado;
    private javax.swing.JButton crear;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox espec;
    private javax.swing.JTextField fecha;
    private com.toedter.calendar.JDateChooser finicio;
    private com.toedter.calendar.JDateChooser ftermino;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField observa;
    private javax.swing.JTextField path;
    private javax.swing.JButton salir;
    private javax.swing.JTextField status;
    private javax.swing.JTable tablaescol;
    private javax.swing.JComboBox tipo;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTrabaja;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
