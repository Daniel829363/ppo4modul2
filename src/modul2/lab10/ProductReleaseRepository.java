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
public class ProductReleaseRepository extends Repository<ProductRelease>{

    public ProductReleaseRepository(Connection connection) {
        super(connection);
    }

    @Override
    public ResultSet GetAll() throws SQLException {
        String sql = "SELECT [Id],[ProductName],[Amount],[Date] FROM ProductReleaseView";
        statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

    @Override
    public void Create(ProductRelease model) throws SQLException {
        stored_pro = connection.prepareCall("{call CreateProductRelease(?,?)}");
        stored_pro.setString(1, String.valueOf(model.ProductId));
        stored_pro.setString(2, String.valueOf(model.Amount));
        stored_pro.execute();
    }

    /**
     *
     * @param model
     * @throws SQLException
     */
    @Override
    public void Update(ProductRelease model) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Delete(int Id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
