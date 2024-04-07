/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab10;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class StockSystem {

    private static Connection connection; 
    public static UnitOfWork unitOfWork;

    public static void main(String[] args) {
        try {
            connection = DbConnection.Connect();        
            unitOfWork = new UnitOfWork(connection);
            IndexJFrame index = new IndexJFrame();
            index.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StockSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}

