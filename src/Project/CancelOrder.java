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
public class CancelOrder implements ICommand {

    CancelOrder c ;
    
    public CancelOrder(CancelOrder c) {
        this.c=c;
    }

    public CancelOrder() {
    }

    @Override
    public String cancel() {
        System.out.println("Cancel order");
       return " Cancel order " ;
    }
    
}
