package loginform;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanji
 */
public class second_window extends javax.swing.JFrame {

    /**
     * Creates new form second_window
     */
    public second_window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        createMatch = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT THE OPERATION");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 536, 63));

        createMatch.setText("CREATE MATCH");
        createMatch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        createMatch.setkBorderRadius(60);
        createMatch.setkEndColor(new java.awt.Color(0, 153, 153));
        createMatch.setkHoverEndColor(new java.awt.Color(204, 0, 204));
        createMatch.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        createMatch.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        createMatch.setkStartColor(new java.awt.Color(204, 0, 204));
        createMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMatchmethod(evt);
            }
        });
        kGradientPanel1.add(createMatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 297, 63));

        kButton2.setText("SEARCH RECORD / STATISTICS");
        kButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kButton2.setkBorderRadius(60);
        kButton2.setkEndColor(new java.awt.Color(0, 153, 153));
        kButton2.setkHoverEndColor(new java.awt.Color(204, 0, 204));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        kButton2.setkStartColor(new java.awt.Color(204, 0, 204));
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 297, 63));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createMatchmethod(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMatchmethod
        try {
            MatchCreator matchCreate = new MatchCreator();
            setVisible(false);
            matchCreate.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(second_window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createMatchmethod

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
            java.util.logging.Logger.getLogger(second_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(second_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(second_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(second_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new second_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton createMatch;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KButton kButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
