package SeleniumAutomationSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocator1ID {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver ab=new ChromeDriver();
		ab.get("https://www.saucedemo.com/");
		ab.manage().window().maximize();
		Thread.sleep(4000);
		String title=ab.getTitle();
		System.out.println(title);
		String url=ab.getCurrentUrl();
		System.out.println(url);
		ab.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		ab.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		ab.findElement(By.id("login-button")).click();
		ab.close();
		
	}

}
