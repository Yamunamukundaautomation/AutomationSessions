package TestingSessions;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoOnFluentWait {
	ChromeDriver odriver;
	@BeforeMethod
	void launchBrowser() {
		odriver = new ChromeDriver();
		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		odriver.manage().window().maximize();
	}
	@Test
	void getTitle() {
		FluentWait wait=new FluentWait(odriver);
		wait.withTimeout(Duration.ofSeconds(35));
		wait.pollingEvery(Duration.ofSeconds(35));
		wait.ignoring(NoSuchElementException.class);
	String title=odriver.getTitle();
	System.out.println(title);
	
	}
	@AfterMethod
	void closeApp()
	{
		odriver.quit();
	}
	
	

}
