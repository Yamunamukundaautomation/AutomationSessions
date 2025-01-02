package SeleniumAutomationSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLocator {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("https://www.actitime.com/free-online-trial");
		String title=fd.getTitle();
		System.out.println(title);
		String url=fd.getCurrentUrl();
		System.out.println(url);
		fd.findElement(By.id("FirstName")).sendKeys("Mukunda");
		fd.findElement(By.id("LastName")).sendKeys("Yamuna");
		fd.findElement(By.id("Email")).sendKeys("yamunamukunda@gmail.com");
		fd.findElement(By.id("Company")).sendKeys("TechMentorHub");
		Thread.sleep(3000);
		fd.close();

	}

}
