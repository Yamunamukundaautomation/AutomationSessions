package SeleniumAutomationSessions;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NagivationsMethods {

	public static void main(String[] args) {
		//1. Open the Browser
		FirefoxDriver odriver=new FirefoxDriver();
		odriver.navigate().to("https://flipkart.com/");
		// or odriver.get("https://flipkart.com/");
		// 2. Backword click
		odriver.navigate().back();
		// 3.forward click
		odriver.navigate().forward();
		//4. refresh click
		odriver.navigate().refresh();
		//5. close app
		//odriver.quit();
		// or another option close application
		odriver.close();
		

	}

}
