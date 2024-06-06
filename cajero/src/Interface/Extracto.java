/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;
import Logica.Idioma;
import java.awt.Color;
/**
 * seleccionas si quieres ver los ultimos movimientos 
 * @author Frank
 */
public class Extracto extends javax.swing.JFrame {

    private Menu a;
    public Extracto() {
        initComponents();
        this.setLocationRelativeTo(null);
        Idioma I = new Idioma();
        String direccion = "C:\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Idiomas\\Estado.txt");
        Cancelar.setText(I.leerFila(11, direccion));
        Salir.setText(I.leerFila(13, direccion));
        SubTitulo1.setText(I.leerFila(84, direccion));
        SubTitulo2.setText(I.leerFila(85, direccion));
        Boton1.setText(I.leerFila(86, direccion));
        //Boton2.setText(I.leerFila(0, direccion)); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SubTitulo2 = new javax.swing.JLabel();
        SubTitulo1 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        Boton1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        Boton2 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        Cancelar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 239, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubTitulo2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo2.setText("operacion que desea realizar ");
        jPanel1.add(SubTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 680, 70));

        SubTitulo1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo1.setText("Selecciona que tipo de ");
        jPanel1.add(SubTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 550, 70));

        Panel1.setBackground(new java.awt.Color(243, 214, 76));

        Boton1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Boton1.setForeground(new java.awt.Color(255, 255, 255));
        Boton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton1.setText("Ver ultimos movimientos");
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
            .addComponent(Boton1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 450, 70));

        Panel2.setBackground(new java.awt.Color(243, 214, 76));

        Boton2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Boton2.setForeground(new java.awt.Color(255, 255, 255));
        Boton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton2.setText("-----");
        Boton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boton2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 450, 70));

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
            .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 230, 70));

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
            .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(Panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 230, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, -240, 350, 540));

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

    public void setMenu(Menu a){
        this.a = a;
    }
    
    private void Boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton1MouseClicked
        DetallesExtracto d = new DetallesExtracto();
        d.setVisible(true);
        d.setMenu(a);
        dispose();
    }//GEN-LAST:event_Boton1MouseClicked

    private void Boton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton1MouseEntered
        Panel1.setBackground(new Color(210,180,23));
    }//GEN-LAST:event_Boton1MouseEntered

    private void Boton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton1MouseExited
        Panel1.setBackground(new Color(243,214,76));
    }//GEN-LAST:event_Boton1MouseExited

    private void Boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MouseClicked
       
    }//GEN-LAST:event_Boton2MouseClicked

    private void Boton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MouseEntered
        Panel2.setBackground(new Color(210,180,23));
    }//GEN-LAST:event_Boton2MouseEntered

    private void Boton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MouseExited
        Panel2.setBackground(new Color(243,214,76));
    }//GEN-LAST:event_Boton2MouseExited

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
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelarMouseClicked

    private void CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseEntered
        Panel4.setBackground(new Color(150,0,0));
    }//GEN-LAST:event_CancelarMouseEntered

    private void CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseExited
        Panel4.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_CancelarMouseExited

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
            java.util.logging.Logger.getLogger(Extracto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Extracto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Extracto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Extracto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Extracto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boton1;
    private javax.swing.JLabel Boton2;
    private javax.swing.JLabel Cancelar;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel SubTitulo1;
    private javax.swing.JLabel SubTitulo2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
