/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Logica.Idioma;
import Logica.Operaciones;
import Logica.Usuarios;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
/**
 * es el registro de todos los etratos realiados por el usuario
 * @author Frank
 */
public class DetallesExtracto extends javax.swing.JFrame {

    private Menu a;
    public DetallesExtracto() {
        initComponents();
        this.setLocationRelativeTo(null);
        Idioma I = new Idioma();
        Usuarios u = new Usuarios();
        Operaciones o = new Operaciones();
        String direccion = "C:\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Idiomas\\Estado.txt");
        Aceptar.setText(I.leerFila(15,direccion));
        Atras.setText(I.leerFila(14,direccion));
        Salir.setText(I.leerFila(13,direccion));
        SubTitulo.setText(I.leerFila(87,direccion));
        cargarUsuariosDesdeArchivo(u.rutaCuenta());
        dineros.setText(o.SaldoActual(u.rutaCuenta()));
        moneda.setText(o.MonedaCuenta(u.rutaCuenta()));
    }
    
    public void setMenu(Menu a){
        this.a = a;
    }

    public void cargarUsuariosDesdeArchivo(String rutaEntrada) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Borra todas las filas existentes antes de cargar los nuevos datos

    Usuarios u = new Usuarios();
    String id = u.IdCuenta();
    String rutaArchivo = "C:\\Archivos gestor\\Cuentas\\" + id + "\\registroActividades.txt";

    try (FileReader lector = new FileReader(rutaArchivo);
         BufferedReader br = new BufferedReader(lector)) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(";");
            // Asegúrate de que haya suficientes partes en la línea antes de agregar datos
            if (partes.length >= 4) { // Cambiado de 3 a 4
                // Filtra las líneas según el parámetro rutaEntrada
                if (rutaEntrada.equals(partes[3])) {
                    // Agrega los datos de la línea al modelo de tabla
                    model.addRow(new Object[]{partes[0], partes[1], partes[2]});
                }
            } else {
                // Si no hay suficientes partes, muestra un mensaje de advertencia
                System.out.println("La línea no tiene suficientes partes: " + linea);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SubTitulo = new javax.swing.JLabel();
        dineros = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        Aceptar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        Atras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        moneda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 239, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubTitulo.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo.setText("Ultimos movimientos");
        jPanel1.add(SubTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 620, 70));

        dineros.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        dineros.setForeground(new java.awt.Color(255, 255, 255));
        dineros.setText("10000");
        jPanel1.add(dineros, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 510, 40));

        saldo.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        saldo.setForeground(new java.awt.Color(255, 255, 255));
        saldo.setText("Saldo Total:");
        jPanel1.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 190, 40));

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

        jPanel1.add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, 240, 70));

        Panel4.setBackground(new java.awt.Color(0, 139, 43));

        Aceptar.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        Aceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aceptar.setText("Menu");
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

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 240, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, -290, 350, 540));

        Panel5.setBackground(new java.awt.Color(243, 214, 76));

        Atras.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Atras.setForeground(new java.awt.Color(255, 255, 255));
        Atras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Atras.setText("Atras");
        Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 240, 70));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Detalle", "Monto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 600, 280));

        moneda.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        moneda.setForeground(new java.awt.Color(255, 255, 255));
        moneda.setText("USD");
        jPanel1.add(moneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 60, 40));

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

    private void AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseClicked
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_AceptarMouseClicked

    private void AceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseEntered
        Panel4.setBackground(new Color(0,100,20));
    }//GEN-LAST:event_AceptarMouseEntered

    private void AceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseExited
        Panel4.setBackground(new Color(0,139,43));
    }//GEN-LAST:event_AceptarMouseExited

    private void AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseClicked
        Extracto e = new Extracto();
        e.setVisible(true);
        e.setMenu(a);
        dispose();
    }//GEN-LAST:event_AtrasMouseClicked

    private void AtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseEntered
        Panel5.setBackground(new Color(210,180,23));
    }//GEN-LAST:event_AtrasMouseEntered

    private void AtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseExited
        Panel5.setBackground(new Color(243,214,76));
    }//GEN-LAST:event_AtrasMouseExited

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
            java.util.logging.Logger.getLogger(DetallesExtracto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallesExtracto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallesExtracto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallesExtracto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DetallesExtracto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aceptar;
    private javax.swing.JLabel Atras;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel SubTitulo;
    private javax.swing.JLabel dineros;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel moneda;
    private javax.swing.JLabel saldo;
    // End of variables declaration//GEN-END:variables
}
