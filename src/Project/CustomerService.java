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
public class CustomerService extends mentenance  {

    public void Handle(String Service) {
        if (Service.equalsIgnoreCase("Maintenance") ) {
            NextApproval.Handle(Service);
            
        } else {
            Approve(Service);
        }

    }

    @Override
    public String Approve(String Service) {
        System.out.println("Customer Service Approve the "+ Service + "service");
        return "Customer Service Approve the "+ Service + "service";
        

    }

}
