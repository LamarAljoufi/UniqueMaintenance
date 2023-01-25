/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;		
import static org.junit.Assert.*;

/**
 *
 * @author ra52m
 */
public class MainTest {

    public MainTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Ignore
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chooseService method, of class Main.
     */
    @Test
    public void testChooseService() {
        System.out.println("chooseService");
        String service = "maintenance";
        Main instance = new Main();
        instance.chooseService("accessories");
        instance.chooseService(service);
    } // Done, Set Service

    /**
     * Test of chooseServiceType method, of class Main.
     */
    @Test
    public void testChooseServiceType() {
        System.out.println("chooseServiceType");
        String service = "Ipad Screan Protector";
        double price = 0;
        Main instance = new Main();
        instance.BrandDevice("Ipad Screan Protector");
        String ExpectResult = instance.showformation(0); // 1 = abeer
        assertEquals(service, ExpectResult);
    } // ?

    /**
     * Test of BrandDevice method, of class Main.
     */
    @Test
    public void testBrandDevice() {
        System.out.println("BrandDevice");
        String BrandDevice = "Apple";
        Main instance = new Main();
        instance.BrandDevice("Samsung");
        String expecResult = instance.showformation(0);
        assertNotEquals(expecResult, BrandDevice);
    } // Done

    /**
     * Test of fillInformation method, of class Main.
     */
    @Test(timeout = 500)
    public void testFillInformation() {
        System.out.println("fillInformation");
        String username = "Abeer";
        String mobile = "0565656565";
        String deviceType = "Iphone";
        Main instance = new Main();
        instance.fillInformation("Abeer", "0565656565", deviceType);
        String ExpResult1 = instance.showformation(0);
        String ExpectResult2 = instance.showformation(1);
        assertEquals(username, ExpResult1); // test user name is equal
        assertNotNull(mobile, ExpectResult2); // test mobile number isn't null
    } // 2 Tests , Done

    /**
     * Test of gender method, of class Main.
     */
    @Test
    public void testGender() {
        System.out.println("gender");
        String gender = "Female";
        Main instance = new Main();
        instance.gender("Male");
        String ExpResult = instance.showformation(0);
        assertNotSame(ExpResult, gender);
    } // Done

    /**
     * Test of showformation method, of class Main.
     */
    @Test(timeout = 200)
    public void testShowformation() {
        System.out.println("showformation");
        int i = 0;
        Main instance = new Main();
        String expResult = "Abeer";
        String result = instance.showformation(i);
        assertSame(expResult, result);
    }

    /**
     * Test of price method, of class Main.
     */
    @Test
    public void testGetprice() {
        System.out.println("price");
        Main instance = new Main();
        double expResult = 0.0;
        double result = instance.Getprice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of time method, of class Main.
     */
    @Test
    public void testTime() {
        System.out.println("time");
        String time = "";
        String month = "";
        String day = "";
        Main instance = new Main();
        instance.time(time, month, day);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of location method, of class Main.
     */
    @Test
    public void testLocation() {
        System.out.println("location");
        String location = "";
        Main instance = new Main();
        instance.location(location);
        // TODO review the generated test code and remove the default call to fail.
    }


    /**
     * Test of payment method, of class Main.
     */
    @Ignore
    @Test
    public void testPayment() {
        System.out.println("payment");
        String discount = "FCIT";
        Main instance = new Main();
        instance.payment(discount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
