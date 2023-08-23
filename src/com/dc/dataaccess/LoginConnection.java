/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dc.dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * Login connection
 */
public class LoginConnection {

    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public ResultSet login(String username, String password) {
        try {
            connection = Connectionz.getConnection();
            preparedStatement = connection.prepareStatement("select * from login_table where username=? and password=?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            return resultSet;

        } catch (Exception ex) {
            System.out.println("" + ex);
        }
    
        return null;
    }
    
    
    

}
