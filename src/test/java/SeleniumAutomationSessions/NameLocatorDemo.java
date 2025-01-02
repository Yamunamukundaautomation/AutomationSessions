package SeleniumAutomationSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameLocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("username")).sendKeys("Radhakrishna");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Krishna@123");
		Thread.sleep(5000);
		driver.quit();
	}

}
