package SeleniumAutomationSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		String title=cd.getTitle();
		System.out.println(title);
		String url=cd.getCurrentUrl();
		System.out.println(url);
		cd.findElement(By.id("Email")).sendKeys("yamunamukunda@gmail.com");
		cd.findElement(By.id("Password")).sendKeys("12345678");
		Thread.sleep(3000);
		cd.quit();
		

	}

}
