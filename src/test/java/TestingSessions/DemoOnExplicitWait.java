package TestingSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoOnExplicitWait {
	ChromeDriver obj;
	@BeforeMethod
	void launchBrowser()
	{
		obj=new ChromeDriver();
		obj.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		obj.manage().window().maximize();
	}
	@Test(priority=1)
	void loginToApp()
	{
		WebDriverWait wait1=new WebDriverWait(obj,Duration.ofSeconds(8));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='FirstName']")));
        
        obj.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("problem_user");
		WebDriverWait wait2=new WebDriverWait(obj,Duration.ofSeconds(9));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='LastName']")));
        obj.findElement(By.xpath("//*[@id='LastName']")).sendKeys("problem_user");
        
        WebDriverWait wait3=new WebDriverWait(obj,Duration.ofSeconds(6));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Company']")));
        obj.findElement(By.xpath("//*[@id='Company']")).sendKeys("problem_user");
	}
@AfterMethod
void closeApp()
{
	obj.quit();
}
	

}
