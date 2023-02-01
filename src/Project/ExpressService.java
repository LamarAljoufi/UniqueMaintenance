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
public class ExpressService extends AdditionalService{

    public ExpressService(IProduct Product) {
        super(Product);
    }

    public ExpressService(String product, double price) {
        super(product, price);
    }
    

    @Override
    public double getPrice() {
        return super.getPrice() + 50 ; 
    }

    @Override
    public String getProduct() {
        return super.getProduct() + " Express Service"; 
    }
    

}

