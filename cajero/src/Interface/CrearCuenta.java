/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Logica.Idioma;
import Logica.Registros;
import Logica.Usuarios;
import java.awt.Color;

/**
 * eleccionas el tipo de cuenta que quieres crear si es principal o subcuenta
 * @author jhona
 */
public class CrearCuenta extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    String ruta = "C:\\Archivos gestor\\Cuentas\\";
    public CrearCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        Idioma I = new Idioma();
        String direccion = "C:\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Idiomas\\Estado.txt");
        SubTitulo1.setText(I.leerFila(7,direccion));
        Boton1.setText(I.leerFila(8,direccion));
        Boton2.setText(I.leerFila(9,direccion));
        Salir.setText(I.leerFila(13,direccion));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SubTitulo1 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        Boton1 = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        Boton2 = new javax.swing.JLabel();
        Panel04 = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 239, 82));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 675));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubTitulo1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubTitulo1.setText("Seleccione tipo de cuenta que desea crear");
        jPanel1.add(SubTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1200, -1));

        Panel1.setBackground(new java.awt.Color(0, 205, 57));

        Boton1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Boton1.setForeground(new java.awt.Color(255, 255, 255));
        Boton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton1.setText("Cuenta principal");
        Boton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boton1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boton1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 350, 70));

        Panel5.setBackground(new java.awt.Color(0, 205, 57));

        Boton2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Boton2.setForeground(new java.awt.Color(255, 255, 255));
        Boton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton2.setText("Sub cuenta");
        Boton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Boton2MouseDragged(evt);
            }
        });
        Boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 350, 70));

        Panel04.setBackground(new java.awt.Color(115, 115, 115));

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

        javax.swing.GroupLayout Panel04Layout = new javax.swing.GroupLayout(Panel04);
        Panel04.setLayout(Panel04Layout);
        Panel04Layout.setHorizontalGroup(
            Panel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel04Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel04Layout.setVerticalGroup(
            Panel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel04Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel04, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 240, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton1MouseEntered
        Panel1.setBackground(new Color(0,139,43));
    }//GEN-LAST:event_Boton1MouseEntered

    private void Boton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MouseEntered
        Panel5.setBackground(new Color(0,139,43));
    }//GEN-LAST:event_Boton2MouseEntered

    private void Boton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton1MouseExited
        Panel1.setBackground(new Color(0,205,57));
    }//GEN-LAST:event_Boton1MouseExited

    private void Boton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MouseExited
        Panel5.setBackground(new Color(0,205,57));
    }//GEN-LAST:event_Boton2MouseExited

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        Inicio a = new Inicio();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Panel04.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Panel04.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_SalirMouseExited

    private void Boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton1MouseClicked
        CrearCuentaPrincipal a = new CrearCuentaPrincipal();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_Boton1MouseClicked

    private void Boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MouseClicked
        CrearSubCuenta a = new CrearSubCuenta();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_Boton2MouseClicked

    private void Boton2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MouseDragged
        
    }//GEN-LAST:event_Boton2MouseDragged

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
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boton1;
    private javax.swing.JLabel Boton2;
    private javax.swing.JPanel Panel04;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel5;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel SubTitulo1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
