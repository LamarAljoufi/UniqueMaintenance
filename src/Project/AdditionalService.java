/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author DELL
 */
public class AdditionalService implements IProduct {
    
    IProduct Product;
    String product;
    double price;
    
    public AdditionalService(IProduct Product) {
        this.Product = Product;
    }

    public AdditionalService(String product, double price) {
        this.product = product;
        this.price = price;
    }
    
    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public double getPrice() {
        return price;
    }
    
}

