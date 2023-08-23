/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dc.dataaccess;

import com.dc.models.OrderDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * OrderDetails Connection
 */
public class OrderDetailsConnection {

    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public void incertOrder(OrderDetails orderDetails) throws SQLException {

        //procedure of making the order
        connection = Connectionz.getConnection();
        Statement s = connection.createStatement();
        String query = "INSERT INTO order_table (customername,event,date,address,numadult,numchild,adultfood,adultdrink,adultdessert,childfood,childdrink,childdessert,decor,ordernum) VALUES ('" + orderDetails.getCname() + "','" + orderDetails.getEvent() + "','" + orderDetails.getDate() + "','" + orderDetails.getAddress() + "','" + orderDetails.getNumadult() + "','" + orderDetails.getNumchild() + "','" + orderDetails.getAfood() + "','" + orderDetails.getAdrink() + "','" + orderDetails.getAdessert() + "','" + orderDetails.getCfood() + "','" + orderDetails.getCdrink() + "','" + orderDetails.getCdessert() + "','" + orderDetails.getDecor() + "','" + orderDetails.getOrderNumber() + "')";
        s.executeUpdate(query);
    }

    public ResultSet getOrderDetails(int orderNumber) throws SQLException {
        connection = Connectionz.getConnection();
        preparedStatement = connection.prepareStatement(" SELECT * FROM order_table WHERE ordernum = '" + orderNumber + "'");
        resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    public void updateOrder(OrderDetails orderDetails) throws SQLException {
        connection = Connectionz.getConnection();
        Statement s = connection.createStatement();
        String query = "UPDATE order_table SET customername='" + orderDetails.getCname() + "','" + orderDetails.getEvent() + "','" + orderDetails.getDate() + "','" + orderDetails.getAddress() + "','" + orderDetails.getNumadult() + "','" + orderDetails.getNumchild() + "','" + orderDetails.getAfood() + "','" + orderDetails.getAdrink() + "','" + orderDetails.getAdessert() + "','" + orderDetails.getCfood() + "','" + orderDetails.getCdrink() + "','" + orderDetails.getCdessert() + "','" + orderDetails.getDecor() + "','" + orderDetails.getOrderNumber() + "' ";
        s.executeUpdate(query);
    }
}
