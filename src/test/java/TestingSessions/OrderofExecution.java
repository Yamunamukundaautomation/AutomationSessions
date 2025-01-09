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

public class OrderofExecution {
@BeforeSuite
public void connectWithDB() {
	System.out.println("BS-ConnectWithDB");
	System.out.println("BS-ConnectWithAPI");
}
@BeforeTest
public void createUser() {
	System.out.println("BT-CreateUser");
}
@BeforeClass
public void openBrowser() {
	System.out.println("BC-LoginToApp");
}
@BeforeMethod
public void loginToApp() {
	System.out.println("BM-loginToApp");
	System.out.println("BM-clearcache");
}
@Test
public void asearchTest() {
	System.out.println("search for the product test");
}
@Test
public void bcartTest() {
	System.out.println("Add to cart test");
}
@Test
public void cpaymentTest() {
	System.out.println("Payment Section test");
}
@AfterMethod
public void logout() {
	System.out.println("AM-Logout");
}
@AfterClass
public void closeBrowser() {
	System.out.println("AM-Close Browser");
}
@AfterTest
public void deleteUser() {
	System.out.println("AT-Delete User");
}
@AfterSuite
public void disconnectWithDB() {
	System.out.println("AS-DisconectWithDB");
	System.out.println("AS-DisconcetWithASI");
}
}
