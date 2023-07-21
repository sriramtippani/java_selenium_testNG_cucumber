//Employee Id:20450630
/*  src/main/java ----> pages ----> Testing_Demo.java */


package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing_Demo
{
      WebDriver driver;
      By userParu = By.name("userName");
      By passwordParru = By.name("password");
      public void setup()
      {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      }
      
      public void openURL(String linkWeb)
      {
            driver.get(linkWeb);
      }
      
      public void login(String value1, String value2)
      {
            driver.findElement(userParu).sendKeys(value1);
            driver.findElement(passwordParru).sendKeys(value2);
            driver.findElement(By.xpath("//input[@value= 'Submit']")).click();
      }
      
      public void tearDown()
      {
            driver.quit();
      }     
}