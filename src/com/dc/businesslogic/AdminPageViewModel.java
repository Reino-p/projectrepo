/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dc.businesslogic;

import com.dc.dataaccess.OrderDetailsConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * Business logic for AdminPage
 */
public class AdminPageViewModel {
    OrderDetailsConnection orderDetailsConnection;
    
    public ResultSet getAllOrders() {
        orderDetailsConnection = new OrderDetailsConnection();
        try {
            return orderDetailsConnection.getAllOrders();
        } catch (SQLException ex) {
            Logger.getLogger(StatusPageViewModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public void deleteOrder(int orderNumber) throws SQLException {
        orderDetailsConnection = new OrderDetailsConnection();
        orderDetailsConnection.deleteOrder(orderNumber);
    }
    
    
}
