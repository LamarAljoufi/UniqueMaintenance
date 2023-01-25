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
public class Card extends Payment {

    public Card() {
    }
    
     public String printPayment() {
        return super.printPayment()+" Card";
    }
    
}
