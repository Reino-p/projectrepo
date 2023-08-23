/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dc.businesslogic;

import com.dc.dataaccess.LoginConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Business logic for LoginPage
 */
public class LoginPageViewModel {
    
    ResultSet resultSet;
    LoginConnection loginConnection;

    public LoginPageViewModel() {
        this.loginConnection = new LoginConnection();
    }
    
    public void Login(String username, String password) {
        resultSet = this.loginConnection.login(username, password);
    }
    
    public boolean isUserLoggedIn(){
        try {
            return resultSet.next();
        } catch (SQLException ex) {
            Logger.getLogger(LoginPageViewModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public String getOption() throws SQLException {
        String option = resultSet.getString("options");
        return option;
    }
    
    public String getUsername() throws SQLException {
        String username = resultSet.getString("username");
        return username;
    }
}
