/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Modelo.Conexion;
import controlador.PrincipalController;
import controlador.UsuarioController;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class VentanaUsuarios extends javax.swing.JFrame {
    Connection con = Conexion.getConexion();

    
    public VentanaUsuarios() {
        initComponents();

        mostrarDatosUsuarios(0,null);
    }

    
   //AQUI EMPIEZA BOTON BUSCAR O FILTRAR
    public void mostrarDatosUsuarios(int opbuscar, String valor){
        
        DefaultTableModel tusuario = new DefaultTableModel();
        tusuario.addColumn("codigo");
        tusuario.addColumn("usuario");
        tusuario.addColumn("contraseña");
        tusuario.addColumn("correo");
        tusuario.addColumn("nombre");
        tusuario.addColumn("apellido");
        tusuario.addColumn("telefono");
        tusuario.addColumn("perfil");
//        tusuario.addColumn("permisos");
        tablausuario.setModel(tusuario);
        
        String codsql;
        if(opbuscar==0 && valor == null){
            codsql = "select*from USUARIOS ";
        }else {
            if(opbuscar ==1 && valor!=null){
                codsql = "select*from USUARIOS  where dni_usuario='"+valor+"'";
                
            }else {
                if(opbuscar==2 && valor !=null){
                    codsql = "select*from USUARIOS  where apellido='"+valor+"'";
                    
                }else {
                    codsql = "select*from USUARIOS  ";
                }
            }
        }
        
        String[] datos = new String[8];
        try {
            Statement leer= con.createStatement();
            ResultSet resultado = leer.executeQuery(codsql);
            
            while(resultado.next()){
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                datos[7] = resultado.getString(8);
                tusuario.addRow(datos);
            }
            tablausuario.setModel(tusuario);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "Error en la Consula");
            
        }
    }
    public void actualizardatos(){
        int fila=tablausuario.getSelectedRow();
        int id=Integer.parseInt(this.tablausuario.getValueAt(fila, 0).toString());
        String usuario = tablausuario.getValueAt(fila, 1).toString();
        String contraseña = tablausuario.getValueAt(fila, 2).toString();
        String correo = tablausuario.getValueAt(fila, 3).toString();
        String nombre = tablausuario.getValueAt(fila, 4).toString();
        String apellido = tablausuario.getValueAt(fila, 5).toString();
        String telefono = tablausuario.getValueAt(fila, 6).toString();
        int perfil=Integer.parseInt(tablausuario.getValueAt(fila, 7).toString());
        try {
            PreparedStatement actua=con.prepareStatement("UPDATE USUARIOS SET usuario='"+usuario+"',contrasena='"+contraseña+"',correo='"+correo+"', nombre='"+nombre+"',apellido='"+apellido+"',telefono='"+telefono+"',id_perfil='"+perfil+"' WHERE dni_usuario='"+id+"'");
            actua.executeUpdate();
            mostrarDatosUsuarios(0,null);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "No se actualizo nada");
        }
        
    }
    public void eliminarusuario(){
            int fila = tablausuario.getSelectedRow();
            String valor =tablausuario.getValueAt(fila, 0).toString();
            try {
                    if(JOptionPane.showConfirmDialog(null, "Se eliminará el registro, ¿desea continuar?") == JOptionPane.YES_OPTION){
                    PreparedStatement elim=con.prepareStatement("delete from USUARIOS where dni_usuario='"+valor+"'");
                    elim.executeUpdate();
                    mostrarDatosUsuarios(0,null);
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "No se elimino nada");
        }
            
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtnactualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuario = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jcbxOpcion = new javax.swing.JComboBox<>();
        campoBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ELIMINAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbtnactualizar.setText("Actualizar datos");
        jbtnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnactualizarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tablausuario);

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por :"));

        jcbxOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar todos", "Codigo", "Apellido", " " }));

        campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoBuscarKeyReleased(evt);
            }
        });

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
                .addGap(20, 20, 20)
                .addComponent(jcbxOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbxOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)
                        .addGap(113, 113, 113)
                        .addComponent(jButton2)
                        .addGap(123, 123, 123)
                        .addComponent(jbtnactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jbtnactualizar)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        UsuarioController.Ocultar();
        PrincipalController.Mostrar();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PrincipalController.botonNuevoUsuario();
        UsuarioController.Ocultar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        int opcion= jcbxOpcion.getSelectedIndex();
        String valorbus= campoBuscar.getText();
        mostrarDatosUsuarios(opcion,valorbus);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jbtnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnactualizarActionPerformed
        // TODO add your handling code here:
        actualizardatos();
    }//GEN-LAST:event_jbtnactualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        eliminarusuario();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void campoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyReleased
//        TableRowSorter<DefaultTableModel> Sorter;
//        Sorter = new TableRowSorter<>(tusuario);
//        tablausuario.setRowSorter(Sorter);
//        Sorter.setRowFilter(RowFilter.regexFilter(campoBuscar.getText(),jcbxOpcion.getSelectedIndex()));
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
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnactualizar;
    private javax.swing.JComboBox<String> jcbxOpcion;
    private javax.swing.JTable tablausuario;
    // End of variables declaration//GEN-END:variables
}
