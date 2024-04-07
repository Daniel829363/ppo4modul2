/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab10;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Acer
 */
public class ProductReceiptJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProductReceiptJInternalFrame
     */
    
    private ArrayList<Product> products;
    
    public ProductReceiptJInternalFrame() {
        initComponents();
        products=new ArrayList<>();
    }

    // Заполнение таблицы 
    private void FillTable() {
        try { 
            ResultSet resultSet;
            resultSet = StockSystem.unitOfWork.ProductReceipts.GetAll();
            jTable1.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch(SQLException ex){
            Logger.getLogger(ProductJInternalFrame.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "Ошибка");
        }
    } // Получение записей из бд jTable1.setModel(DbUtils.resultSetToTableModel(resultSet)); // Присваивание таблице модели для заполнения } catch (SQLException ex) { Logger.getLogger(ProductJInternalFrame.class.getName()).log(Level.SEVERE, null, ex); JOptionPane.showMessageDialog(null, "○шибка"); } }

    private void GetProducts() throws SQLException{
        try{
            jComboBox1.removeAllItems();
            ResultSet resultSet = StockSystem.unitOfWork.Products.GetAll();
            while(resultSet.next()){
                Product product = new Product(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3));
                products.add(product);
                jComboBox1.addItem(product.Name);
            }
        }catch(SQLException ex){
            Logger.getLogger(ProductJInternalFrame.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "Ошибка");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Поступление товара");

        jLabel2.setText("Товар");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Количество");

        jButton1.setText("Добавить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        try {
            GetProducts();
        } catch (SQLException ex) {
            Logger.getLogger(ProductReceiptJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        FillTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if ( jTextField1.getText().length() < 1 ){
       JOptionPane.showMessageDialog ( null , " Введите количество товара ! " ) ;} // Вывод сообщения об ошибке
else 
    try {
        int index=jComboBox1.getSelectedIndex();
        ProductReceipt productReceipt = new ProductReceipt();
        productReceipt.ProductId = products.get(index).Id;
        productReceipt.Amount = Integer.parseInt(jTextField1.getText());

        StockSystem.unitOfWork.ProductReceipts.Create (productReceipt) ;
        jTextField1.setText("");
        JOptionPane.showMessageDialog ( null , " Добавлено " ) ;
        FillTable();
    } catch ( SQLException ex ) {
        Logger.getLogger(ProductJInternalFrame.class.getName()).log (Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog ( null , " Ошибка при запросе к БД " ) ;
    }catch (NumberFormatException ex ) {
        Logger.getLogger(ProductJInternalFrame.class.getName()).log (Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog ( null , " Ошибка в формате введённых данных " ) ;
    } 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
