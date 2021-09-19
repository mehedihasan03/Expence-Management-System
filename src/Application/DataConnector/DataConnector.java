/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application.DataConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 88016
 */
public class DataConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/expance";
    private static final String USER = "root";
    private static final String PSWD = "123456";
    private static Connection conn = null;
     public static Connection connect(){
        
        
            if(conn == null){
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    
                      conn = DriverManager.getConnection(URL , USER , PSWD);
                    System.out.println("connection Successfull");
                } catch (SQLException ex) {
                    ex.getLocalizedMessage();
                } catch (ClassNotFoundException ex) {
                    ex.getLocalizedMessage();
                }
                                     
            
        }
        
        return conn;
    }
    
}
