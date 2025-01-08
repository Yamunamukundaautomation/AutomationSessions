package SeleniumAutomationSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DCssSelectorofClass {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver fx=new FirefoxDriver();
		fx.get("https://www.saucedemo.com/");
		fx.manage().window().maximize();
		String title=fx.getTitle();
		System.out.println(title);
		String url=fx.getCurrentUrl();
		System.out.println(url);
		fx.findElement(By.cssSelector("input.form_input")).sendKeys("9848012345");
		//fx.findElement(By.cssSelector("input[class='input_error form_input']")).sendKeys("radhakrishna");
		//fx.findElement(By.cssSelector(".form_input")).sendKeys("9848012345");
		Thread.sleep(2000);
		fx.close();
	}
	
	

}
