//Employee Id: 20450630
//Automate the Scenario:
1.Open Chrome Browser.
2.Maximize the browser window.
3.Navigate to “https://demo.opencart.com/ ”.
4.Validate and  print PASS if the title of the page matches with “Your Store ” else FAIL
5.Navigate to http://www.facebook.com
6.Navigate back.
7.Print the URL of the current page.
8.Navigate forward.
9Reload the page.
10.Close the Browser


package javaProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSeli
{

      public static void main(String[] args)
      {
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            driver.get("https://chrome.google.com");
            driver.navigate().to("https://demo.opencart.com/");
            String title = driver.getTitle();
            if(title == "Your Store")
            {
                  System.out.println("PASS");
            }
            else
            {
                  System.out.println("FAIL");
            }
            
            driver.navigate().to("http://www.facebook.com");
            driver.navigate().back();
            System.out.print("printing url of previous page: " + driver.getCurrentUrl());
            driver.navigate().forward();
            driver.navigate().refresh();
            driver.close();
      }

}