package SeleniumAutomationSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CombinationofANDOR {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver ab=new FirefoxDriver();
		ab.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		Thread.sleep(2000);
		ab.manage().window().maximize();
		String title=ab.getTitle();
		System.out.println(title);
		String url=ab.getCurrentUrl();
		System.out.println(url);
		// AND-----Both atritube's are same
		ab.findElement(By.xpath("//*[@type='text'and@id='FirstName']")).sendKeys("mukunda");
		Thread.sleep(2000);
		// OR-----Both atritube's are different
		ab.findElement(By.xpath("//*[@type='abc'or@name='Company']")).sendKeys("Radhakrishna Solutions");
		Thread.sleep(2000);
		ab.quit();
	}

}
