package SeleniumAutomationSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorofAbsolute {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")).sendKeys("Yamuna@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[2]/div/div/input")).sendKeys("muku123");
		Thread.sleep(2000);
		driver.quit();
	}

}
