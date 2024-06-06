/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Logica.Idioma;
import Logica.Usuarios;
import java.awt.Color;
/**
 * Cambia el PIN 
 * 
 */
public class CambioPin extends javax.swing.JFrame {

    private Menu m;
    public CambioPin() {
        initComponents();
        this.setLocationRelativeTo(null);
                Idioma I = new Idioma();
        String direccion = "C:\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Idiomas\\Estado.txt");
        Aceptar.setText(I.leerFila(10,direccion));
        Cancelar.setText(I.leerFila(11,direccion));
        Salir.setText(I.leerFila(13,direccion));
        Subtitulo1.setText(I.leerFila(45,direccion));
        CL1.setText(I.leerFila(75,direccion)+":");
        CL2.setText(I.leerFila(76,direccion)+":");
        CL3.setText(I.leerFila(77,direccion)+":");
        Mensaje.setText(I.leerFila(78,direccion));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CL3 = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        Cancelar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Panel01 = new javax.swing.JPanel();
        Aceptar = new javax.swing.JLabel();
        CL2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        CL1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Subtitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 239, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CL3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        CL3.setForeground(new java.awt.Color(255, 255, 255));
        CL3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CL3.setText("Reingrese la nueva clave");
        jPanel1.add(CL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 640, 50));

        Mensaje.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mensaje.setText("Tape el teclado mientras digite su clave");
        jPanel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 1200, 70));

        Panel3.setBackground(new java.awt.Color(115, 115, 115));

        Salir.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir.setText("Salir");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, 240, 70));

        Panel4.setBackground(new java.awt.Color(255, 0, 0));

        Cancelar.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancelar.setText("Cancelar");
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 240, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, -350, 350, 540));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 340, 50));

        Panel01.setBackground(new java.awt.Color(0, 139, 43));

        Aceptar.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        Aceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aceptar.setText("Aceptar");
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AceptarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel01Layout = new javax.swing.GroupLayout(Panel01);
        Panel01.setLayout(Panel01Layout);
        Panel01Layout.setHorizontalGroup(
            Panel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel01Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel01Layout.setVerticalGroup(
            Panel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel01Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 240, 70));

        CL2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        CL2.setForeground(new java.awt.Color(255, 255, 255));
        CL2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CL2.setText("Ingrese su clave nueva");
        jPanel1.add(CL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 640, 50));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 340, 50));

        CL1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        CL1.setForeground(new java.awt.Color(255, 255, 255));
        CL1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CL1.setText("Ingrese su clave actual");
        jPanel1.add(CL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 640, 50));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 340, 50));

        Subtitulo1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        Subtitulo1.setForeground(new java.awt.Color(255, 255, 255));
        Subtitulo1.setText("Cambio de Pin");
        jPanel1.add(Subtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 550, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setMenu(Menu m){
        this.m = m;
    }
    
    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        Inicio a = new Inicio();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Panel3.setBackground(new Color(75,75,75));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Panel3.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_SalirMouseExited

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelarMouseClicked

    private void CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseEntered
        Panel4.setBackground(new Color(150,0,0));
    }//GEN-LAST:event_CancelarMouseEntered

    private void CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseExited
        Panel4.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_CancelarMouseExited

    private void AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseClicked
        ConfirmCambioPin a = new ConfirmCambioPin();
        Usuarios u = new Usuarios();
        String idUsuario = u.IdCuenta();
        String pinActual = jTextField3.getText();
        String pinNuevo = jTextField2.getText();
        String pinConfirmacion = jTextField1.getText();
        if (pinActual.isEmpty() ||pinNuevo.isEmpty() || pinConfirmacion.isEmpty()) {
            Mensaje.setText("Complete todos los campos");
           // return;
        }else if((jTextField1.getText()).equals(jTextField2.getText())){
        if(u.cambiarPin(idUsuario, pinActual, pinNuevo, pinConfirmacion)){
          a.setVisible(true);
          a.setMenu(m);
          dispose(); 
        }else Mensaje.setText("PIN actual incorrecto");
        }else{
            Mensaje.setText("El PIN nuevo y la confirmacion no son iguales ");
        }
            
    }//GEN-LAST:event_AceptarMouseClicked

    private void AceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseEntered
        Panel01.setBackground(new Color(0,100,20));
    }//GEN-LAST:event_AceptarMouseEntered

    private void AceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseExited
        Panel01.setBackground(new Color(0,139,43));
    }//GEN-LAST:event_AceptarMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(CambioPin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioPin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioPin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioPin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new CambioPin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aceptar;
    private javax.swing.JLabel CL1;
    private javax.swing.JLabel CL2;
    private javax.swing.JLabel CL3;
    private javax.swing.JLabel Cancelar;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JPanel Panel01;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel Subtitulo1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
