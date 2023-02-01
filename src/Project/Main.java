/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import static Project.mentenance.type;
import java.util.ArrayList;

/**
 *
 * @author ra52m
 */
public class Main {

    static double price;
    static double Discount = (15 / 100.0);
    static String paymentMethod ;
    static String ChooseService;

    int index = 0;
    static ArrayList<String> info = new ArrayList<>();

    public static void main(String[] args) {
         
    }

    public static void setChooseService(String ChooseService) {
        Main.ChooseService = ChooseService;
    }

    public static String getChooseService() {
        return ChooseService;
    }
    

    public void chooseService(String service) {
        info.add(index, service);
        index++;
        this.ChooseService=service;
    }

    public void chooseServiceType(String service, double price) {
        Main.price = price;
        info.add(index, service);
        index++;
    }

    public void BrandDevice(String BrandDevice) {
        info.add(index, BrandDevice);
        index++;
    }

    public void fillInformation(String username, String mobile, String deviceType) {
        info.add(index, username);
        index++;
        info.add(index, mobile);
        index++;
        info.add(index, deviceType);
        index++;
    }

    public void gender(String gender) {
        info.add(index, gender);
        index++;
    }

    public String showformation(int i) {
        // return info from ArrayList
        return info.get(i);
    }

    public double Getprice() {
        return price;
    }

    public static void setPrice(double price) {
        Main.price = price;
    }

    public void time(String time, String month, String day) {
        info.add(index, time);
        index++;
        info.add(index, month);
        index++;
        info.add(index, day);
        index++;
    }

    public void location(String location) {
        info.add(index, location);
        index++;
    }

    public void payment(String discount) {
        if (discount.equals("FCIT")) {  // Discout ? // FCIT Discount 15%
            price = price - (price * Discount);
            Discount = 0;
        } else {
            price = price;
        }
    }
    public void p(String pay){
      
       info.add(index, pay);
       index++;
    }
    
}
