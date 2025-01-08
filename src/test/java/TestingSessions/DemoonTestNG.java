package TestingSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoonTestNG {
	@Test
	void login() throws InterruptedException
	{
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("https://www.facebook.com/login.php/");
		fd.manage().window().maximize();
		Thread.sleep(4000);
		String title=fd.getTitle();
		System.out.println(title);
		String url=fd.getCurrentUrl();
		System.out.println(url);
		fd.findElement(By.id("email")).sendKeys("yamuna123@gmail.com");
		Thread.sleep(4000);
		fd.findElement(By.name("pass")).sendKeys("12345");
		Thread.sleep(3000);
		fd.findElement(By.id("loginbutton")).click();
		fd.close();
	}

}
