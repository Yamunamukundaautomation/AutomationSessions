package TestingSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExecutionOrderRealtime {
public ChromeDriver odriver;
    
    
    @BeforeMethod
    void launchBrowser()
    {
         //1:Open the Browser
         odriver=new ChromeDriver();
        
        //2.Open the Application
        odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
        
        
        //3.Maximize the screen
        odriver.manage().window().maximize();
        
        
    }
    
    
    
    @Test(priority=1)
    void getTitle() throws InterruptedException
    {
        String title=odriver.getTitle();
        System.out.println(title);
        
        
        
    }
    
    
    
    @Test(priority=2)
    void getcurrentUrl() throws InterruptedException
    {
        String url=odriver.getCurrentUrl();
        System.out.println(url);
        
        
        
    }
    
    
    @Test(priority=3)
    void loginToApp() throws InterruptedException
    {
        
        //6.Pass value into input text box
        odriver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("problem_user");
        Thread.sleep(3000);
        odriver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("problem_user");
        Thread.sleep(3000);
        
        odriver.findElement(By.xpath("//*[@id='Company']")).sendKeys("problem_user");
        Thread.sleep(3000);
    }
    
    
    
    
    
    @AfterMethod
    void closeAPP()
    {
        odriver.quit();
    }
    
    
}