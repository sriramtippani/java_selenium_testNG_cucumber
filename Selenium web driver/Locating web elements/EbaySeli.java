//Employee Id: 20450630
//1.Open any Browser (Mozilla firefox, Chrome, Internet Explorer).
2.Browse to Ebay Website.
3.On the homepage, there is a search box, type some product (say Apple).
4.From ALl categories dropdown, select the category of your product (say Music).
5.Click Search button.
6.print all products along with scrolling down
7.print Nth product say 10th Product


package javaProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbaySeli
{

      public static void main(String[] args)
      {
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
            
            driver.get("https://www.ebay.com/");
            driver.findElement(By.xpath("//input[@name= '_nkw']")).sendKeys("Apple");
            
            Select s = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
            s.selectByVisibleText("Music");
            
            driver.findElement(By.xpath("//input[@value= 'Search']")).click();
            
            List<WebElement> ea = driver.findElements(By.xpath("//span[@role= 'heading']"));
            for(WebElement x : ea)
            {
                  System.out.println(x.getText());
            }
            
            WebElement ea1 = driver.findElement(By.xpath("(//span[@role= 'heading'])[10]"));
            System.out.println(ea1.getText());
      }

}