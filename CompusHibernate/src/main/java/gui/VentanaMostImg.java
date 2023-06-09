/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;



import compush.compushibernate.disp.Computadora;
import compush.compushibernate.disp.Dispositivo;
import compush.compushibernate.disp.Fotografia;
import compush.compushibernate.seguridad.UserN;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class VentanaMostImg extends javax.swing.JFrame {

   
    private UserN usern;
    private SessionFactory sf;
    private VentanaRegistroComp origen;
    private ArrayList<byte[]> imgs;
    private int mouseX, mouseY;
    
    public VentanaMostImg(UserN usern, SessionFactory sf) {
        setLookAndFeel();
        initComponents();
        this.usern = usern;
        this.sf = sf;
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
        bg2 = new javax.swing.JPanel();
        ramLbl = new javax.swing.JLabel();
        idDispTxtBox = new javax.swing.JTextField();
        imgSP = new javax.swing.JScrollPane();
        fotoTab = new javax.swing.JTable();
        nImgBtn = new javax.swing.JPanel();
        nImgLbl = new javax.swing.JLabel();
        nImgBtn2 = new javax.swing.JPanel();
        nImgLbl2 = new javax.swing.JLabel();
        fotoPanel = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();

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

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(recPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bg2.setBackground(new java.awt.Color(31, 31, 31));

        ramLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ramLbl.setForeground(new java.awt.Color(255, 255, 255));
        ramLbl.setText("IDCOMPUTADORA:");

        idDispTxtBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        idDispTxtBox.setForeground(new java.awt.Color(204, 204, 204));
        idDispTxtBox.setBorder(null);
        idDispTxtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idDispTxtBoxFocusGained(evt);
            }
        });
        idDispTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDispTxtBoxActionPerformed(evt);
            }
        });

        fotoTab.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        fotoTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idFoto", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fotoTab.setFocusable(false);
        fotoTab.setGridColor(new java.awt.Color(167, 167, 167));
        fotoTab.setRowHeight(30);
        fotoTab.setSelectionBackground(new java.awt.Color(147, 147, 147));
        fotoTab.setSelectionForeground(new java.awt.Color(255, 255, 255));
        fotoTab.setShowHorizontalLines(true);
        fotoTab.getTableHeader().setReorderingAllowed(false);
        imgSP.setViewportView(fotoTab);
        if (fotoTab.getColumnModel().getColumnCount() > 0) {
            fotoTab.getColumnModel().getColumn(0).setResizable(false);
            fotoTab.getColumnModel().getColumn(1).setResizable(false);
        }

        nImgBtn.setBackground(new java.awt.Color(255, 255, 255));

        nImgLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        nImgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nImgLbl.setText("Mostrar");
        nImgLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nImgLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nImgLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout nImgBtnLayout = new javax.swing.GroupLayout(nImgBtn);
        nImgBtn.setLayout(nImgBtnLayout);
        nImgBtnLayout.setHorizontalGroup(
            nImgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nImgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        nImgBtnLayout.setVerticalGroup(
            nImgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nImgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        nImgBtn2.setBackground(new java.awt.Color(255, 255, 255));

        nImgLbl2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        nImgLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nImgLbl2.setText("Buscar");
        nImgLbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nImgLbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nImgLbl2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout nImgBtn2Layout = new javax.swing.GroupLayout(nImgBtn2);
        nImgBtn2.setLayout(nImgBtn2Layout);
        nImgBtn2Layout.setHorizontalGroup(
            nImgBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nImgLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        nImgBtn2Layout.setVerticalGroup(
            nImgBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nImgLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        imgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLbl.setText("img");

        javax.swing.GroupLayout fotoPanelLayout = new javax.swing.GroupLayout(fotoPanel);
        fotoPanel.setLayout(fotoPanelLayout);
        fotoPanelLayout.setHorizontalGroup(
            fotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        fotoPanelLayout.setVerticalGroup(
            fotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nImgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSP, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bg2Layout.createSequentialGroup()
                        .addComponent(ramLbl)
                        .addGap(18, 18, 18)
                        .addComponent(idDispTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nImgBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addComponent(fotoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nImgBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ramLbl)
                        .addComponent(idDispTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(imgSP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nImgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(fotoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
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

    private void idDispTxtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idDispTxtBoxFocusGained
        idDispTxtBox.setForeground(Color.black);
    }//GEN-LAST:event_idDispTxtBoxFocusGained

    private void idDispTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idDispTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idDispTxtBoxActionPerformed

    private void nImgLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nImgLblMouseClicked
        int f;
        BufferedImage bImg;
        ByteArrayInputStream bais;
        ImageIcon auxIcon, icono;
        Image imgAux, img;
        
        f = fotoTab.getSelectedRow();
                
        if(f >= 0){
            bais = new ByteArrayInputStream(imgs.get(f));
            try {
                        bImg = ImageIO.read(bais);
                        
                        auxIcon = new ImageIcon(bImg);
                        
                        imgAux = auxIcon.getImage();
                        
                        img = imgAux.getScaledInstance(150, 170, java.awt.Image.SCALE_SMOOTH);
                        
                        icono = new ImageIcon(img);
                        
                        imgLbl.setIcon(icono);
                        
                    } catch (IOException ex) {
                        Logger.getLogger(VentanaMostImg.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
      
    }//GEN-LAST:event_nImgLblMouseClicked

    private void nImgLbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nImgLbl2MouseClicked
        setFotosComp();
    }//GEN-LAST:event_nImgLbl2MouseClicked

    
    private ArrayList<Object[]> getFotosComp(){
        ArrayList<Object[]> fotos;
        
        Session s;
        CriteriaBuilder cb;
        CriteriaQuery c;
        Root<Fotografia> f;
        Query q;
        Dispositivo disp;
        Computadora comp;
               
        fotos = null;
        
        s = sf.openSession();
        cb = s.getCriteriaBuilder();
        c = cb.createQuery();
        f = c.from(Fotografia.class);
        
        disp = new Dispositivo();
        disp.setIdDisp(Integer.parseInt(idDispTxtBox.getText()));
        
        comp = new Computadora();
        comp.setDisp(disp);
        
        
        c.multiselect(
                f.get("idFoto"), 
                f.get("descFoto"),
                f.get("imgFoto"),
                f.get("compu")
        );
        c.where(cb.equal(f.get("compu"), comp));
        
        q = s.createQuery(c);
        
        try{
            fotos = (ArrayList<Object[]>)q.getResultList();
            
        }catch(NoResultException ex){
            
            System.out.println("NO HAY FOTOS");
            s.close();
        }
        
        s.close();
      
        return fotos;
    }
    
    private void setFotosComp(){
        ArrayList<Object[]> fotos;
        DefaultTableModel modelo;
        Object[]          fila;
        
        fotos = getFotosComp();
        
        if(fotos != null){
            modelo  = (DefaultTableModel) fotoTab.getModel();
        
            modelo.setRowCount(0);

            for(Object[] o : fotos){
                fila    = new Object[2];
                fila[0] = o[0];
                fila[1] = o[1];
                imgs.add((byte[])o[2]);
                
                modelo.addRow(fila);
            }
        }
        
        
    }
    
    private void clearFotoTab(){
        DefaultTableModel modelo;
        modelo  = (DefaultTableModel) fotoTab.getModel();
        modelo.setRowCount(0);
    }
    
    private void cargarVentana(){
        clearFotoTab();
        idDispTxtBox.setText("");
        imgLbl.setIcon(null);
        imgLbl.setText("");
        imgs = new ArrayList<>();
        
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
            java.util.logging.Logger.getLogger(VentanaMostImg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostImg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostImg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostImg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JPanel fotoPanel;
    private javax.swing.JTable fotoTab;
    private javax.swing.JTextField idDispTxtBox;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JScrollPane imgSP;
    private javax.swing.JPanel nImgBtn;
    private javax.swing.JPanel nImgBtn1;
    private javax.swing.JPanel nImgBtn2;
    private javax.swing.JLabel nImgLbl;
    private javax.swing.JLabel nImgLbl1;
    private javax.swing.JLabel nImgLbl2;
    private javax.swing.JLabel ramLbl;
    private javax.swing.JLabel recLbl;
    private javax.swing.JPanel recPanel;
    // End of variables declaration//GEN-END:variables
}
