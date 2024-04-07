/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class ProductRepository extends Repository<Product>{

    public ProductRepository(Connection connection) {
        super(connection);
    }

    @Override
    public ResultSet GetAll() throws SQLException {        
        String sql = "SELECT [Id],[Name],[ActualAmount] FROM Products";
        statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

    @Override
    public void Create(Product model) throws SQLException{
        stored_pro = connection.prepareCall("{call CreateProduct(?)}");
        stored_pro.setString(1, model.Name);
        stored_pro.execute();
    }

    @Override
    public void Update(Product model) throws SQLException{
        stored_pro = connection.prepareCall("{call UpdateProduct (?,?)}");
        stored_pro.setString(1, String.valueOf(model.Id));
        stored_pro.setString(2, model.Name);
        stored_pro.execute();
    }

    @Override
    public void Delete(int Id) throws SQLException{
        stored_pro = connection.prepareCall("{call DeleteProduct (?)}");
        stored_pro.setString(1, String.valueOf(Id));
        stored_pro.execute();
    }    
}

