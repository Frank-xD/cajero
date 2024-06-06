/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Logica.Idioma;
import java.awt.Color;

/**
 *Aqui inicia la interface grafica el cual usa todos los metodos de del paquete 
 * logica y tambien usa imagenes guardadas en el paquete PNG desde este punto 
 * todo lo que aga el usuario se guarda o modifica dependiendo la funcion que 
 * realice 
 */
public class Inicio extends javax.swing.JFrame {

    Idioma I = new Idioma();
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        I.guardarEnArchivo("Español.txt");
        String Direccion = "C:\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Idiomas\\Estado.txt");
        Titulo1.setText(I.leerFila(1,Direccion));
        Titulo2.setText(I.leerFila(2,Direccion));
        Titulo3.setText(I.leerFila(3,Direccion));
        crearCuenta.setText(I.leerFila(4,Direccion));
        Iniciar.setText(I.leerFila(5,Direccion));
        SinTarjeta.setText(I.leerFila(6,Direccion));
        
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo1 = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        Titulo3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Aceptar1 = new javax.swing.JPanel();
        Iniciar = new javax.swing.JLabel();
        Aceptar = new javax.swing.JPanel();
        SinTarjeta = new javax.swing.JLabel();
        crearCuenta = new javax.swing.JLabel();
        idiomas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 239, 82));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 675));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo1.setBackground(new java.awt.Color(243, 214, 76));
        Titulo1.setFont(new java.awt.Font("SansSerif", 1, 75)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(243, 214, 76));
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("Banco");
        jPanel1.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 390, -1));

        Titulo2.setFont(new java.awt.Font("SansSerif", 1, 70)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo2.setText("Bienvenido");
        jPanel1.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 390, -1));

        Titulo3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Titulo3.setForeground(new java.awt.Color(255, 255, 255));
        Titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo3.setText("Creando tu futuro");
        jPanel1.add(Titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 370, 60));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Null");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 390, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Null");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 330, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1)_1.png"))); // NOI18N
        jLabel6.setText("LOGO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 400, 320));

        Aceptar1.setBackground(new java.awt.Color(243, 214, 76));

        Iniciar.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Iniciar.setForeground(new java.awt.Color(255, 255, 255));
        Iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Iniciar.setText("Iniciar");
        Iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iniciar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                IniciarMouseDragged(evt);
            }
        });
        Iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IniciarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Aceptar1Layout = new javax.swing.GroupLayout(Aceptar1);
        Aceptar1.setLayout(Aceptar1Layout);
        Aceptar1Layout.setHorizontalGroup(
            Aceptar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Aceptar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Aceptar1Layout.setVerticalGroup(
            Aceptar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Aceptar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Aceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 240, 70));

        Aceptar.setBackground(new java.awt.Color(243, 214, 76));

        SinTarjeta.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        SinTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        SinTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SinTarjeta.setText("Sin tarjeta");
        SinTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SinTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SinTarjetaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SinTarjetaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SinTarjetaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AceptarLayout = new javax.swing.GroupLayout(Aceptar);
        Aceptar.setLayout(AceptarLayout);
        AceptarLayout.setHorizontalGroup(
            AceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AceptarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SinTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AceptarLayout.setVerticalGroup(
            AceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AceptarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SinTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 240, 70));

        crearCuenta.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        crearCuenta.setForeground(new java.awt.Color(204, 0, 204));
        crearCuenta.setText("Crear una Cuenta");
        crearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearCuentaMouseExited(evt);
            }
        });
        jPanel1.add(crearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, -1, 50));

        idiomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Ingles", "Chino" }));
        idiomas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                idiomasItemStateChanged(evt);
            }
        });
        jPanel1.add(idiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SinTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SinTarjetaMouseClicked
       SinTarjeta a = new SinTarjeta();
       a.setVisible(true);
       dispose();
    }//GEN-LAST:event_SinTarjetaMouseClicked

    private void SinTarjetaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SinTarjetaMouseEntered
        Aceptar.setBackground(new Color(220,190,45));
    }//GEN-LAST:event_SinTarjetaMouseEntered

    private void SinTarjetaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SinTarjetaMouseExited
        Aceptar.setBackground(new Color(243,214,73));
    }//GEN-LAST:event_SinTarjetaMouseExited

    private void IniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseClicked
        Login a = new Login();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_IniciarMouseClicked

    private void IniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseEntered
        Aceptar1.setBackground(new Color(220,190,45));
    }//GEN-LAST:event_IniciarMouseEntered

    private void IniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseExited
        Aceptar1.setBackground(new Color(243,214,73));
    }//GEN-LAST:event_IniciarMouseExited

    private void IniciarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseDragged
        
    }//GEN-LAST:event_IniciarMouseDragged

    private void crearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuentaMouseEntered
        // TODO add your handling code here:
        crearCuenta.setForeground(new Color(255,204,255));
    }//GEN-LAST:event_crearCuentaMouseEntered

    private void crearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuentaMouseExited
        // TODO add your handling code here:
        crearCuenta.setForeground(new Color(204,0,204));
    }//GEN-LAST:event_crearCuentaMouseExited

    private void crearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuentaMouseClicked
        CrearCuenta a = new CrearCuenta();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_crearCuentaMouseClicked

    private void idiomasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_idiomasItemStateChanged
        // TODO add your handling code here:
        String idioma = idiomas.getSelectedItem() + ".txt";
        I.guardarEnArchivo(idioma);
        String Direccion = "C:\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Idiomas\\Estado.txt");
        Titulo1.setText(I.leerFila(1,Direccion));
        Titulo2.setText(I.leerFila(2,Direccion));
        Titulo3.setText(I.leerFila(3,Direccion));
        crearCuenta.setText(I.leerFila(4,Direccion));
        Iniciar.setText(I.leerFila(5,Direccion));
        SinTarjeta.setText(I.leerFila(6,Direccion));
        repaint();
    }//GEN-LAST:event_idiomasItemStateChanged

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aceptar;
    private javax.swing.JPanel Aceptar1;
    private javax.swing.JLabel Iniciar;
    private javax.swing.JLabel SinTarjeta;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel crearCuenta;
    private javax.swing.JComboBox<String> idiomas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
