/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Modelo.Conexion;
import controlador.OdontologoController;
import controlador.PrincipalController;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;



public class VentanaOdontologos extends javax.swing.JFrame {

    Connection con = Conexion.getConexion();
    
    public VentanaOdontologos() {
        
        initComponents();
        mostrarDatosOdontologo(0,null);
    }
    public void mostrarDatosOdontologo(int opBuscar,String valor){
        DefaultTableModel todont=new DefaultTableModel();
        todont.addColumn("Dni");
        todont.addColumn("Nombre");
        todont.addColumn("Apellido");
        todont.addColumn("Telefono");
        todont.addColumn("Correo");
        todont.addColumn("Turno");
        todont.addColumn("Genero");
        todont.addColumn("Provincia");
        todont.addColumn("Direccion");
        todont.addColumn("Fecha_nacimiento");
        todont.addColumn("Ciudad");
 
        tablaOdont.setModel(todont);
        String codsql;
        if(opBuscar == 0 && valor==null){
            codsql = "SELECT * FROM ODONTOLOGOS";
            
        }else {
            if(opBuscar==1 && valor!=null){
                codsql="SELECT * FROM ODONTOLOGOS where dni_odontologo='"+valor+"'";
            }else {
                if(opBuscar==2 && valor!=null){
                    codsql= "SELECT * FROM ODONTOLOGOS where apellido='"+valor+"'";
                }else {

                      codsql = "SELECT * FROM ODONTOLOGOS";  
                }
            }
        }
            
        String []datos=new String[11];
        try {
            Statement leer=con.createStatement();
            ResultSet resultado = leer.executeQuery(codsql);
            
            while(resultado.next()){
                datos[0] =resultado.getString(1);
                datos[1] =resultado.getString(2);
                datos[2] =resultado.getString(3);
                datos[3] =resultado.getString(4);
                datos[4] =resultado.getString(5);
                datos[5] =resultado.getString(6);
                datos[6] =resultado.getString(7);
                datos[7] =resultado.getString(8);
                datos[8] =resultado.getString(9);
                datos[9] =resultado.getString(10);
                datos[10] =resultado.getString(11);
                
                todont.addRow(datos);
                tablaOdont.setModel(todont);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e+ "error en la consulta");
        }   
    }
    public void actualizarDatos(){
         int fila =tablaOdont.getSelectedRow();
         if(fila<1){
             JOptionPane.showMessageDialog(null, "Seleccione el registro a midificar antes de precionar el boton");
         }
         int dni = Integer.parseInt(this.tablaOdont.getValueAt(fila,0).toString());
         String nombre =tablaOdont.getValueAt(fila, 1).toString();
         String apellido =tablaOdont.getValueAt(fila, 2).toString();
         String telefono =tablaOdont.getValueAt(fila, 3).toString();
         String correo =tablaOdont.getValueAt(fila, 4).toString();
         String turno =tablaOdont.getValueAt(fila, 5).toString();
         String genero =tablaOdont.getValueAt(fila, 6).toString();
         String provincia =tablaOdont.getValueAt(fila, 7).toString();
         String direccion =tablaOdont.getValueAt(fila, 8).toString();
         String fecha_nacimiento =tablaOdont.getValueAt(fila, 9).toString();
         String ciudad =tablaOdont.getValueAt(fila, 10).toString();
         
         try {
             if(JOptionPane.showConfirmDialog(null, "Se Actualizara el registro, ¿desea continuar?") == JOptionPane.YES_OPTION){
                    
                PreparedStatement actu=con.prepareStatement("UPDATE ODONTOLOGOS SET nombre='"+nombre+"',apellido='"+apellido+"',telefono='"+telefono+"',correo='"+correo+"',turno='"+turno+"',genero='"+genero+"',provincia='"+provincia+"',direccion='"+direccion+"',fecha_nacimiento='"+fecha_nacimiento+"',ciudad='"+ciudad+"' WHERE dni_odontologo='"+dni+"'");
                actu.executeUpdate();
                mostrarDatosOdontologo(0, null);
             }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "No se logro actualizar");
        }
        }
    public void eliminarOdontologo(){
            int fila = tablaOdont.getSelectedRow();
            String valor =tablaOdont.getValueAt(fila, 0).toString();
            try {
                if(JOptionPane.showConfirmDialog(null, "Se eliminará el registro, ¿desea continuar?") == JOptionPane.YES_OPTION){
                    PreparedStatement elim=con.prepareStatement("delete from ODONTOLOGOS where dni_odontologo='"+valor+"'");
                    elim.executeUpdate();
                    mostrarDatosOdontologo(0,null);
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "No se elimino nada");
        }
            
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaOdont = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        campoBuscar = new javax.swing.JTextField();
        comboOpcion = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tablaOdont.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaOdont);

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por:"));

        campoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscarActionPerformed(evt);
            }
        });
        campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoBuscarKeyReleased(evt);
            }
        });

        comboOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar todos:", "Dni", "Apellido" }));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(comboOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnBuscar)
                .addContainerGap(505, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnActualizar.setText("Actualizar datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jButton1)
                .addGap(140, 140, 140)
                .addComponent(btnEliminar)
                .addGap(127, 127, 127)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEliminar)
                                .addComponent(btnActualizar)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PrincipalController.botonNuevoOdontologo();
        OdontologoController.Ocultar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        PrincipalController.Mostrar();
        OdontologoController.Ocultar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void campoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        int opcion =comboOpcion.getSelectedIndex();
        String valorbus= campoBuscar.getText();
        mostrarDatosOdontologo(opcion, valorbus);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        actualizarDatos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarOdontologo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void campoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyReleased
//        DefaultTableModel todont=new DefaultTableModel();
//        TableRowSorter<DefaultTableModel> Sorter;
//        Sorter = new TableRowSorter<>(todont);
//        tablaOdont.setRowSorter(Sorter);
//        Sorter.setRowFilter(RowFilter.regexFilter(campoBuscar.getText(),comboOpcion.getSelectedIndex()));
    }//GEN-LAST:event_campoBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(VentanaOdontologos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOdontologos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOdontologos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOdontologos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaOdontologos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JComboBox<String> comboOpcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaOdont;
    // End of variables declaration//GEN-END:variables
}
