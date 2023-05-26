/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Modelo.Conexion;
import controlador.NuevoOdontologoController;
import controlador.OdontologoController;
import controlador.PrincipalController;
import org.jdesktop.swingx.JXDatePicker;
import controlador.RegistrarPersonalController;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;




/**
 *
 * @author User
 */
public class VentanaNuevoOdontologo extends javax.swing.JFrame {

    Connection con = Conexion.getConexion();
    public VentanaNuevoOdontologo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campodni = new javax.swing.JTextField();
        campoapell = new javax.swing.JTextField();
        camponomb = new javax.swing.JTextField();
        combogen = new javax.swing.JComboBox<>();
        campodirec = new javax.swing.JTextField();
        campocelular = new javax.swing.JTextField();
        campocorreo = new javax.swing.JTextField();
        campoprov = new javax.swing.JTextField();
        campociudad = new javax.swing.JTextField();
        botonguardar = new javax.swing.JButton();
        jbtn_cancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jbtn_salir = new javax.swing.JButton();
        campofech = new org.jdesktop.swingx.JXDatePicker();
        comboturno = new javax.swing.JComboBox<>();
        fechachoose = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI: ");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Genero:");

        jLabel5.setText("Provincia:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Celular:");

        jLabel8.setText("Correo:");

        jLabel9.setText("Fecha de Nacimiento:");

        jLabel10.setText("Ciudad:");

        camponomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponombActionPerformed(evt);
            }
        });

        combogen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        botonguardar.setText("Guardar");
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });

        jbtn_cancelar.setText("Cancelar");

        jLabel11.setText("Turno:");

        jbtn_salir.setText("salir");
        jbtn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_salirActionPerformed(evt);
            }
        });

        comboturno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana", "Tarde", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(botonguardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(35, 35, 35)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)))
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoprov, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoapell, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campodni, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combogen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(jbtn_cancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campodirec, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(campocelular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campocorreo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(camponomb, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campociudad, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jbtn_salir)
                            .addGap(62, 62, 62)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campofech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechachoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campodni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtn_salir)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(campoapell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(combogen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campofech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(campoprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campociudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campodirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(comboturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campocelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechachoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonguardar)
                    .addComponent(jbtn_cancelar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void camponombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponombActionPerformed

    private void jbtn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_salirActionPerformed
        // TODO add your handling code here:
         
         NuevoOdontologoController.Ocultar();
         OdontologoController.Mostrar();
    }//GEN-LAST:event_jbtn_salirActionPerformed

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed
        
//       String nombre=jtxt_nombre.getText();
//        String apellido=jtxt_apellidos.getText();
//        String provincia=jtxt_provincia.getText();
//        String direccion=jtxt_direccion.getText();
//        String cuidad=jtxt_ciudad.getText();
//       String correo=jtxt_correo.getText();
//       int dni_dentista= Integer.parseInt(jtxt_dnidentista.getText());
//        int celular= Integer.parseInt(jtxt_celular.getText());
             
             
          try {
            PreparedStatement guardarOdontologo = con.prepareStatement("INSERT INTO ODONTOLOGOS(dni_odontologo, nombre, apellido, telefono, correo,turno,genero,provincia,direccion,fecha_nacimiento,ciudad) values(?,?,?,?,?,?,?,?,?,?,?)");
            guardarOdontologo.setString(1,campodni.getText() );
            guardarOdontologo.setString(2,camponomb.getText() );
            guardarOdontologo.setString(3,campoapell.getText() );
            guardarOdontologo.setString(4,campocelular.getText() );
            guardarOdontologo.setString(5,campocorreo.getText() );
            guardarOdontologo.setString(6,comboturno.getSelectedItem().toString());
            guardarOdontologo.setString(7,combogen.getSelectedItem().toString());
            
            guardarOdontologo.setString(8,campoprov.getText() );
            guardarOdontologo.setString(9,campodirec.getText() );
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String date = sdf.format(txtfechanacimiento.getDate());
            guardarOdontologo.setString(10, sdf.format(fechachoose.getDate()));
            guardarOdontologo.setString(11,campociudad.getText() );
            guardarOdontologo.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+ "No se guardo ");
        }

    }//GEN-LAST:event_botonguardarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaNuevoOdontologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaNuevoOdontologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaNuevoOdontologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaNuevoOdontologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaNuevoOdontologo().setVisible(true);
            }
        });
    }

    public JButton getJbtn_cancelar() {
        return jbtn_cancelar;
    }

    public JButton getJbtn_guardar() {
        return botonguardar;
    }

    public JButton getJbtn_salir() {
        return jbtn_salir;
    }

    public JComboBox<String> getJcbx_genero() {
        return combogen;
    }

    public JComboBox<String> getJcbx_turno() {
        return comboturno;
    }

    public JTextField getJtxt_apellidos() {
        return campoapell;
    }

    public JTextField getJtxt_celular() {
        return campocelular;
    }

    public JTextField getJtxt_ciudad() {
        return campociudad;
    }

    public JTextField getJtxt_correo() {
        return campocorreo;
    }

    public JTextField getJtxt_direccion() {
        return campodirec;
    }

    public JTextField getJtxt_dnidentista() {
        return campodni;
    }

    public JTextField getJtxt_nombre() {
        return camponomb;
    }

    public JTextField getJtxt_provincia() {
        return campoprov;
    }

    public JXDatePicker getJxdate_fechaNacimient() {
        return campofech;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonguardar;
    private javax.swing.JTextField campoapell;
    private javax.swing.JTextField campocelular;
    private javax.swing.JTextField campociudad;
    private javax.swing.JTextField campocorreo;
    private javax.swing.JTextField campodirec;
    private javax.swing.JTextField campodni;
    private org.jdesktop.swingx.JXDatePicker campofech;
    private javax.swing.JTextField camponomb;
    private javax.swing.JTextField campoprov;
    private javax.swing.JComboBox<String> combogen;
    private javax.swing.JComboBox<String> comboturno;
    private com.toedter.calendar.JDateChooser fechachoose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JButton jbtn_salir;
    // End of variables declaration//GEN-END:variables
}
