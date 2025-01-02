package SeleniumAutomationSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorofClass {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(1000);
		driver.findElement(By.className("form_input")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.className("form_input")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.close();

	}

}
