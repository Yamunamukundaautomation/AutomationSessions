package SeleniumAutomationSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemofcssSelectorID {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver bos=new ChromeDriver();
		bos.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		Thread.sleep(2000);
		bos.manage().window().maximize();
		String title=bos.getTitle();
		System.out.println(title);
		String url=bos.getCurrentUrl();
		System.out.println(url);
		bos.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("problem_user");
		Thread.sleep(1500);
		bos.findElement(By.cssSelector("#LastName")).sendKeys("sairam");
		Thread.sleep(1500);
		bos.findElement(By.cssSelector("#Email")).sendKeys("yamuna@gmail.com");
		Thread.sleep(2000);
		bos.quit();
		
		

	}

}
