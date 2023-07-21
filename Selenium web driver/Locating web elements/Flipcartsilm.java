//Employee Id: 20450630
//Automate the Scenario:
1.Open a Browser (any browser say chrome.)
2.Navigate to Flipkart.
3. find the number of links on the homepage of Flipkart and print in the console
4.Write another method to print urls of all the links on the page of Flipkart in the console.


package javaProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcartsilm
{

      public static void main(String[] args)
      {
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
      
            driver.navigate().to("https://www.flipkart.com");
            List<WebElement> link = driver.findElements(By.xpath("//a"));
            System.out.println("total links: "+link.size());
            System.out.println();
            for(WebElement eachLink : link)
            {
                  System.out.println(eachLink.getAttribute("href"));
            }
      
      }

}