/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Logica.Idioma;
import Logica.Operaciones;
import Logica.Usuarios;
import java.awt.Color;
/**
 * Consultas el saldo actual
 * @author Frank
 */
public class DetallesSaldo extends javax.swing.JFrame {

    int num;
    private Menu a;
    public DetallesSaldo() {
        initComponents();
        this.setLocationRelativeTo(null);
        Idioma I = new Idioma();
        Usuarios u = new Usuarios();
        this.num = Integer.parseInt(u.rutaCuenta().substring(u.rutaCuenta().length()-5).substring(0,1));

        String direccion = "C:\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Idiomas\\Estado.txt");
        SubTitulo1.setText(I.leerFila(82, direccion));
        SubTitulo2.setText(I.leerFila(68, direccion));
        SubTitulo3.setText(I.leerFila(69, direccion));
        Menu.setText(I.leerFila(15, direccion));
        Salir.setText(I.leerFila(13, direccion));
        Cuenta.setText(I.leerFila(83,direccion) + " " + num);
        setTipoCuenta();
        if(this.num == 1)cambio.setText("USD.");
        if(this.num == 2)cambio.setText("BS.");
        if(this.num == 3)cambio.setText("EUR.");
        if(this.num == 4)cambio.setText("CNY."); 
    }

    public void setTipoCuenta(){
        Operaciones o = new Operaciones();
        Usuarios u = new Usuarios();
        Monto1.setText(o.SaldoActual(u.rutaCuenta()));  
    }
    
    public void setMenu(Menu a){
        this.a = a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SubTitulo1 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        Menu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cuenta = new javax.swing.JLabel();
        cambio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SubTitulo3 = new javax.swing.JLabel();
        SubTitulo2 = new javax.swing.JLabel();
        Monto1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 239, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubTitulo1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo1.setText("Saldo actual ");
        jPanel1.add(SubTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 700, 70));

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
            .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, 240, 70));

        Panel4.setBackground(new java.awt.Color(0, 139, 43));

        Menu.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu.setText("MENU");
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 240, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, -350, 350, 540));

        Cuenta.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        Cuenta.setForeground(new java.awt.Color(255, 255, 255));
        Cuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Cuenta.setText("Cuenta 1");
        jPanel1.add(Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 340, 50));

        cambio.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        cambio.setForeground(new java.awt.Color(255, 255, 255));
        cambio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cambio.setText("USD");
        jPanel1.add(cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 80, 50));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("_____________________________");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 500, 50));

        SubTitulo3.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubTitulo3.setText("nuestros servicios");
        jPanel1.add(SubTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1200, 70));

        SubTitulo2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubTitulo2.setText("Gracias por utilizar ");
        jPanel1.add(SubTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1200, 70));

        Monto1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        Monto1.setForeground(new java.awt.Color(255, 255, 255));
        Monto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Monto1.setText(" 5405.00 ");
        jPanel1.add(Monto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 240, 270, 50));

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

    private void MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseExited
        Panel4.setBackground(new Color(0,139,43));
    }//GEN-LAST:event_MenuMouseExited

    private void MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseEntered
        Panel4.setBackground(new Color(0,100,20));
    }//GEN-LAST:event_MenuMouseEntered

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuMouseClicked

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
            java.util.logging.Logger.getLogger(DetallesSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallesSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallesSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallesSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DetallesSaldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cuenta;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Monto1;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel SubTitulo1;
    private javax.swing.JLabel SubTitulo2;
    private javax.swing.JLabel SubTitulo3;
    private javax.swing.JLabel cambio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
