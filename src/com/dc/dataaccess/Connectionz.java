package com.dc.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * Main connection to DB
 */
public class Connectionz {
    static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
                                                                        //database name, "db username", "Password"
        }catch(Exception ex){
            System.out.println(""+ex);
        }
        return con;
    }
    
}
