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

/**
 *
 * Business logic for CustomerPage
 */
public class CustomerPageViewModel {
    
    public boolean insertOrderDetails(OrderDetails orderDetails) {
        OrderDetailsConnection orderDetailsConnection = new OrderDetailsConnection();
        try {
            orderDetailsConnection.incertOrder(orderDetails);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPageViewModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
