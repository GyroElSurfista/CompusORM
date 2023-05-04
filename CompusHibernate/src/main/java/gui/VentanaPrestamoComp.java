/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;




import compush.compushibernate.disp.Computadora;
import compush.compushibernate.disp.Dispositivo;
import compush.compushibernate.ops.Alquiler;
import compush.compushibernate.ops.Prestamo;
import compush.compushibernate.reg.Bitacora;
import compush.compushibernate.seguridad.UserN;
import funciones.Ejecutor;
import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author Jairo
 */
public class VentanaPrestamoComp extends javax.swing.JFrame {

   
    private UserN usern;
    private SessionFactory sf;
    private int mouseX, mouseY;
    
    public VentanaPrestamoComp(UserN usern, SessionFactory sf) {
        setLookAndFeel();
        initComponents();
        this.usern = usern;
        this.sf = sf;
        msjLbl.setVisible(false);
        setTable();
        cargarVentana();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bar = new javax.swing.JPanel();
        exitB = new javax.swing.JPanel();
        exitLbl = new javax.swing.JLabel();
        msjLbl = new javax.swing.JLabel();
        recPanel = new javax.swing.JPanel();
        recLbl = new javax.swing.JLabel();
        bg2 = new javax.swing.JPanel();
        selecBtn = new javax.swing.JPanel();
        selecLbl = new javax.swing.JLabel();
        prestBtn = new javax.swing.JPanel();
        prestLbl = new javax.swing.JLabel();
        fechIniLbl = new javax.swing.JLabel();
        fechFinLbl = new javax.swing.JLabel();
        selecsLbl = new javax.swing.JLabel();
        dispLbl = new javax.swing.JLabel();
        dispSP = new javax.swing.JScrollPane();
        dispTab = new javax.swing.JTable();
        selecSP = new javax.swing.JScrollPane();
        selecTab = new javax.swing.JTable();
        fechFinTxtBox = new javax.swing.JTextField();
        fechIniTxtBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(237, 241, 214));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.setPreferredSize(new java.awt.Dimension(737, 467));

        bar.setBackground(new java.awt.Color(237, 241, 214));
        bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barMouseDragged(evt);
            }
        });
        bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barMousePressed(evt);
            }
        });

        exitB.setBackground(new java.awt.Color(237, 241, 214));
        exitB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBMouseExited(evt);
            }
        });

        exitLbl.setBackground(new java.awt.Color(237, 241, 214));
        exitLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        exitLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLbl.setText("X");
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBLayout = new javax.swing.GroupLayout(exitB);
        exitB.setLayout(exitBLayout);
        exitBLayout.setHorizontalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBLayout.setVerticalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        msjLbl.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        msjLbl.setText("Préstamo exitoso");
        msjLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                msjLblMouseMoved(evt);
            }
        });

        recPanel.setBackground(new java.awt.Color(237, 241, 214));
        recPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recPanelMouseExited(evt);
            }
        });

        recLbl.setBackground(new java.awt.Color(237, 241, 214));
        recLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        recLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recLbl.setText("R");
        recLbl.setToolTipText("");
        recLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout recPanelLayout = new javax.swing.GroupLayout(recPanel);
        recPanel.setLayout(recPanelLayout);
        recPanelLayout.setHorizontalGroup(
            recPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        recPanelLayout.setVerticalGroup(
            recPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msjLbl)
                .addGap(221, 221, 221)
                .addComponent(recPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msjLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(recPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bg2.setBackground(new java.awt.Color(31, 31, 31));

        selecBtn.setBackground(new java.awt.Color(255, 255, 255));

        selecLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        selecLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selecLbl.setText("Seleccionar");
        selecLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout selecBtnLayout = new javax.swing.GroupLayout(selecBtn);
        selecBtn.setLayout(selecBtnLayout);
        selecBtnLayout.setHorizontalGroup(
            selecBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selecLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        selecBtnLayout.setVerticalGroup(
            selecBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selecLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        prestBtn.setBackground(new java.awt.Color(255, 255, 255));

        prestLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        prestLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prestLbl.setText("Prestar");
        prestLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prestLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout prestBtnLayout = new javax.swing.GroupLayout(prestBtn);
        prestBtn.setLayout(prestBtnLayout);
        prestBtnLayout.setHorizontalGroup(
            prestBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prestLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        prestBtnLayout.setVerticalGroup(
            prestBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prestLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        fechIniLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        fechIniLbl.setForeground(new java.awt.Color(255, 255, 255));
        fechIniLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fechIniLbl.setText("Fecha Inicial:");
        fechIniLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fechIniLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechIniLblMouseClicked(evt);
            }
        });

        fechFinLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        fechFinLbl.setForeground(new java.awt.Color(255, 255, 255));
        fechFinLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fechFinLbl.setText("Fecha Final:");
        fechFinLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fechFinLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechFinLblMouseClicked(evt);
            }
        });

        selecsLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selecsLbl.setForeground(new java.awt.Color(255, 255, 255));
        selecsLbl.setText("COMPUTADORAS SELECCIONADAS:");

        dispLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dispLbl.setForeground(new java.awt.Color(255, 255, 255));
        dispLbl.setText("COMPUTADORAS DISPONIBLES:");

        dispTab.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        dispTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdCompu", "RAM", "Capacidad", "idDocente", "Docente", "fechIni", "fechFin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dispTab.setFocusable(false);
        dispTab.setGridColor(new java.awt.Color(167, 167, 167));
        dispTab.setRowHeight(30);
        dispTab.setSelectionBackground(new java.awt.Color(147, 147, 147));
        dispTab.setSelectionForeground(new java.awt.Color(255, 255, 255));
        dispTab.setShowHorizontalLines(true);
        dispTab.getTableHeader().setReorderingAllowed(false);
        dispSP.setViewportView(dispTab);
        if (dispTab.getColumnModel().getColumnCount() > 0) {
            dispTab.getColumnModel().getColumn(0).setResizable(false);
            dispTab.getColumnModel().getColumn(1).setResizable(false);
            dispTab.getColumnModel().getColumn(2).setResizable(false);
            dispTab.getColumnModel().getColumn(3).setResizable(false);
            dispTab.getColumnModel().getColumn(4).setResizable(false);
            dispTab.getColumnModel().getColumn(5).setResizable(false);
        }

        selecTab.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        selecTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdCompu", "RAM", "Capacidad", "idDocente", "Docente", "fechIni", "fechFin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        selecTab.setFocusable(false);
        selecTab.setGridColor(new java.awt.Color(167, 167, 167));
        selecTab.setRowHeight(30);
        selecTab.setSelectionBackground(new java.awt.Color(147, 147, 147));
        selecTab.setSelectionForeground(new java.awt.Color(255, 255, 255));
        selecTab.setShowHorizontalLines(true);
        selecTab.getTableHeader().setReorderingAllowed(false);
        selecSP.setViewportView(selecTab);
        if (selecTab.getColumnModel().getColumnCount() > 0) {
            selecTab.getColumnModel().getColumn(0).setResizable(false);
            selecTab.getColumnModel().getColumn(1).setResizable(false);
            selecTab.getColumnModel().getColumn(2).setResizable(false);
            selecTab.getColumnModel().getColumn(3).setResizable(false);
            selecTab.getColumnModel().getColumn(4).setResizable(false);
            selecTab.getColumnModel().getColumn(5).setResizable(false);
        }

        fechFinTxtBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        fechFinTxtBox.setForeground(new java.awt.Color(204, 204, 204));
        fechFinTxtBox.setText("AAAA-MM-DD");
        fechFinTxtBox.setBorder(null);
        fechFinTxtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fechFinTxtBoxFocusGained(evt);
            }
        });
        fechFinTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechFinTxtBoxActionPerformed(evt);
            }
        });

        fechIniTxtBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        fechIniTxtBox.setForeground(new java.awt.Color(204, 204, 204));
        fechIniTxtBox.setText("AAAA-MM-DD");
        fechIniTxtBox.setBorder(null);
        fechIniTxtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fechIniTxtBoxFocusGained(evt);
            }
        });
        fechIniTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechIniTxtBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecSP, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selecsLbl)
                            .addComponent(dispLbl)
                            .addComponent(dispSP, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(prestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(bg2Layout.createSequentialGroup()
                                    .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(fechFinLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fechIniLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fechFinTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fechIniTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(2, 2, 2)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(dispLbl)
                .addGap(18, 18, 18)
                .addComponent(dispSP, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(selecsLbl)
                .addGap(18, 18, 18)
                .addComponent(selecSP, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechIniLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(fechIniTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechFinLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(fechFinTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(prestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barMousePressed

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX , y - mouseY );
    }//GEN-LAST:event_barMouseDragged

    private void exitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitLblMouseClicked

    private void exitLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseEntered
        exitB.setBackground(new Color(210, 51, 105));
    }//GEN-LAST:event_exitLblMouseEntered

    private void exitBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseExited
        exitB.setBackground(new Color(203, 182, 184));
    }//GEN-LAST:event_exitBMouseExited

    private void exitBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseEntered
        exitB.setBackground(new Color(210, 51, 105));
    }//GEN-LAST:event_exitBMouseEntered

    private void exitLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseExited
        exitB.setBackground(new Color(237,241,214));
    }//GEN-LAST:event_exitLblMouseExited

    private void prestLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestLblMouseClicked
        int filas;
        Date fechIni, fechFin;
        Dispositivo disp;
        Prestamo prest;
        Computadora comp;
        UserN prestador;
        Bitacora bit;
        UUID uuid;
        Session s;
        
        
        
        filas = selecTab.getRowCount();
        
        if(filas > 0){
            
            fechIni = Date.valueOf(fechIniTxtBox.getText());
            fechFin = Date.valueOf(fechFinTxtBox.getText());
            
            for(int i = 0; i < filas; i++){
                disp = new Dispositivo();
                disp.setIdDisp(Integer.parseInt((String)selecTab.getValueAt(i, 0)));

                comp = new Computadora();
                comp.setDisp(disp);
                
                prestador = new UserN();
                prestador.setIdUsrN(Integer.parseInt((String)selecTab.getValueAt(i, 3)));
                
                prest = new Prestamo();
                uuid = UUID.randomUUID();
                prest.setIdPrest(uuid.toString());
                prest.setCompu(comp);
                prest.setPresta(prestador);
                prest.setSePresta(usern);
                prest.setFechIniPrest(fechIni);
                prest.setFechFinPrest(fechFin);
                
                bit = new Bitacora();
                bit.setAccbit("INSERT");
                bit.setDatoNBit(prest.toString());
                bit.setDatoVBit("");
                bit.setFecAccBit(new java.util.Date());
                bit.setNomUsrBit(usern.getNomPUsrN());
                
                s = sf.openSession();
                s.beginTransaction();
                
                s.save(prest);
                s.save(bit);
                
                s.getTransaction().commit();
                
            }
            
            msjLbl.setVisible(true);
           
        }
    }//GEN-LAST:event_prestLblMouseClicked

    private void selecLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecLblMouseClicked

        int fil;
        Object[] nueva;
        DefaultTableModel modDisp, modSelec;
        
        fil = dispTab.getSelectedRow();
        if(fil >= 0){
            nueva = new Object[dispTab.getColumnCount()];
            
            for(int i = 0 ; i < dispTab.getColumnCount(); i++){
                nueva[i] = dispTab.getValueAt(fil, i);
            }
            
            modSelec = (DefaultTableModel)selecTab.getModel();
            modDisp  = (DefaultTableModel)dispTab.getModel();
            
            modSelec.addRow(nueva);
            modDisp.removeRow(fil);
            
        }
    }//GEN-LAST:event_selecLblMouseClicked

    private void fechIniLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechIniLblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fechIniLblMouseClicked

    private void fechFinLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechFinLblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fechFinLblMouseClicked

    private void fechFinTxtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechFinTxtBoxFocusGained
        fechFinTxtBox.setForeground(Color.black);
    }//GEN-LAST:event_fechFinTxtBoxFocusGained

    private void fechFinTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechFinTxtBoxActionPerformed

    }//GEN-LAST:event_fechFinTxtBoxActionPerformed

    private void fechIniTxtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechIniTxtBoxFocusGained
        fechIniTxtBox.setForeground(Color.black);
    }//GEN-LAST:event_fechIniTxtBoxFocusGained

    private void fechIniTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechIniTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechIniTxtBoxActionPerformed

    private void msjLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msjLblMouseMoved
        if(msjLbl.isVisible()){
            int segundos = 1; // Tiempo en segundos
            try {
                Thread.sleep(segundos * 1000); // El argumento se expresa en milisegundos, por lo que se multiplica por 1000
                msjLbl.setVisible(false);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }//GEN-LAST:event_msjLblMouseMoved

    private void recLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recLblMouseClicked
        cargarVentana();
    }//GEN-LAST:event_recLblMouseClicked

    private void recLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recLblMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_recLblMouseEntered

    private void recLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recLblMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_recLblMouseExited

    private void recPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_recPanelMouseEntered

    private void recPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recPanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_recPanelMouseExited

    /**
     * @param args the command line arguments
     */
    
    
    private void setTable(){
        dispTab.getTableHeader().setBackground(new Color(255,255,255));
        dispTab.getTableHeader().setForeground(Color.BLACK);
        dispTab.setRowHeight(30);
    }
    
    private ArrayList<Alquiler> getAlquiDispPrest(){
        ArrayList<Alquiler> alquiDisp;
        
        alquiDisp = Ejecutor.getAlquiDispPrest(sf);
        
        return alquiDisp;
    }
    
    private void setCompusDispPrest(){
        ArrayList<Alquiler> alquiDisp;
        DefaultTableModel modelo;
        Object[]          fila;
        
        alquiDisp = getAlquiDispPrest();
        modelo  = (DefaultTableModel) dispTab.getModel();
        
        modelo.setRowCount(0);
        
        for(Alquiler a : alquiDisp){
            fila    = new Object[7];
                
                fila[0] = a.getCompu().getDisp().getIdDisp()+ "";
                fila[1] = a.getCompu().getRamCompu()+ "";
                fila[2] = a.getCompu().getCapaCompu()+ "";
                fila[3] = a.getAlquilador().getIdUsrN()+ "";
                fila[4] = a.getAlquilador().getNomPUsrN()+ "";
                fila[5] = a.getFechIniAlqui() + "";
                fila[6] = a.getFechFinAlqui() + "";
                modelo.addRow(fila);
        }
    }
    
    private void clearCompusSelec(){
        DefaultTableModel modelo;
        modelo  = (DefaultTableModel) selecTab.getModel();
        modelo.setRowCount(0);
    }

    private void cargarVentana(){
        setTable();
        setCompusDispPrest();
        clearCompusSelec();
        msjLbl.setVisible(false);
    }
    
    private void setLookAndFeel(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrestamoComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrestamoComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrestamoComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrestamoComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JLabel dispLbl;
    private javax.swing.JScrollPane dispSP;
    private javax.swing.JTable dispTab;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel fechFinLbl;
    private javax.swing.JTextField fechFinTxtBox;
    private javax.swing.JLabel fechIniLbl;
    private javax.swing.JTextField fechIniTxtBox;
    private javax.swing.JLabel msjLbl;
    private javax.swing.JPanel prestBtn;
    private javax.swing.JLabel prestLbl;
    private javax.swing.JLabel recLbl;
    private javax.swing.JPanel recPanel;
    private javax.swing.JPanel selecBtn;
    private javax.swing.JLabel selecLbl;
    private javax.swing.JScrollPane selecSP;
    private javax.swing.JTable selecTab;
    private javax.swing.JLabel selecsLbl;
    // End of variables declaration//GEN-END:variables
}