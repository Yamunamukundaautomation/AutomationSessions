package SeleniumAutomationSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorID {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver ab=new ChromeDriver();
		ab.get("https://www.facebook.com/login.php/");
		ab.manage().window().maximize();
		Thread.sleep(4000);
		String title=ab.getTitle();
		System.out.println(title);
		String url=ab.getCurrentUrl();
		System.out.println(url);
		ab.findElement(By.id("email")).sendKeys("yamuna123@gmail.com");
		Thread.sleep(4000);
		ab.findElement(By.id("pass")).sendKeys("12345");
		Thread.sleep(3000);
		ab.findElement(By.id("loginbutton")).click();
		ab.close();

	}

}
