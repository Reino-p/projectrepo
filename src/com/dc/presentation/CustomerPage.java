package com.dc.presentation;

import com.dc.businesslogic.CustomerPageViewModel;
import com.dc.models.OrderDetails;
import java.util.Random;
import javax.swing.JOptionPane;

public class CustomerPage extends javax.swing.JFrame {

    /**
     * Creates new form CustomerPage
     */
    
    //clear fields after operation
    public void clear(){
    
        txtCname1.setText("");
        txtComboEvent.setSelectedIndex(0);
        txtDate.setText("");
        txtAreaAddress.setText("");
        txtAdult.setText("");
        txtChild.setText("");
        txtComboAdult1.setSelectedIndex(0);
        txtComboAdultDrinks.setSelectedIndex(0);
        txtComboAdultDessert.setSelectedIndex(0);
        txtComboChild.setSelectedIndex(0);
        txtComboChildDrinks.setSelectedIndex(0);
        txtComboChildDessert.setSelectedIndex(0);
        txtAreaDecor.setText("");
    
    }
    
    public CustomerPage() {
        initComponents();
    }
    
    public CustomerPage(String uname) {
        initComponents();
        jLabel1.setText(uname);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtComboEvent = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtCname1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAddress = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtChild = new javax.swing.JTextField();
        txtAdult = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtComboChildDessert = new javax.swing.JComboBox<>();
        txtComboAdultDessert = new javax.swing.JComboBox<>();
        txtComboChild = new javax.swing.JComboBox<>();
        txtComboChildDrinks = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDecor = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtComboAdult1 = new javax.swing.JComboBox<>();
        txtComboAdultDrinks = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnStatus = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("dd/mm/yyyy hh:mm");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        txtDate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 220, 26));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Customer Name:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 57, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Please fill in the required details below:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txtComboEvent.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtComboEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Birthday", "Wedding", "Baby Shower", "Retirement Party", "Engagement", "Reunion", "Corporate Event", "Holiday Party", "Themed Party", "Family Dinner", "Bridal Shower", "Bachelor Party" }));
        txtComboEvent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(txtComboEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 106, 220, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel7.setText("Event Type:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtCname1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtCname1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCname1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(txtCname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 55, 220, 26));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel8.setText("Dessert:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, 20));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel9.setText("Event Date & Time:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtAreaAddress.setColumns(20);
        txtAreaAddress.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtAreaAddress.setRows(5);
        txtAreaAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jScrollPane1.setViewportView(txtAreaAddress);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, 160));

        jButton3.setBackground(new java.awt.Color(0, 153, 102));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton3.setText("Confirm Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel10.setText("Venue Address:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel11.setText("Menu Selection");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, 20));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel12.setText("Food:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        txtChild.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtChild.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(txtChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 30, 20));

        txtAdult.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtAdult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(txtAdult, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 30, 20));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel13.setText("Number of People:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel14.setText("Adult:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel15.setText("Child:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel16.setText("Child");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 40, -1));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel17.setText("Drinks:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, 20));

        txtComboChildDessert.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        txtComboChildDessert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Cake", "Pie", "Cupcakes", "Brownies", "Ice Cream", "Waffles", "Pancakes", "Flapjacks", "Sweets Packet" }));
        txtComboChildDessert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(txtComboChildDessert, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 130, -1));

        txtComboAdultDessert.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        txtComboAdultDessert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Cake", "Pie", "Cupcakes", "Brownies", "Ice Cream", "Waffles", "Pancakes", "Flapjacks", "Sweets Packet" }));
        txtComboAdultDessert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(txtComboAdultDessert, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 140, -1));

        txtComboChild.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        txtComboChild.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mac & Cheese", "Hot Dog", "Wrap", "Fish Fingers and Fries", "Sloppy Joes", "Quesadillas", "Pizza", "Fried Chicken", "Chicken waffles", "Cheesy Fries", "Corn Dogs", "Spaghetti and Meatballs", "Nachos" }));
        txtComboChild.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(txtComboChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 130, -1));

        txtComboChildDrinks.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        txtComboChildDrinks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Tea", "Fruit Juice", "Hot Chocolate", "Water", "Soft Drink", "Flavoured Milk", "Smoothy" }));
        txtComboChildDrinks.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(txtComboChildDrinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 130, -1));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel18.setText("Decorations:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        txtAreaDecor.setColumns(20);
        txtAreaDecor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtAreaDecor.setRows(5);
        txtAreaDecor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jScrollPane2.setViewportView(txtAreaDecor);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 290, 110));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel19.setText("Dessert:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, 20));

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel20.setText("Drinks:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, 20));

        txtComboAdult1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        txtComboAdult1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Pizza", "Burger", "Pasta", "Mix Salad", "Wraps", "Lasagne", "Tacos", "Nachos", "Burritos", "Meatball Sub", "Sloppy Joes", "Hot Dog", "Grilled Chicken", "Fried Chicken", "Steak", "Lobster Roll", "Egg Fried Rice", "Korean Beef Bowl" }));
        txtComboAdult1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(txtComboAdult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 140, -1));

        txtComboAdultDrinks.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        txtComboAdultDrinks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Tea", "Herbal Tea", "Fruit Juice", "Vegetable Juice", "Hot Chocolate", "Coffee", "Water", "Soft Drink", "Alcohol Free Drinks (Bar)", "Alcohol Drinks (Bar)" }));
        txtComboAdultDrinks.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel3.add(txtComboAdultDrinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 140, -1));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel21.setText("Adult");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel22.setText("Food:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 850, 450));

        jPanel4.setBackground(new java.awt.Color(0, 153, 102));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer Details");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeliciousCatering/icons8-room-service-with-food-serving-by-hotel-staff-48.png"))); // NOI18N
        jLabel6.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Name");

        btnLogout.setBackground(new java.awt.Color(255, 102, 102));
        btnLogout.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnStatus.setBackground(new java.awt.Color(102, 153, 255));
        btnStatus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnStatus.setText("View Status");
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                        .addComponent(btnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogout)
                        .addGap(15, 15, 15))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnLogout)
                    .addComponent(btnStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // Logout button
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        // View Status button
        StatusPage sp = new StatusPage();
        sp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnStatusActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Confirmation button
        
        //user inputs
        OrderDetails orderDetails = new OrderDetails();
        
        orderDetails.setCname(txtCname1.getText());
        orderDetails.setEvent(txtComboEvent.getSelectedItem().toString());
        orderDetails.setDate(txtDate.getText());
        orderDetails.setAddress(txtAreaAddress.getText());
        orderDetails.setNumadult(Integer.parseInt(txtAdult.getText()));
        orderDetails.setNumchild(Integer.parseInt(txtChild.getText()));
        orderDetails.setAfood(txtComboAdult1.getSelectedItem().toString());
        orderDetails.setAdrink(txtComboAdultDrinks.getSelectedItem().toString());
        orderDetails.setAdessert(txtComboAdultDessert.getSelectedItem().toString());
        orderDetails.setCfood(txtComboChild.getSelectedItem().toString());
        orderDetails.setCdrink(txtComboChildDrinks.getSelectedItem().toString());
        orderDetails.setCdessert(txtComboChildDessert.getSelectedItem().toString());
        orderDetails.setDecor(txtAreaDecor.getText());
        
        //order number
        Random rand = new Random();
        int ordernum = rand.nextInt(100);
        orderDetails.setOrderNumber(ordernum);
        
        CustomerPageViewModel customerPageViewModel = new CustomerPageViewModel();
        customerPageViewModel.insertOrderDetails(orderDetails);
        JOptionPane.showMessageDialog(rootPane, "Order has been placed successfully, order number: "+ordernum, "Order placed!", 1);
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnStatus;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAdult;
    private javax.swing.JTextArea txtAreaAddress;
    private javax.swing.JTextArea txtAreaDecor;
    private javax.swing.JTextField txtChild;
    private javax.swing.JTextField txtCname1;
    private javax.swing.JComboBox<String> txtComboAdult1;
    private javax.swing.JComboBox<String> txtComboAdultDessert;
    private javax.swing.JComboBox<String> txtComboAdultDrinks;
    private javax.swing.JComboBox<String> txtComboChild;
    private javax.swing.JComboBox<String> txtComboChildDessert;
    private javax.swing.JComboBox<String> txtComboChildDrinks;
    private javax.swing.JComboBox<String> txtComboEvent;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
