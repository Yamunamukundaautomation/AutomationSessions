package SeleniumAutomationSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorofRelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.facebook.com/login/");
		cd.manage().window().maximize();
		String title=cd.getCurrentUrl();
		System.out.println(title);
		String url=cd.getCurrentUrl();
		System.out.println(url);
		// Relative Xpath Attributes for user
		// id------>//input[@id='email']
		// name------>//input[@name='email']
		// type------>//input[@type='text']
		// PlaceHolder------>//input[@placeholder='Email address or phone number']
		cd.findElement(By.xpath("//input[@id='email']")).sendKeys("yamunamukunda@gmail.com");
		Thread.sleep(2000);
		cd.findElement(By.xpath("//input[@id='pass']")).sendKeys("yamunamukunda");
		Thread.sleep(2000);
		cd.close();
		

	}

}
