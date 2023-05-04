/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;



import compush.compushibernate.disp.Dispositivo;
import compush.compushibernate.disp.HistorialEstado;
import compush.compushibernate.seguridad.UserN;
import funciones.Ejecutor;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author Jairo
 */
public class VentanaEstDisp extends javax.swing.JFrame {

   
    private UserN usern;
    private SessionFactory sf;
    private int mouseX, mouseY;
    private ArrayList<Object[]> est;
    
    public VentanaEstDisp(UserN usern, SessionFactory sf) {
        setLookAndFeel();
        initComponents();
        this.usern = usern;
        this.sf = sf;
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
        recPanel = new javax.swing.JPanel();
        recLbl = new javax.swing.JLabel();
        msjLbl = new javax.swing.JLabel();
        bg2 = new javax.swing.JPanel();
        aceptarBtn = new javax.swing.JPanel();
        aceptarLbl = new javax.swing.JLabel();
        estDispLbl = new javax.swing.JLabel();
        estSP = new javax.swing.JScrollPane();
        estTab = new javax.swing.JTable();
        buscDispTxtBox = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JPanel();
        buscarLbl = new javax.swing.JLabel();
        fechTxtBox = new javax.swing.JTextField();

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

        msjLbl.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        msjLbl.setText("Estados Actualizados Exitosamente");

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msjLbl)
                .addGap(140, 140, 140)
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
                    .addComponent(recPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msjLbl, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        bg2.setBackground(new java.awt.Color(31, 31, 31));

        aceptarBtn.setBackground(new java.awt.Color(255, 255, 255));

        aceptarLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        aceptarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aceptarLbl.setText("Aceptar");
        aceptarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout aceptarBtnLayout = new javax.swing.GroupLayout(aceptarBtn);
        aceptarBtn.setLayout(aceptarBtnLayout);
        aceptarBtnLayout.setHorizontalGroup(
            aceptarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aceptarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        aceptarBtnLayout.setVerticalGroup(
            aceptarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aceptarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        estDispLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estDispLbl.setForeground(new java.awt.Color(255, 255, 255));
        estDispLbl.setText("ESTADO DE LOS DISPOSITIVOS:");

        estTab.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        estTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idDisp", "Estado", "fechEst"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        estTab.setFocusable(false);
        estTab.setGridColor(new java.awt.Color(167, 167, 167));
        estTab.setRowHeight(30);
        estTab.setSelectionBackground(new java.awt.Color(147, 147, 147));
        estTab.setSelectionForeground(new java.awt.Color(255, 255, 255));
        estTab.setShowHorizontalLines(true);
        estTab.getTableHeader().setReorderingAllowed(false);
        estSP.setViewportView(estTab);
        if (estTab.getColumnModel().getColumnCount() > 0) {
            estTab.getColumnModel().getColumn(0).setResizable(false);
            estTab.getColumnModel().getColumn(1).setResizable(false);
            estTab.getColumnModel().getColumn(2).setResizable(false);
        }

        buscDispTxtBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buscDispTxtBox.setForeground(new java.awt.Color(204, 204, 204));
        buscDispTxtBox.setText("Buscar Dispositivo");
        buscDispTxtBox.setBorder(null);
        buscDispTxtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buscDispTxtBoxFocusGained(evt);
            }
        });
        buscDispTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscDispTxtBoxActionPerformed(evt);
            }
        });

        buscarBtn.setBackground(new java.awt.Color(255, 255, 255));

        buscarLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        buscarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarLbl.setText("Buscar");
        buscarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buscarBtnLayout = new javax.swing.GroupLayout(buscarBtn);
        buscarBtn.setLayout(buscarBtnLayout);
        buscarBtnLayout.setHorizontalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        buscarBtnLayout.setVerticalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        fechTxtBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        fechTxtBox.setForeground(new java.awt.Color(204, 204, 204));
        fechTxtBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fechTxtBox.setText("AAAA-MM-DD");
        fechTxtBox.setBorder(null);
        fechTxtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fechTxtBoxFocusGained(evt);
            }
        });
        fechTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechTxtBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estDispLbl)
                    .addComponent(estSP, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addComponent(buscDispTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(fechTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aceptarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 31, Short.MAX_VALUE))
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(estDispLbl)
                .addGap(18, 18, 18)
                .addComponent(estSP, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(aceptarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscDispTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fechTxtBox))
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
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
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void aceptarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarLblMouseClicked
        int filas;
        
        HistorialEstado hist;
        Dispositivo disp;
        Date fech;
        Session s;
        
        
        filas = estTab.getRowCount();
        fech = Date.valueOf(fechTxtBox.getText());
        
        
        if(filas > 0){
            
            for(int i = 0 ; i < estTab.getRowCount() ; i++){
                disp = new Dispositivo();
                disp.setIdDisp(Integer.parseInt((String)estTab.getValueAt(i, 0)));
                
                hist = new HistorialEstado();
                hist.setDisp(disp);
                hist.setFechEst(fech);
                hist.setNomEst((String)estTab.getValueAt(i, 1));
                
                s   = sf.openSession();
                s.beginTransaction();
                s.save(hist);
                s.getTransaction().commit();
            }
            
            
            
            msjLbl.setVisible(true);
 
        }
        
    }//GEN-LAST:event_aceptarLblMouseClicked

    private void buscDispTxtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscDispTxtBoxFocusGained
        buscDispTxtBox.setForeground(Color.black);
    }//GEN-LAST:event_buscDispTxtBoxFocusGained

    private void buscDispTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscDispTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscDispTxtBoxActionPerformed

    private void buscarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLblMouseClicked
        estUnDisp();
    }//GEN-LAST:event_buscarLblMouseClicked

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

    private void fechTxtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechTxtBoxFocusGained
        fechTxtBox.setForeground(Color.black);
    }//GEN-LAST:event_fechTxtBoxFocusGained

    private void fechTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechTxtBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    private void setTable(){
        estTab.getTableHeader().setBackground(new Color(255,255,255));
        estTab.getTableHeader().setForeground(Color.BLACK);
        estTab.setRowHeight(30);
    }
    
    private void cargarVentana(){
        estTodosDisp();
        msjLbl.setVisible(false);
    }
        
    private void estTodosDisp(){
        
        est     = Ejecutor.getEstados(sf);
        cargarTabla(est);
        
    }
    
    private void estUnDisp(){
        ArrayList<Object[]> buscado;
        
        buscado = new ArrayList<>();
        
        for(Object[] o : est){
            if(((Integer)o[0]).equals(Integer.parseInt(buscDispTxtBox.getText()))){
                buscado.add(o);
                break;
            }
        }
        
        cargarTabla(buscado);
        
    }
    
    private void cargarTabla(ArrayList<Object[]> est){
        Object[]          fila;
        DefaultTableModel modelo;
        
        fila    = new Object[3];
        modelo  = (DefaultTableModel) estTab.getModel();
        modelo.setRowCount(0);
        
        if(est != null){
            for(Object[] o : est){
                fila[0] = o[0] + "";
                fila[1] = o[2] + "";
                fila[2] = o[1] + "";
                
                modelo.addRow(fila);
            }
        }
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
            java.util.logging.Logger.getLogger(VentanaEstDisp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEstDisp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEstDisp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEstDisp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aceptarBtn;
    private javax.swing.JLabel aceptarLbl;
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JTextField buscDispTxtBox;
    private javax.swing.JPanel buscarBtn;
    private javax.swing.JLabel buscarLbl;
    private javax.swing.JLabel estDispLbl;
    private javax.swing.JScrollPane estSP;
    private javax.swing.JTable estTab;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JTextField fechTxtBox;
    private javax.swing.JLabel msjLbl;
    private javax.swing.JLabel recLbl;
    private javax.swing.JPanel recPanel;
    // End of variables declaration//GEN-END:variables
}
