package TestingSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoSession2 {
	@Test
	void menu() throws InterruptedException
	{
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		cd.manage().window().maximize();
		String title=cd.getTitle();
		System.out.println(title);
		String url=cd.getCurrentUrl();
		System.out.println(url);
		//cd.findElement(By.linkText("Digital downloads")).click();
		cd.findElement(By.partialLinkText("Digital")).click();
		Thread.sleep(4000);
		cd.close();
		
	}

}
