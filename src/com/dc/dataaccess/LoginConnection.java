/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dc.dataaccess;

import com.dc.models.User;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
   
            
    public void RegisterUser(User user) throws SQLException {
        
            connection = Connectionz.getConnection();
            Statement s = connection.createStatement();
            String query = "INSERT INTO login_table (id,firstname,lastname,username,password,options) VALUES ('"+user.getId()+"','"+user.getFname()+"','"+user.getLname()+"','"+user.getUsername()+"','"+user.getPassword()+"','"+user.getOptions()+"')";
            s.executeUpdate(query);

        
    
        
    }
    

}
