/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;
import Logica.Idioma;
import Logica.Operaciones;
import Logica.Registros;
import Logica.Usuarios;
import java.awt.Color;
import java.io.File;
/**
 * Se muestran los detalles de la transferencia
 * @author Frank
 */
public class DetallesTransferencia extends javax.swing.JFrame {
    
    private String nro, cant, motivo;
    private Menu m;
    public DetallesTransferencia() {
        initComponents();
        this.setLocationRelativeTo(null);
        Idioma I = new Idioma();
        String direccion = "C:\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Idiomas\\Estado.txt");
        Mensaje.setText(I.leerFila(62, direccion));
        SubTitulo1.setText(I.leerFila(93, direccion));
        Detalle1.setText(I.leerFila(94, direccion));
        Detalle2.setText(I.leerFila(95, direccion));
        Detalle3.setText(I.leerFila(96, direccion));
        si.setText(I.leerFila(97, direccion));
        no.setText(I.leerFila(98, direccion));    
    }
    
    public void setMenu(Menu m){
        this.m = m;
    }
 
     public void setNro(String nro, String cant, String motivo){
        this.nro = nro;
        this.cant = cant;
        this.motivo = motivo;
        CT.setText(nro);
        Monto.setText(cant);
        Motivo.setText(motivo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SubTitulo1 = new javax.swing.JLabel();
        Detalle3 = new javax.swing.JLabel();
        Detalle1 = new javax.swing.JLabel();
        Detalle2 = new javax.swing.JLabel();
        CuenTra = new javax.swing.JPanel();
        CT = new javax.swing.JLabel();
        Detalle = new javax.swing.JPanel();
        Motivo = new javax.swing.JLabel();
        monto = new javax.swing.JPanel();
        Monto = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();
        No = new javax.swing.JPanel();
        no = new javax.swing.JLabel();
        SI = new javax.swing.JPanel();
        si = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 239, 82));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubTitulo1.setBackground(new java.awt.Color(21, 239, 82));
        SubTitulo1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SubTitulo1.setText("Detalles de transferencia");
        jPanel1.add(SubTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 790, 70));

        Detalle3.setBackground(new java.awt.Color(21, 239, 82));
        Detalle3.setFont(new java.awt.Font("SansSerif", 1, 38)); // NOI18N
        Detalle3.setForeground(new java.awt.Color(255, 255, 255));
        Detalle3.setText("Motivo de la transferiencia");
        jPanel1.add(Detalle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 530, 60));

        Detalle1.setBackground(new java.awt.Color(21, 239, 82));
        Detalle1.setFont(new java.awt.Font("SansSerif", 1, 38)); // NOI18N
        Detalle1.setForeground(new java.awt.Color(255, 255, 255));
        Detalle1.setText("Cuenta a transferir");
        jPanel1.add(Detalle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 530, 60));

        Detalle2.setBackground(new java.awt.Color(21, 239, 82));
        Detalle2.setFont(new java.awt.Font("SansSerif", 1, 38)); // NOI18N
        Detalle2.setForeground(new java.awt.Color(255, 255, 255));
        Detalle2.setText("Monto a transferir");
        jPanel1.add(Detalle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 530, 60));

        CuenTra.setBackground(new java.awt.Color(255, 255, 255));

        CT.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CT.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout CuenTraLayout = new javax.swing.GroupLayout(CuenTra);
        CuenTra.setLayout(CuenTraLayout);
        CuenTraLayout.setHorizontalGroup(
            CuenTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CT, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        CuenTraLayout.setVerticalGroup(
            CuenTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CT, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(CuenTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 470, 50));

        Detalle.setBackground(new java.awt.Color(255, 255, 255));

        Motivo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Motivo.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout DetalleLayout = new javax.swing.GroupLayout(Detalle);
        Detalle.setLayout(DetalleLayout);
        DetalleLayout.setHorizontalGroup(
            DetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Motivo, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        DetalleLayout.setVerticalGroup(
            DetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Motivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 470, 80));

        monto.setBackground(new java.awt.Color(255, 255, 255));

        Monto.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Monto.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout montoLayout = new javax.swing.GroupLayout(monto);
        monto.setLayout(montoLayout);
        montoLayout.setHorizontalGroup(
            montoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Monto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        montoLayout.setVerticalGroup(
            montoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Monto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 470, 50));

        Mensaje.setBackground(new java.awt.Color(21, 239, 82));
        Mensaje.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mensaje.setText("¿Esto es correcto?");
        jPanel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 1200, 60));

        No.setBackground(new java.awt.Color(243, 214, 76));

        no.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        no.setForeground(new java.awt.Color(255, 255, 255));
        no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        no.setText("NO");
        no.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                noMouseExited(evt);
            }
        });

        javax.swing.GroupLayout NoLayout = new javax.swing.GroupLayout(No);
        No.setLayout(NoLayout);
        NoLayout.setHorizontalGroup(
            NoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(no, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        NoLayout.setVerticalGroup(
            NoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(no))
        );

        jPanel1.add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 200, 70));

        SI.setBackground(new java.awt.Color(243, 214, 76));

        si.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        si.setForeground(new java.awt.Color(255, 255, 255));
        si.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        si.setText("SI");
        si.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                siMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                siMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SILayout = new javax.swing.GroupLayout(SI);
        SI.setLayout(SILayout);
        SILayout.setHorizontalGroup(
            SILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(si, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        SILayout.setVerticalGroup(
            SILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SILayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(si)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(SI, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 200, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 510, 530));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -130, 510, 530));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 510, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siMouseEntered
        SI.setBackground(new Color(220,190,45));
    }//GEN-LAST:event_siMouseEntered

    private void noMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseEntered
        No.setBackground(new Color(220,190,45));
    }//GEN-LAST:event_noMouseEntered

    private void siMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siMouseExited
        SI.setBackground(new Color(243,214,73));
    }//GEN-LAST:event_siMouseExited

    private void noMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseExited
        No.setBackground(new Color(243,214,73));
    }//GEN-LAST:event_noMouseExited

    private void noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseClicked
        transferencia a = new transferencia();
        a.setVisible(true);
        a.setMenu(m);
        dispose();
    }//GEN-LAST:event_noMouseClicked

    private void siMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siMouseClicked
        Operaciones o = new Operaciones();
        Registros r = new Registros();
        Usuarios u = new Usuarios();
        String id = u.IdCuenta();
        String cuentaActual = u.rutaCuenta();
        String monedaActual = o.MonedaCuenta(cuentaActual);
        double SaldoCuentaActual = Double.parseDouble(o.SaldoActual(cuentaActual));
        double monto = Double.parseDouble(cant);
        double montoRestante;
        if(SaldoCuentaActual>= monto){
            File archivoCuenta = o.buscarArchivoPorNumeroCuenta(nro);
            if (archivoCuenta != null) {
                String ruta = archivoCuenta.getAbsolutePath();
                String cuentat = "";
                String monedaDestino = o.MonedaCuenta(ruta);
                double SaldoActual = Double.parseDouble(o.SaldoActual(ruta));
                double nuevoSaldo;
                montoRestante = SaldoCuentaActual - monto;
                monto = o.convertirMoneda(monedaActual, monedaDestino, monto);
                nuevoSaldo = SaldoActual + monto;
                o.modificarSaldo(cuentaActual, Double.toString(montoRestante));
                r.guardarRegistroOperaciones("+"+Double.toString(monto), u.IdTransferenci(ruta), 4, ruta);
                r.guardarRegistroOperaciones("-"+cant, id, 4, cuentaActual);
                o.modificarSaldo(ruta, Double.toString(nuevoSaldo));
                System.out.println("Se encontró el archivo de cuenta: " + nuevoSaldo);
                ConfirmDeposito p = new ConfirmDeposito();
                p.setMenu(m);
                p.setVisible(true);
                this.dispose();
            } else {
                System.out.println("No se encontró ningún archivo de cuenta para el número proporcionado.");
            }
        } else{
            Mensaje.setText("No dispones de fondos suficientes");
            Mensaje.setForeground(Color.red);
        }
    }//GEN-LAST:event_siMouseClicked

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
            java.util.logging.Logger.getLogger(DetallesTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallesTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallesTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallesTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetallesTransferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CT;
    private javax.swing.JPanel CuenTra;
    private javax.swing.JPanel Detalle;
    private javax.swing.JLabel Detalle1;
    private javax.swing.JLabel Detalle2;
    private javax.swing.JLabel Detalle3;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel Monto;
    private javax.swing.JLabel Motivo;
    private javax.swing.JPanel No;
    private javax.swing.JPanel SI;
    private javax.swing.JLabel SubTitulo1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel monto;
    private javax.swing.JLabel no;
    private javax.swing.JLabel si;
    // End of variables declaration//GEN-END:variables
}
