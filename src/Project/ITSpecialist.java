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
public class ITSpecialist extends mentenance{

    public void Handle(String Service) {
        if (!(Service.equalsIgnoreCase("Maintenance"))) {
            System.out.println("wrong ");
            //---------------
        } else {
            Approve(Service);
        }

    }

    
    @Override
    public String Approve(String Service) {
           System.out.println("IT Specialist Approve the "+ Service + "service");
        return "IT Specialist Approve the "+ Service + "service";

    }
    
}
