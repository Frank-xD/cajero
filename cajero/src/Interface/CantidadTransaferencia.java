/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;
import Logica.Idioma;
import java.awt.Color;
/**
 * Se ingresa la cantidad a transferir y el motivo de dicha transferencia
 * @author Frank
 */
public class CantidadTransaferencia extends javax.swing.JFrame {

    private String nro;
    private Menu m;
    public CantidadTransaferencia() {
        initComponents();
        this.setLocationRelativeTo(null);
        AreaText.setLineWrap(true);
        AreaText.setWrapStyleWord(true);
        Idioma I = new Idioma();
        String direccion = "C:\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Idiomas\\Estado.txt");
        Aceptar1.setText(I.leerFila(10,direccion));       
        Cancelar1.setText(I.leerFila(11,direccion));
        Correccion1.setText(I.leerFila(12,direccion));
        Salir1.setText(I.leerFila(13,direccion));
        SubTirulo1.setText(I.leerFila(89,direccion));
        SubTitulo2.setText(I.leerFila(90,direccion));
        SubTitulo3.setText(I.leerFila(91,direccion));
        SubTitulo4.setText(I.leerFila(92,direccion));
    }

    public void setNro(String nro){
        this.nro = nro;
    }
    
    public void setMenu(Menu m){
        this.m = m;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cant = new javax.swing.JTextField();
        Correccion = new javax.swing.JPanel();
        Correccion1 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JPanel();
        Aceptar1 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JPanel();
        Cancelar1 = new javax.swing.JLabel();
        Salir = new javax.swing.JPanel();
        Salir1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaText = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SubTitulo4 = new javax.swing.JLabel();
        SubTitulo3 = new javax.swing.JLabel();
        SubTitulo2 = new javax.swing.JLabel();
        SubTirulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 239, 82));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cant.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        Cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantActionPerformed(evt);
            }
        });
        jPanel1.add(Cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 600, -1));

        Correccion.setBackground(new java.awt.Color(245, 199, 0));

        Correccion1.setFont(new java.awt.Font("SansSerif", 1, 35)); // NOI18N
        Correccion1.setForeground(new java.awt.Color(255, 255, 255));
        Correccion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Correccion1.setText("Correccion");
        Correccion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Correccion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Correccion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Correccion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Correccion1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout CorreccionLayout = new javax.swing.GroupLayout(Correccion);
        Correccion.setLayout(CorreccionLayout);
        CorreccionLayout.setHorizontalGroup(
            CorreccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorreccionLayout.createSequentialGroup()
                .addComponent(Correccion1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CorreccionLayout.setVerticalGroup(
            CorreccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Correccion1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(Correccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 180, 60));

        Aceptar.setBackground(new java.awt.Color(0, 139, 43));

        Aceptar1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Aceptar1.setForeground(new java.awt.Color(255, 255, 255));
        Aceptar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aceptar1.setText("Aceptar");
        Aceptar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Aceptar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Aceptar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Aceptar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout AceptarLayout = new javax.swing.GroupLayout(Aceptar);
        Aceptar.setLayout(AceptarLayout);
        AceptarLayout.setHorizontalGroup(
            AceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AceptarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Aceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AceptarLayout.setVerticalGroup(
            AceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Aceptar1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 180, 60));

        Cancelar.setBackground(new java.awt.Color(255, 0, 0));

        Cancelar1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Cancelar1.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancelar1.setText("Cancelar");
        Cancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cancelar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cancelar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cancelar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout CancelarLayout = new javax.swing.GroupLayout(Cancelar);
        Cancelar.setLayout(CancelarLayout);
        CancelarLayout.setHorizontalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        CancelarLayout.setVerticalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, -1, -1));

        Salir.setBackground(new java.awt.Color(115, 115, 115));

        Salir1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Salir1.setForeground(new java.awt.Color(255, 255, 255));
        Salir1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir1.setText("Salir");
        Salir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Salir1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Salir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Salir1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout SalirLayout = new javax.swing.GroupLayout(Salir);
        Salir.setLayout(SalirLayout);
        SalirLayout.setHorizontalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SalirLayout.setVerticalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        AreaText.setColumns(20);
        AreaText.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        AreaText.setRows(5);
        jScrollPane2.setViewportView(AreaText);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 600, 130));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 370, 510, 530));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -130, 510, 530));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 510, 530));

        SubTitulo4.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        SubTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo4.setText("la transferencia");
        jPanel1.add(SubTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 810, 70));

        SubTitulo3.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        SubTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo3.setText("Ingrese el motivo de");
        jPanel1.add(SubTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 800, 70));

        SubTitulo2.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        SubTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo2.setText("de dinero a transferir");
        jPanel1.add(SubTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 790, 70));

        SubTirulo1.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        SubTirulo1.setForeground(new java.awt.Color(255, 255, 255));
        SubTirulo1.setText("Ingrese la cantidad");
        jPanel1.add(SubTirulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 810, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantActionPerformed
        
    }//GEN-LAST:event_CantActionPerformed

    private void Aceptar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Aceptar1MouseEntered
        Aceptar.setBackground(new Color(0,100,20));
    }//GEN-LAST:event_Aceptar1MouseEntered

    private void Correccion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Correccion1MouseEntered
        Correccion.setBackground(new Color(210,180,23));
    }//GEN-LAST:event_Correccion1MouseEntered

    private void Cancelar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancelar1MouseEntered
        Cancelar.setBackground(new Color(150,0,0));
    }//GEN-LAST:event_Cancelar1MouseEntered

    private void Salir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Salir1MouseEntered
       Salir.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_Salir1MouseEntered

    private void Aceptar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Aceptar1MouseExited
        Aceptar.setBackground(new Color(0,139,43));
    }//GEN-LAST:event_Aceptar1MouseExited

    private void Correccion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Correccion1MouseExited
        Correccion.setBackground(new Color(245,199,0));
    }//GEN-LAST:event_Correccion1MouseExited

    private void Cancelar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancelar1MouseExited
        Cancelar.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_Cancelar1MouseExited

    private void Salir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Salir1MouseExited
        Salir.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_Salir1MouseExited

    private void Salir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Salir1MouseClicked
        Inicio a = new Inicio();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_Salir1MouseClicked

    private void Aceptar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Aceptar1MouseClicked
       if(Cant.getText().isEmpty()&& AreaText.getText().isEmpty()){
           
       }else{
            DetallesTransferencia a = new DetallesTransferencia();
            a.setNro(nro, Cant.getText(), AreaText.getText());
            a.setMenu(m);
            a.setVisible(true);
            this.dispose();
       }
    }//GEN-LAST:event_Aceptar1MouseClicked

    private void Correccion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Correccion1MouseClicked
        transferencia a = new transferencia();
        a.setVisible(true);
        a.setMenu(m);
        this.dispose();
    }//GEN-LAST:event_Correccion1MouseClicked

    private void Cancelar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancelar1MouseClicked
        // TODO add your handling code here:
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_Cancelar1MouseClicked

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
            java.util.logging.Logger.getLogger(CantidadTransaferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CantidadTransaferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CantidadTransaferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CantidadTransaferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CantidadTransaferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aceptar;
    private javax.swing.JLabel Aceptar1;
    private javax.swing.JTextArea AreaText;
    private javax.swing.JPanel Cancelar;
    private javax.swing.JLabel Cancelar1;
    private javax.swing.JTextField Cant;
    private javax.swing.JPanel Correccion;
    private javax.swing.JLabel Correccion1;
    private javax.swing.JPanel Salir;
    private javax.swing.JLabel Salir1;
    private javax.swing.JLabel SubTirulo1;
    private javax.swing.JLabel SubTitulo2;
    private javax.swing.JLabel SubTitulo3;
    private javax.swing.JLabel SubTitulo4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
