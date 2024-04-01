/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab6;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Acer
 */

import java.sql.*;
import javax.swing.*;


public class ConnectMsSql {

    
    Connection conn = null;

    /**
     *
     * @return
     */
   public static Connection ConnectDB() {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //String connsrting = "jdbc:sqlserver://localhost:1433;databaseName=db1;integratedSecurity=true;";
        String connsrting = "jdbc:sqlserver://localhost;databaseName=db1;user=sa2;password=1234;encrypt=false;";

        Connection conn = DriverManager.getConnection(connsrting);
        //JOptionPane.showMessageDialog(null, "Connect");
        return conn;
    } catch(Exception e) {
        e.printStackTrace();
        return null;
    }
    }


}
