/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public abstract class Repository<T> {

    public Repository(Connection connection) {
        this.connection = connection;
    }
    protected Connection connection;
    protected CallableStatement stored_pro = null; 
    protected Statement statement = null;
    
    public abstract ResultSet GetAll() throws SQLException;  
    public abstract void Create(T model) throws SQLException;
    public abstract void Update(T model) throws SQLException;
    public abstract void Delete(int Id) throws SQLException;
}

