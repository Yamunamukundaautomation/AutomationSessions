package SeleniumAutomationSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorofTageName {

	public static void main(String[] args) {
		ChromeDriver cc=new ChromeDriver();
		cc.get("https://demo.nopcommerce.com/digital-downloads");
		cc.manage().window().maximize();
		String title=cc.getTitle();
		System.out.println(title);
		String url=cc.getCurrentUrl();
		System.out.println(url);
		List<WebElement>list=cc.findElements(By.tagName("a"));
		for(WebElement alllink:list)
		{
			System.out.println(alllink.getText());
		}
		cc.close();

	}

}
