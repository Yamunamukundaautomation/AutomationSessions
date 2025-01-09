package TestingSessions;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2ExplictWait {
	
	ChromeDriver obj;
	@BeforeMethod
	void launchBrowser()
	{
		obj=new ChromeDriver();
		obj.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		obj.manage().window().maximize();
	}
	@Test
	void getTitle()
	{
		WebDriverWait wait=new WebDriverWait(obj,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.titleContains("nopCommerce demo store. Register"));
	String title=obj.getTitle();
	System.out.println(title);
	}
	@AfterMethod
	void closeApp()
	{
		obj.quit();
	}
	

}
