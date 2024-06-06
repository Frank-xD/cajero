/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Logica.Idioma;
import Logica.Operaciones;
import java.awt.Color;
import java.io.File;

/**
 * ingresas el nro de cuenta a transsferir
 * @author Frank
 */
public class DeposTercero extends javax.swing.JFrame {

    String nro = "";
    Idioma I = new Idioma();
    String direccion = "C:\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Idiomas\\Estado.txt");
    private Menu m;    
    private String tipo;
    public DeposTercero() {
        initComponents();
        this.setLocationRelativeTo(null);
        aceptar.setText(I.leerFila(10,direccion));
        Atras.setText(I.leerFila(14,direccion));
        Titulo.setText(I.leerFila(56,direccion));
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setMenu(Menu m){
        this.m = m;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        Boton1 = new javax.swing.JPanel();
        Btn1 = new javax.swing.JLabel();
        Boton2 = new javax.swing.JPanel();
        Btn2 = new javax.swing.JLabel();
        Boton3 = new javax.swing.JPanel();
        Btn3 = new javax.swing.JLabel();
        Boton4 = new javax.swing.JPanel();
        Btn4 = new javax.swing.JLabel();
        Boton5 = new javax.swing.JPanel();
        Btn5 = new javax.swing.JLabel();
        Boton6 = new javax.swing.JPanel();
        Btn6 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JPanel();
        aceptar = new javax.swing.JLabel();
        Boton8 = new javax.swing.JPanel();
        Btn8 = new javax.swing.JLabel();
        Boton9 = new javax.swing.JPanel();
        Btn9 = new javax.swing.JLabel();
        Boton0 = new javax.swing.JPanel();
        Btn0 = new javax.swing.JLabel();
        Boton10 = new javax.swing.JPanel();
        Btn10 = new javax.swing.JLabel();
        Boton7 = new javax.swing.JPanel();
        Btn7 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JPanel();
        Atras = new javax.swing.JLabel();
        nrocuenta = new javax.swing.JPanel();
        NumCuenta = new javax.swing.JLabel();
        Boton11 = new javax.swing.JPanel();
        Btn11 = new javax.swing.JLabel();
        Fondo3 = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Panel1.setBackground(new java.awt.Color(21, 239, 82));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Ingrese la cuenta a la que desea depositar");
        Panel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1200, 160));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        Panel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, -220, -1, -1));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        Panel1.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 310, -1, -1));

        Boton1.setBackground(new java.awt.Color(115, 115, 115));

        Btn1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn1.setForeground(new java.awt.Color(255, 255, 255));
        Btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn1.setText("1");
        Btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Boton1Layout = new javax.swing.GroupLayout(Boton1);
        Boton1.setLayout(Boton1Layout);
        Boton1Layout.setHorizontalGroup(
            Boton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Boton1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Boton1Layout.setVerticalGroup(
            Boton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Boton1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Panel1.add(Boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 60, 60));

        Boton2.setBackground(new java.awt.Color(115, 115, 115));

        Btn2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn2.setForeground(new java.awt.Color(255, 255, 255));
        Btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn2.setText("2");
        Btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Boton2Layout = new javax.swing.GroupLayout(Boton2);
        Boton2.setLayout(Boton2Layout);
        Boton2Layout.setHorizontalGroup(
            Boton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        Boton2Layout.setVerticalGroup(
            Boton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Panel1.add(Boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 60, 60));

        Boton3.setBackground(new java.awt.Color(115, 115, 115));

        Btn3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn3.setForeground(new java.awt.Color(255, 255, 255));
        Btn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn3.setText("3");
        Btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Boton3Layout = new javax.swing.GroupLayout(Boton3);
        Boton3.setLayout(Boton3Layout);
        Boton3Layout.setHorizontalGroup(
            Boton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        Boton3Layout.setVerticalGroup(
            Boton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Panel1.add(Boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 60, 60));

        Boton4.setBackground(new java.awt.Color(115, 115, 115));

        Btn4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn4.setForeground(new java.awt.Color(255, 255, 255));
        Btn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn4.setText("4");
        Btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Boton4Layout = new javax.swing.GroupLayout(Boton4);
        Boton4.setLayout(Boton4Layout);
        Boton4Layout.setHorizontalGroup(
            Boton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        Boton4Layout.setVerticalGroup(
            Boton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Panel1.add(Boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 60, 60));

        Boton5.setBackground(new java.awt.Color(115, 115, 115));

        Btn5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn5.setForeground(new java.awt.Color(255, 255, 255));
        Btn5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn5.setText("5");
        Btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Boton5Layout = new javax.swing.GroupLayout(Boton5);
        Boton5.setLayout(Boton5Layout);
        Boton5Layout.setHorizontalGroup(
            Boton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        Boton5Layout.setVerticalGroup(
            Boton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Panel1.add(Boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 60, 60));

        Boton6.setBackground(new java.awt.Color(115, 115, 115));

        Btn6.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn6.setForeground(new java.awt.Color(255, 255, 255));
        Btn6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn6.setText("6");
        Btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Boton6Layout = new javax.swing.GroupLayout(Boton6);
        Boton6.setLayout(Boton6Layout);
        Boton6Layout.setHorizontalGroup(
            Boton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        Boton6Layout.setVerticalGroup(
            Boton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Panel1.add(Boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 60, 60));

        Aceptar.setBackground(new java.awt.Color(243, 214, 76));

        aceptar.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aceptar.setText("Aceptar");
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AceptarLayout = new javax.swing.GroupLayout(Aceptar);
        Aceptar.setLayout(AceptarLayout);
        AceptarLayout.setHorizontalGroup(
            AceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AceptarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AceptarLayout.setVerticalGroup(
            AceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Panel1.add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, 180, 60));

        Boton8.setBackground(new java.awt.Color(115, 115, 115));

        Btn8.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn8.setForeground(new java.awt.Color(255, 255, 255));
        Btn8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn8.setText("8");
        Btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Boton8Layout = new javax.swing.GroupLayout(Boton8);
        Boton8.setLayout(Boton8Layout);
        Boton8Layout.setHorizontalGroup(
            Boton8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        Boton8Layout.setVerticalGroup(
            Boton8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        Panel1.add(Boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, -1));

        Boton9.setBackground(new java.awt.Color(115, 115, 115));

        Btn9.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn9.setForeground(new java.awt.Color(255, 255, 255));
        Btn9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn9.setText("9");
        Btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Boton9Layout = new javax.swing.GroupLayout(Boton9);
        Boton9.setLayout(Boton9Layout);
        Boton9Layout.setHorizontalGroup(
            Boton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        Boton9Layout.setVerticalGroup(
            Boton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        Panel1.add(Boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, -1, -1));

        Boton0.setBackground(new java.awt.Color(115, 115, 115));

        Btn0.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn0.setForeground(new java.awt.Color(255, 255, 255));
        Btn0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn0.setText("0");
        Btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn0MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Boton0Layout = new javax.swing.GroupLayout(Boton0);
        Boton0.setLayout(Boton0Layout);
        Boton0Layout.setHorizontalGroup(
            Boton0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn0, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        Boton0Layout.setVerticalGroup(
            Boton0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn0, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        Panel1.add(Boton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, -1, -1));

        Boton10.setBackground(new java.awt.Color(255, 0, 0));

        Btn10.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn10.setForeground(new java.awt.Color(255, 255, 255));
        Btn10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn10.setText("←");
        Btn10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Boton10Layout = new javax.swing.GroupLayout(Boton10);
        Boton10.setLayout(Boton10Layout);
        Boton10Layout.setHorizontalGroup(
            Boton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Boton10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Boton10Layout.setVerticalGroup(
            Boton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Panel1.add(Boton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, -1, 60));

        Boton7.setBackground(new java.awt.Color(115, 115, 115));

        Btn7.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn7.setForeground(new java.awt.Color(255, 255, 255));
        Btn7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn7.setText("7");
        Btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Boton7Layout = new javax.swing.GroupLayout(Boton7);
        Boton7.setLayout(Boton7Layout);
        Boton7Layout.setHorizontalGroup(
            Boton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        Boton7Layout.setVerticalGroup(
            Boton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Panel1.add(Boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 60, 60));

        Cancelar.setBackground(new java.awt.Color(243, 214, 76));

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

        javax.swing.GroupLayout CancelarLayout = new javax.swing.GroupLayout(Cancelar);
        Cancelar.setLayout(CancelarLayout);
        CancelarLayout.setHorizontalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Atras, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        CancelarLayout.setVerticalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Atras, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Panel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, 180, -1));

        nrocuenta.setBackground(new java.awt.Color(255, 255, 255));

        NumCuenta.setBackground(new java.awt.Color(255, 255, 255));
        NumCuenta.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        NumCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumCuenta.setText(" ");
        NumCuenta.setOpaque(true);

        javax.swing.GroupLayout nrocuentaLayout = new javax.swing.GroupLayout(nrocuenta);
        nrocuenta.setLayout(nrocuentaLayout);
        nrocuentaLayout.setHorizontalGroup(
            nrocuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nrocuentaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nrocuentaLayout.setVerticalGroup(
            nrocuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nrocuentaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Panel1.add(nrocuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 660, 90));

        Boton11.setBackground(new java.awt.Color(255, 0, 0));

        Btn11.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn11.setForeground(new java.awt.Color(255, 255, 255));
        Btn11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn11.setText("x");
        Btn11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Boton11Layout = new javax.swing.GroupLayout(Boton11);
        Boton11.setLayout(Boton11Layout);
        Boton11Layout.setHorizontalGroup(
            Boton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Boton11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Boton11Layout.setVerticalGroup(
            Boton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton11Layout.createSequentialGroup()
                .addComponent(Btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        Panel1.add(Boton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, 60));

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        Panel1.add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -300, -1, -1));

        Mensaje.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 460, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseEntered
         Boton1.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_Btn1MouseEntered

    private void Btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseExited
        Boton1.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_Btn1MouseExited

    private void Btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseClicked
         if(NumCuenta.getText().length() <= 25){
            if((NumCuenta.getText().length() == 5 || NumCuenta.getText().length() == 12 || NumCuenta.getText().length() == 19 )) NumCuenta.setText(NumCuenta.getText() + " - ");
               NumCuenta.setText(NumCuenta.getText() + "2");  
               nro =nro +"2";
         }
    }//GEN-LAST:event_Btn2MouseClicked

    private void Btn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseEntered
       Boton3.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_Btn3MouseEntered

    private void Btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseEntered
        Boton2.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_Btn2MouseEntered

    private void Btn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn4MouseEntered
        Boton4.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_Btn4MouseEntered

    private void Btn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseEntered
        Boton5.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_Btn5MouseEntered

    private void Btn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn6MouseEntered
        Boton6.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_Btn6MouseEntered

    private void Btn7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn7MouseEntered
        Boton7.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_Btn7MouseEntered

    private void Btn8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn8MouseEntered
        Boton8.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_Btn8MouseEntered

    private void Btn9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn9MouseEntered
        Boton9.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_Btn9MouseEntered

    private void Btn0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn0MouseEntered
        Boton0.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_Btn0MouseEntered

    private void Btn10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn10MouseEntered
        Boton10.setBackground(new Color(150,0,0));
    }//GEN-LAST:event_Btn10MouseEntered

    private void Btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseExited
        Boton2.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_Btn2MouseExited

    private void Btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseExited
        Boton3.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_Btn3MouseExited

    private void Btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn4MouseExited
        Boton4.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_Btn4MouseExited

    private void Btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseExited
        Boton5.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_Btn5MouseExited

    private void Btn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn6MouseExited
        Boton6.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_Btn6MouseExited

    private void Btn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn7MouseExited
        Boton7.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_Btn7MouseExited

    private void Btn8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn8MouseExited
        Boton8.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_Btn8MouseExited

    private void Btn9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn9MouseExited
       Boton9.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_Btn9MouseExited

    private void Btn0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn0MouseExited
        Boton0.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_Btn0MouseExited

    private void Btn10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn10MouseExited
        Boton10.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_Btn10MouseExited

    private void aceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseEntered
        Aceptar.setBackground(new Color(220,190,45)); 
    }//GEN-LAST:event_aceptarMouseEntered

    private void aceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseExited
        Aceptar.setBackground(new Color(243,214,73));
    }//GEN-LAST:event_aceptarMouseExited

    private void AtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseEntered
        Cancelar.setBackground(new Color(220,190,45));
    }//GEN-LAST:event_AtrasMouseEntered

    private void AtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseExited
        Cancelar.setBackground(new Color(243,214,73));
    }//GEN-LAST:event_AtrasMouseExited

    
    
    private void Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseClicked
          if(NumCuenta.getText().length() <= 25){
            if((NumCuenta.getText().length() == 5 || NumCuenta.getText().length() == 12 || NumCuenta.getText().length() == 19 )) NumCuenta.setText(NumCuenta.getText() + " - ");
               NumCuenta.setText(NumCuenta.getText() + "1"); 
               nro =nro +"1";
         }
    }//GEN-LAST:event_Btn1MouseClicked

    private void Btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseClicked
         if(NumCuenta.getText().length() <= 25){
            if((NumCuenta.getText().length() == 5 || NumCuenta.getText().length() == 12 || NumCuenta.getText().length() == 19 )) NumCuenta.setText(NumCuenta.getText() + " - ");
               NumCuenta.setText(NumCuenta.getText() + "3");  
               nro =nro +"3";
         }
    }//GEN-LAST:event_Btn3MouseClicked

    private void Btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn4MouseClicked
         if(NumCuenta.getText().length() <= 25){
            if((NumCuenta.getText().length() == 5 || NumCuenta.getText().length() == 12 || NumCuenta.getText().length() == 19 )) NumCuenta.setText(NumCuenta.getText() + " - ");
               NumCuenta.setText(NumCuenta.getText() + "4");  
               nro =nro +"4";
         }
    }//GEN-LAST:event_Btn4MouseClicked

    private void Btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseClicked
         if(NumCuenta.getText().length() <= 25){
            if((NumCuenta.getText().length() == 5 || NumCuenta.getText().length() == 12 || NumCuenta.getText().length() == 19 )) NumCuenta.setText(NumCuenta.getText() + " - ");
               NumCuenta.setText(NumCuenta.getText() + "5");  
               nro =nro +"5";
         }
    }//GEN-LAST:event_Btn5MouseClicked

    private void Btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn6MouseClicked
         if(NumCuenta.getText().length() <= 25){
            if((NumCuenta.getText().length() == 5 || NumCuenta.getText().length() == 12 || NumCuenta.getText().length() == 19 )) NumCuenta.setText(NumCuenta.getText() + " - ");
               NumCuenta.setText(NumCuenta.getText() + "6");  
               nro =nro +"6";
         }
    }//GEN-LAST:event_Btn6MouseClicked

    private void Btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn7MouseClicked
         if(NumCuenta.getText().length() <= 25){
            if((NumCuenta.getText().length() == 5 || NumCuenta.getText().length() == 12 || NumCuenta.getText().length() == 19 )) NumCuenta.setText(NumCuenta.getText() + " - ");
               NumCuenta.setText(NumCuenta.getText() + "7"); 
               nro =nro +"7";
         }
    }//GEN-LAST:event_Btn7MouseClicked

    private void Btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn8MouseClicked
         if(NumCuenta.getText().length() <= 25){
            if((NumCuenta.getText().length() == 5 || NumCuenta.getText().length() == 12 || NumCuenta.getText().length() == 19 )) NumCuenta.setText(NumCuenta.getText() + " - ");
               NumCuenta.setText(NumCuenta.getText() + "8");
               nro =nro +"8";
         }
    }//GEN-LAST:event_Btn8MouseClicked

    private void Btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn9MouseClicked
         if(NumCuenta.getText().length() <= 25){
            if((NumCuenta.getText().length() == 5 || NumCuenta.getText().length() == 12 || NumCuenta.getText().length() == 19 )) NumCuenta.setText(NumCuenta.getText() + " - ");
               NumCuenta.setText(NumCuenta.getText() + "9");  
               nro =nro +"9";
         }
    }//GEN-LAST:event_Btn9MouseClicked

    private void Btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn0MouseClicked
         if(NumCuenta.getText().length() <= 25){
            if((NumCuenta.getText().length() == 5 || NumCuenta.getText().length() == 12 || NumCuenta.getText().length() == 19 )) NumCuenta.setText(NumCuenta.getText() + " - ");
               NumCuenta.setText(NumCuenta.getText() + "0");  
               nro =nro +"0";
         }
    }//GEN-LAST:event_Btn0MouseClicked

    private void Btn10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn10MouseClicked

        if(NumCuenta.getText().length()==9 || NumCuenta.getText().length()==16 ||
           NumCuenta.getText().length()==23 || NumCuenta.getText().length() <= 1)
           NumCuenta.setText(NumCuenta.getText().substring(0,NumCuenta.getText().length()-4));
        else NumCuenta.setText(NumCuenta.getText().substring(0,NumCuenta.getText().length()-1));
    }//GEN-LAST:event_Btn10MouseClicked

    private void Btn11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn11MouseClicked
       NumCuenta.setText(" ");
    }//GEN-LAST:event_Btn11MouseClicked

    private void Btn11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn11MouseEntered
       Boton11.setBackground(new Color(150,0,0));
    }//GEN-LAST:event_Btn11MouseEntered

    private void Btn11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn11MouseExited
        Boton11.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_Btn11MouseExited

    private void aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseClicked
        Operaciones o = new Operaciones();
        File archivoCuenta = o.buscarArchivoPorNumeroCuenta(nro);
        if (archivoCuenta != null) {
            CantidadDeposito a = new CantidadDeposito();
            a.setMenu(m);
            a.setVisible(true);
            a.setTipo(tipo, nro);
            dispose();
        } else {
            Mensaje.setText(I.leerFila(57, direccion));
        }
    }//GEN-LAST:event_aceptarMouseClicked

    private void AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseClicked
        Deposito a = new Deposito();
        a.setMenu(m);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasMouseClicked

    
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
            java.util.logging.Logger.getLogger(DeposTercero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeposTercero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeposTercero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeposTercero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeposTercero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aceptar;
    private javax.swing.JLabel Atras;
    private javax.swing.JPanel Boton0;
    private javax.swing.JPanel Boton1;
    private javax.swing.JPanel Boton10;
    private javax.swing.JPanel Boton11;
    private javax.swing.JPanel Boton2;
    private javax.swing.JPanel Boton3;
    private javax.swing.JPanel Boton4;
    private javax.swing.JPanel Boton5;
    private javax.swing.JPanel Boton6;
    private javax.swing.JPanel Boton7;
    private javax.swing.JPanel Boton8;
    private javax.swing.JPanel Boton9;
    private javax.swing.JLabel Btn0;
    private javax.swing.JLabel Btn1;
    private javax.swing.JLabel Btn10;
    private javax.swing.JLabel Btn11;
    private javax.swing.JLabel Btn2;
    private javax.swing.JLabel Btn3;
    private javax.swing.JLabel Btn4;
    private javax.swing.JLabel Btn5;
    private javax.swing.JLabel Btn6;
    private javax.swing.JLabel Btn7;
    private javax.swing.JLabel Btn8;
    private javax.swing.JLabel Btn9;
    private javax.swing.JPanel Cancelar;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel NumCuenta;
    private javax.swing.JPanel Panel1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel aceptar;
    private javax.swing.JPanel nrocuenta;
    // End of variables declaration//GEN-END:variables
}
