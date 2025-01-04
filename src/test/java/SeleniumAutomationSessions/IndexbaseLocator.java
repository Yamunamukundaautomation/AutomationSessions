package SeleniumAutomationSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexbaseLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		obj.manage().window().maximize();
		String title=obj.getTitle();
		System.out.println(title);
		String url=obj.getCurrentUrl();
		System.out.println(url);
		obj.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Phones");
		Thread.sleep(2000);
		obj.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("m");
		Thread.sleep(2000);
		obj.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("y");
		obj.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("yamuna");
		Thread.sleep(2000);
		obj.close();

	}

}
