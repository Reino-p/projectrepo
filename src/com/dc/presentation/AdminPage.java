package com.dc.presentation;

import com.dc.businesslogic.AdminPageViewModel;
import com.dc.dataaccess.Connectionz;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    ResultSet rs;
    
    public void ShowTable(){
        int CC;
        
        try{
             AdminPageViewModel adminPageViewModel = new AdminPageViewModel();
            rs = adminPageViewModel.getAllOrders();
            ResultSetMetaData RSMD = rs.getMetaData();
            CC = RSMD.getColumnCount();
                
            DefaultTableModel DFT = (DefaultTableModel)jTableAdmin.getModel();
            
            DFT.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();
                
                for(int i=1; i<=CC; i++){
                    v2.add(rs.getString("customername"));
                    v2.add(rs.getString("event"));
                    v2.add(rs.getString("date"));
                    v2.add(rs.getString("address"));
                    v2.add(rs.getString("numadult"));
                    v2.add(rs.getString("numchild"));
                    v2.add(rs.getString("adultfood"));
                    v2.add(rs.getString("adultdrink"));
                    v2.add(rs.getString("adultdessert"));
                    v2.add(rs.getString("childfood"));
                    v2.add(rs.getString("childdrink"));
                    v2.add(rs.getString("childdessert"));
                    v2.add(rs.getString("decor"));
                    v2.add(rs.getString("ordernum"));
                }
                
                DFT.addRow(v2);
            }
            
        } catch (Exception ex){
            System.out.println(""+ex);
        }
    }
    
    //clear fields after operation
    public void clear(){
    
        txtRemove.setText("");
    
    }
    
    public AdminPage() {
        initComponents();
    }

    public AdminPage(String Uname) {
        initComponents();
        jLabel1.setText(Uname);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAdmin = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtRemove = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRefresh1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Name");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin Dasboard");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeliciousCatering/icons8-room-service-with-food-serving-by-hotel-staff-48.png"))); // NOI18N
        jLabel6.setToolTipText("");

        btnLogout.setBackground(new java.awt.Color(255, 102, 102));
        btnLogout.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 779, Short.MAX_VALUE)
                        .addComponent(btnLogout)
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogout)
                            .addComponent(jLabel2))
                        .addGap(1, 1, 1)))
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("Current Orders");

        btnView.setBackground(new java.awt.Color(153, 153, 0));
        btnView.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jTableAdmin.setBackground(new java.awt.Color(204, 204, 204));
        jTableAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Event", "Date", "Venue Address", "Number of Adults", "Number of Children", "Adult Food", "Adult Drink", "Adult Dessert", "Child Food", "Child Drink", "Child Dessert", "Decoration", "Order Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAdmin.getTableHeader().setReorderingAllowed(false);
        jTableAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAdmin);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel4.setText("Remove Order:");

        txtRemove.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtRemove.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        btnRemove.setBackground(new java.awt.Color(255, 102, 102));
        btnRemove.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnRemove.setText("Remove Order");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel5.setText("Select Order From Table");

        btnRefresh1.setBackground(new java.awt.Color(204, 153, 255));
        btnRefresh1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnRefresh1.setText("Refresh");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel7.setText("Remove Order Number:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnView)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemove)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(jLabel3)
                    .addComponent(btnRefresh1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove)
                    .addComponent(jLabel7))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1200, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // Logout button
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        //View orders button
        ShowTable();
    }//GEN-LAST:event_btnViewActionPerformed

    private void jTableAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAdminMouseClicked
        // click on table this will execute
        // When clicking on table this will execute
        int row = jTableAdmin.getSelectedRow(); //get the row index
        DefaultTableModel model = (DefaultTableModel)jTableAdmin.getModel();
        txtRemove.setText(model.getValueAt(row, 13).toString());
        
    }//GEN-LAST:event_jTableAdminMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // Remove button code here
        
        //order number
        int ordernum = Integer.parseInt(txtRemove.getText());
        try{
            //try this
             AdminPageViewModel adminPageViewModel = new AdminPageViewModel();
             adminPageViewModel.deleteOrder(ordernum);
            JOptionPane.showMessageDialog(rootPane, "Order has been Removed successfully. Please refresh table. Order number: "+ordernum, "Order Removed!", 1);
            clear();
            
        } catch (Exception ex) {
            //catch this
            System.out.println(""+ex);
        }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        // Refresh button code here
        ShowTable();
    }//GEN-LAST:event_btnRefresh1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAdmin;
    private javax.swing.JTextField txtRemove;
    // End of variables declaration//GEN-END:variables
}
