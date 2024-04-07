/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class DbConnection {
 
    static Connection Connect() throws SQLException, ClassNotFoundException{       
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
                "databaseName=shop_netbeans2;user=sa2;password=1234;encrypt=false;";  
             Connection conn = DriverManager.getConnection(connectionUrl);  
            //JOptionPane.showMessageDialog(null, "Connect");
            return conn;
    }
}

