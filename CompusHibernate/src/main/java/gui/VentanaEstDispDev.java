/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;




import compush.compushibernate.disp.Computadora;
import compush.compushibernate.disp.Dispositivo;
import compush.compushibernate.disp.HistorialEstado;
import compush.compushibernate.ops.Prestamo;
import compush.compushibernate.reg.Bitacora;
import compush.compushibernate.seguridad.UserN;
import funciones.Ejecutor;
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
public class VentanaEstDispDev extends javax.swing.JFrame {

   
    private UserN usern;
    private SessionFactory sf;
    private int[]  idComp, idDoc;
    private String[] idPrest, fechIniPrest, fechFinPrest;
    private Date fechAct; 
    VentanaDevPrestamo origen;
    private int mouseX, mouseY;
    
    public VentanaEstDispDev(UserN usern, SessionFactory sf, String[] idPrest, int[] idComp, int[] idDoc, String[] fechIniPrest, String[] fechFinPrest, Date fechAct, VentanaDevPrestamo origen) {
        setLookAndFeel();
        initComponents();
        this.usern = usern;
        this.sf = sf;
        this.idPrest = idPrest;
        this.idComp = idComp;
        this.idDoc = idDoc;
        this.fechIniPrest = fechIniPrest;
        this.fechFinPrest = fechFinPrest;
        this.fechAct = fechAct;
        this.origen = origen;
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
        bg2 = new javax.swing.JPanel();
        devBtn = new javax.swing.JPanel();
        devLbl = new javax.swing.JLabel();
        estDispLbl = new javax.swing.JLabel();
        estSP = new javax.swing.JScrollPane();
        estTab = new javax.swing.JTable();

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
        msjLbl.setText("Devolución Exitosa");
        msjLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                msjLblMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msjLbl)
                .addGap(255, 255, 255)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msjLbl, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        bg2.setBackground(new java.awt.Color(31, 31, 31));

        devBtn.setBackground(new java.awt.Color(255, 255, 255));

        devLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        devLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devLbl.setText("Devolver");
        devLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout devBtnLayout = new javax.swing.GroupLayout(devBtn);
        devBtn.setLayout(devBtnLayout);
        devBtnLayout.setHorizontalGroup(
            devBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(devLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        devBtnLayout.setVerticalGroup(
            devBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(devLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        estDispLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estDispLbl.setForeground(new java.awt.Color(255, 255, 255));
        estDispLbl.setText("ESTADO DE LOS DISPOSITIVOS DEVUELTOS:");

        estTab.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        estTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idDisp", "Estado", "FechEst"
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
                        .addGap(506, 506, 506)
                        .addComponent(devBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 31, Short.MAX_VALUE))
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(estDispLbl)
                .addGap(18, 18, 18)
                .addComponent(estSP, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(devBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void devLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devLblMouseClicked
        int filas;
        
        HistorialEstado hist;
        Dispositivo disp;
        Prestamo prestN, prestV;
        UserN presta;
        Computadora compu;
        Bitacora bit;
        Session s;
        
        
        filas = estTab.getRowCount();
        
        
        if(filas > 0){
            
            for(int i = 0 ; i < estTab.getRowCount() ; i++){
                disp = new Dispositivo();
                disp.setIdDisp(Integer.parseInt((String)estTab.getValueAt(i, 0)));
                
                hist = new HistorialEstado();
                hist.setDisp(disp);
                hist.setFechEst(fechAct);
                hist.setNomEst((String)estTab.getValueAt(i, 1));
                
                s   = sf.openSession();
                s.beginTransaction();
                s.save(hist);
                s.getTransaction().commit();
            }
            
            for(int i = 0 ; i < idComp.length ; i++){
                disp = new Dispositivo();
                disp.setIdDisp(idComp[i]);
                
                compu = new Computadora();
                compu.setDisp(disp);
                
                presta = new UserN();
                presta.setIdUsrN(idDoc[i]);
                
                prestN = new Prestamo();
                prestN.setIdPrest(idPrest[i]);
                prestN.setCompu(compu);
                prestN.setPresta(presta);
                prestN.setSePresta(usern);
                prestN.setFechIniPrest(Date.valueOf(fechIniPrest[i]));
                prestN.setFechFinPrest(Date.valueOf(fechFinPrest[i]));
                prestN.setFechDevPrest(fechAct);
                
                prestV = new Prestamo();
                prestV.setIdPrest(idPrest[i]);
                prestV.setCompu(compu);
                prestV.setPresta(presta);
                prestV.setSePresta(usern);
                prestV.setFechIniPrest(Date.valueOf(fechIniPrest[i]));
                prestV.setFechFinPrest(Date.valueOf(fechFinPrest[i]));
                
                bit = new Bitacora();
                bit.setAccbit("UPDATE");
                bit.setDatoNBit(prestN.toString());
                bit.setDatoVBit(prestV.toString());
                bit.setFecAccBit(new java.util.Date());
                bit.setNomUsrBit(usern.getNomPUsrN());
                
                
                s   = sf.openSession();
                s.beginTransaction();
                s.update(prestN);
                s.save(bit);
                s.getTransaction().commit();
                
            }
            
            msjLbl.setVisible(true);
 
        }
        
    }//GEN-LAST:event_devLblMouseClicked

    private void msjLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msjLblMouseMoved
        if(msjLbl.isVisible()){
            int segundos = 1; // Tiempo en segundos
            try {
                Thread.sleep(segundos * 1000); // El argumento se expresa en milisegundos, por lo que se multiplica por 1000
                msjLbl.setVisible(false);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            origen.cargarVentana();
            this.dispose();
        }
    }//GEN-LAST:event_msjLblMouseMoved

    /**
     * @param args the command line arguments
     */
    
    
    private void setTable(){
        estTab.getTableHeader().setBackground(new Color(255,255,255));
        estTab.getTableHeader().setForeground(Color.BLACK);
        estTab.setRowHeight(30);
    }
    
    private void cargarVentana(){
        msjLbl.setVisible(false);
        setEstados();
    }
    
    private void setEstados(){
        HistorialEstado hComp;
        ArrayList<HistorialEstado> estPerifs;
        
        DefaultTableModel modelo;
        
        Object[]          fila;
        modelo  = (DefaultTableModel) estTab.getModel();
        modelo.setRowCount(0);
        
        for(int i = 0; i < idComp.length; i++){

            hComp = Ejecutor.getEstActDisp(sf, idComp[i]);

            fila    = new Object[3];
            fila[0] = idComp[i] + "";
            fila[1] = hComp.getNomEst();
            fila[2] = hComp.getFechEst() + "";
            modelo.addRow(fila);


            estPerifs = Ejecutor.getEstPerifComp(sf, idComp[i]);

            for(HistorialEstado h : estPerifs){
                fila    = new Object[3];
                fila[0] = h.getDisp().getIdDisp() + "";
                fila[1] = h.getNomEst();
                fila[2] = h.getFechEst() + "";
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
            java.util.logging.Logger.getLogger(VentanaEstDispDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEstDispDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEstDispDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEstDispDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel devBtn;
    private javax.swing.JLabel devLbl;
    private javax.swing.JLabel estDispLbl;
    private javax.swing.JScrollPane estSP;
    private javax.swing.JTable estTab;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel msjLbl;
    // End of variables declaration//GEN-END:variables
}