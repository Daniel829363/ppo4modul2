/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab10;

/**
 *
 * @author Acer
 */
public class Product {
    public Product(int Id, String Name, int ActualAmount) {
        this.Id = Id;
        this.Name = Name;
        this.ActualAmount = ActualAmount;
    }
    public Product() {
    }
    public int Id;
    public String Name;
    public int ActualAmount;
}

