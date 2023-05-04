/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;


import compush.compushibernate.seguridad.Funcion;
import compush.compushibernate.seguridad.Funcion_IU;
import compush.compushibernate.seguridad.IU;
import compush.compushibernate.seguridad.Rol;
import compush.compushibernate.seguridad.Rol_Funcion;
import compush.compushibernate.seguridad.UserN;
import compush.compushibernate.seguridad.UserN_Rol;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author Jairo
 */
public class VentanaIU extends javax.swing.JFrame {

   
    private int mouseX, mouseY;
    private UserN usern;
    private SessionFactory sf;
    
    public VentanaIU(UserN usern, SessionFactory sf) {
        setLookAndFeel();
        initComponents();
        this.sf  = sf;
        this.usern = usern;
        setTable();
        setIUs(); 
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
        bg2 = new javax.swing.JPanel();
        iusPanel = new javax.swing.JPanel();
        opciones = new javax.swing.JLabel();
        iusSP = new javax.swing.JScrollPane();
        iusTab = new javax.swing.JTable();
        selecBtn = new javax.swing.JPanel();
        selectLbl = new javax.swing.JLabel();

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

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addContainerGap(731, Short.MAX_VALUE)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg2.setBackground(new java.awt.Color(31, 31, 31));

        iusPanel.setBackground(new java.awt.Color(255, 255, 255));
        iusPanel.setFocusable(false);
        iusPanel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N

        opciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opciones.setText("INTERFACES DE USUARIO:");

        iusTab.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        iusTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rol", "Función", "IU"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        iusTab.setFocusable(false);
        iusTab.setGridColor(new java.awt.Color(167, 167, 167));
        iusTab.setRowHeight(30);
        iusTab.setSelectionBackground(new java.awt.Color(147, 147, 147));
        iusTab.setSelectionForeground(new java.awt.Color(255, 255, 255));
        iusTab.setShowHorizontalLines(true);
        iusTab.getTableHeader().setReorderingAllowed(false);
        iusSP.setViewportView(iusTab);
        if (iusTab.getColumnModel().getColumnCount() > 0) {
            iusTab.getColumnModel().getColumn(0).setResizable(false);
            iusTab.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout iusPanelLayout = new javax.swing.GroupLayout(iusPanel);
        iusPanel.setLayout(iusPanelLayout);
        iusPanelLayout.setHorizontalGroup(
            iusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iusPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(iusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iusSP, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opciones))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        iusPanelLayout.setVerticalGroup(
            iusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iusSP, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        selecBtn.setBackground(new java.awt.Color(255, 255, 255));

        selectLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        selectLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectLbl.setText("Seleccionar");
        selectLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout selecBtnLayout = new javax.swing.GroupLayout(selecBtn);
        selecBtn.setLayout(selecBtnLayout);
        selecBtnLayout.setHorizontalGroup(
            selecBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        selecBtnLayout.setVerticalGroup(
            selecBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(iusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
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

    private void selectLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectLblMouseClicked
        String iu;
        int fila;
        
        fila = iusTab.getSelectedRow();
        if(fila >= 0){
            iu = (String)iusTab.getValueAt(fila, 2);
            
            switch (iu) {
                case "VentanaAlquilerComp":
                    {
                        VentanaAlquilerComp ventana;
                        ventana = new VentanaAlquilerComp(usern, sf);
                        ventana.setVisible(true);
                        break;
                    }
                case "VentanaDevAlquiler":
                    {
                        VentanaDevAlquiler ventana;
                        ventana = new VentanaDevAlquiler(usern, sf);
                        ventana.setVisible(true);
                        break;
                    }
                case "VentanaPrestamoComp":
                    {
                        VentanaPrestamoComp ventana;
                        ventana = new VentanaPrestamoComp(usern, sf);
                        ventana.setVisible(true);
                        break;
                    }
                case "VentanaDevPrestamo":
                    {
                        VentanaDevPrestamo ventana;
                        ventana = new VentanaDevPrestamo(usern, sf);
                        ventana.setVisible(true);
                        break;
                    }
                case "VentanaEstDisp":
                    {
                        VentanaEstDisp ventana;
                        ventana = new VentanaEstDisp(usern, sf);
                        ventana.setVisible(true);
                        break;
                    }
                case "VentanaRegistroComp":
                    {
                        VentanaRegistroComp ventana;
                        ventana = new VentanaRegistroComp(usern, sf);
                        ventana.setVisible(true);
                        break;
                    }
                case "VentanaMostImg":
                    {
                        VentanaMostImg ventana;
                        ventana = new VentanaMostImg(usern, sf);
                        ventana.setVisible(true);
                        break;
                    }
                default:
                    break;
            }
        }

    }//GEN-LAST:event_selectLblMouseClicked

    
    private void setTable(){
        iusTab.getTableHeader().setBackground(new Color(255,255,255));
        iusTab.getTableHeader().setForeground(Color.BLACK);
        iusTab.setRowHeight(30);
    }
    
    
    private ArrayList<Object[]> getIUsBD(){
        ArrayList<Object[]> ius;
        ius = null;
        
        Session s;
        CriteriaBuilder cb;
        Root<UserN> usr;
        Join<UserN, UserN_Rol> join1;
        Join<UserN_Rol, Rol> join2;
        Join<Rol, Rol_Funcion> join3;
        Join<Rol_Funcion, Funcion> join4;
        Join<Funcion, Funcion_IU> join5;
        Join<Funcion_IU, IU> join6;
        
        CriteriaQuery c;
        Query q;
        
        s  = sf.openSession();
        cb = s.getCriteriaBuilder();
        c  = cb.createQuery();
        
        usr = c.from(UserN.class);
        join1 = usr.join("usern_rols");
        join2 = join1.join("rol");
        join3 = join2.join("rol_funcions");
        join4 = join3.join("funcion");
        join5 = join4.join("funcion_ius");
        join6 = join5.join("iu");
        
        c.multiselect(
                join2.get("nomRol"), 
                join4.get("nomFunc"), 
                join6.get("nomIU"))
                .where(
                    cb.and(
                            cb.equal(usr.get("idUsrN"), usern.getIdUsrN()),
                            cb.isTrue(join2.get("actRol")),
                            cb.isTrue(join4.get("actFunc")),
                            cb.isTrue(join6.get("actIU")),
                            cb.lessThanOrEqualTo(cb.currentDate(), join1.get("fechFinUR")),
                            cb.greaterThanOrEqualTo(cb.currentDate(), join1.get("fechIniUR"))
        ));
        
        q = s.createQuery(c);
        
        try{
            ius = (ArrayList<Object[]>)q.getResultList();
            
        }catch(NoResultException ex){
            
            System.out.println("USUARIO O CONTRASEÑA INCORRECTOS");
            s.close();
        }
        
        s.close();
        
        return ius;
    }
    
    
    private void setIUs(){
        ArrayList<Object[]> ius;
        DefaultTableModel modelo;
        Object[]          fila;
        
        ius = getIUsBD();
        modelo  = (DefaultTableModel) iusTab.getModel();
        
        modelo.setRowCount(0);
        
        for(Object[] o : ius){
            fila    = new Object[3];
            
            fila[0] = o[0];
            fila[1] = o[1];
            fila[2] = o[2];
            modelo.addRow(fila); 
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
            java.util.logging.Logger.getLogger(VentanaIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JPanel iusPanel;
    private javax.swing.JScrollPane iusSP;
    private javax.swing.JTable iusTab;
    private javax.swing.JLabel opciones;
    private javax.swing.JPanel selecBtn;
    private javax.swing.JLabel selectLbl;
    // End of variables declaration//GEN-END:variables
}
