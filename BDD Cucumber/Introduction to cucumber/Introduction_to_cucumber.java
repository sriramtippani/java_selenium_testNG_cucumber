//Employee Id:20450630

package cucumber import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager; import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver; @RunWith(Cucumber.class)
public class Introduction_to_cucumber 
{     
    WebDriver driver;

    @Given("^Launch (.+)$")
    public void launch(String browsername) throws Throwable 
   {
        if (browsername.matches("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if (browsername.matches("Firefox")) 
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if (browsername.matches("Internet Explorer")) 
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
    } 
}