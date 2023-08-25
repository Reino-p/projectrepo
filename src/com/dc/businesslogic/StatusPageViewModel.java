/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dc.businesslogic;

import com.dc.dataaccess.OrderDetailsConnection;
import com.dc.models.OrderDetails;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * Business logic for StatusPage
 */
public class StatusPageViewModel {
    OrderDetailsConnection orderDetailsConnection;
    
    public ResultSet getOrderDetailsResultSet(int orderNumber) {
        orderDetailsConnection = new OrderDetailsConnection();
        try {
            return orderDetailsConnection.getOrderDetails(orderNumber);
        } catch (SQLException ex) {
            Logger.getLogger(StatusPageViewModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public void updateOrder(OrderDetails orderDetails) throws SQLException {
        orderDetailsConnection = new OrderDetailsConnection();
        orderDetailsConnection.updateOrder(orderDetails);
    }
    
}
