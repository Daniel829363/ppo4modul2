package modul2.lab10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;

/**
 *
 * @author Acer
 */
public class UnitOfWork {

    public UnitOfWork(Connection connection) {
        this.connection = connection;
        Products = new ProductRepository(this.connection);
        ProductReceipts = new ProductReceiptRepository(this.connection);
        ProductReleases = new ProductReleaseRepository(this.connection);        
    }

    private final Connection connection;
    public ProductRepository Products;
    public ProductReceiptRepository ProductReceipts;
    public ProductReleaseRepository ProductReleases;
}

