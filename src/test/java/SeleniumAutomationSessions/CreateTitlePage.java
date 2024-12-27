package SeleniumAutomationSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTitlePage {

	public static void main(String[] args) {
		// Open Browser
		ChromeDriver cd=new ChromeDriver();
		// Open the Application
		cd.get("https://www.amazon.com/");
		//Get Title of Page
		String title=cd.getTitle();
		System.out.println(title);
		// Current URL of the Page
		String url=cd.getCurrentUrl();
		System.out.println(url);
		//Maximize Screen
		cd.manage().window().maximize();
		// Close Application
		cd.quit();

	}

}
