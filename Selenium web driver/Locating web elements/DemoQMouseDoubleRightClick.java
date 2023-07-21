//Employee Id: 20450630
//Choose the Unique locating elements for different types of Buttons(Double Click , Right Click Me, Click Me) from the link https://demoqa.com/buttons

package javaProject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DemoQMouseDoubleRightClick
{

      public static void main(String[] args)
      {
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            driver.get("https://demoqa.com/buttons");
            
            WebElement w1=driver.findElement(By.xpath("(//button [@class= 'btn btn-primary'])[1]"));              
            Actions act = new Actions(driver);
            act.doubleClick(w1).perform();
            
            WebElement w2 = driver.findElement(By.xpath("(//button [@class= 'btn btn-primary'])[2]"));
            Actions act1 = new Actions(driver);
            act1.contextClick(w2).perform();
            
            driver.findElement(By.xpath("(//button [@class= 'btn btn-primary'])[3]")).click();
      }

}