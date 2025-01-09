package TestingSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionOrder {
	  // 1
    @BeforeSuite
    public void connectWithDB() {
        System.out.println("BS - connectWithAPI");
    }
    // 2
    @BeforeTest
    public void connection() {
        System.out.println("connection");
    }
    // 3
    @BeforeClass
    public void openBrowser() {
        System.out.println("BC -- openBrowser");
    }
    @BeforeMethod
    public void openBrowser1() {
        System.out.println("BC -- openBrowser");
    }
         
    @Test
    public void createUser() {
        System.out.println("search for the product");
    }
    
    @Test
    public void showUser() {
        System.out.println("add to cart test");
    }
    
    @Test
    public void updateUser() {
        System.out.println("payment section test");
    }
    @Test
    public void deleteuser() {
        System.out.println("payment section test");
    }
    
    @AfterMethod
    public void logout() {
        System.out.println("AM -- logout");
    }
    
    @AfterClass
    public void closeBrowser() {
        System.out.println("AC -- close browser");
    }
    
    @AfterTest
    public void deleteUser() {
        System.out.println("AT -- delete user");
    }
    
    @AfterSuite
    public void disconnectWithDB() {
        System.out.println("AS -- disconnectWithDB");
    }

}
