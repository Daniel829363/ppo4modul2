/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab10;

/**
 *
 * @author Acer
 */
public class IndexJFrame extends javax.swing.JFrame {

    /**
     * Creates new form IndexJFrame
     */
    public IndexJFrame() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ProductMenuItem = new javax.swing.JMenuItem();
        ProductReceiptMenuItem = new javax.swing.JMenuItem();
        ProducReleaseMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        ProductMenuItem.setText(" Товар");
        ProductMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(ProductMenuItem);

        ProductReceiptMenuItem.setText("Поступление товара");
        ProductReceiptMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductReceiptMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(ProductReceiptMenuItem);

        ProducReleaseMenuItem.setText("Выгрузка товара");
        ProducReleaseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProducReleaseMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(ProducReleaseMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductMenuItemActionPerformed

        ProductJInternalFrame productFrame=new ProductJInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(productFrame);
        productFrame.setVisible(true);
    }//GEN-LAST:event_ProductMenuItemActionPerformed

    private void ProductReceiptMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductReceiptMenuItemActionPerformed
ProductReceiptJInternalFrame productReceiptFrame=new ProductReceiptJInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(productReceiptFrame);
        productReceiptFrame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ProductReceiptMenuItemActionPerformed

    private void ProducReleaseMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProducReleaseMenuItemActionPerformed
        ProductReleaseJInternalFrame productReleaseFrame=new ProductReleaseJInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(productReleaseFrame);
        productReleaseFrame.setVisible(true); 
    }//GEN-LAST:event_ProducReleaseMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(IndexJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ProducReleaseMenuItem;
    private javax.swing.JMenuItem ProductMenuItem;
    private javax.swing.JMenuItem ProductReceiptMenuItem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}