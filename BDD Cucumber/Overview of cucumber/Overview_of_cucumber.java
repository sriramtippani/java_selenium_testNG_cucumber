//Employee Id:20450630

package cucumber; import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager; import java.time.Duration; import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver; @RunWith(Cucumber.class)
public class Overview_of_cucumber 
{
    WebDriver driver;     

    @Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable 
     {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://petstore.octoperf.com/");
        driver.findElement(By.linkText("Enter the Store")).click();
        driver.findElement(By.linkText("Sign In")).click();     
     }     
    
    @When("^enter valid (.+) and (.+) and click login$")
    public void enter_valid_and_and_click_login(String username, String password) throws Throwable 
     {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);  // It will takes from feature file
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);   // It will takes from feature file
        driver.findElement(By.xpath("//input[@name='signon']")).click();
     }     

    @When("^Add to cart for fish And proceed to checkout And click continue And confirm$")
    public void add_to_cart_for_fish_and_proceed_to_checkout_and_click_continue_and_confirm() throws Throwable 
     {
        driver.findElement(By.xpath("//div[@id=\"SidebarContent\"]/a[1]")).click();
        driver.findElement(By.linkText("FI-SW-01")).click();
        driver.findElement(By.xpath("//div[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
        driver.findElement(By.linkText("Proceed to Checkout")).click();
        driver.findElement(By.xpath("//input[@name='newOrder']")).click();
        driver.findElement(By.linkText("Confirm")).click();
     }     

    @When("^Add to cart for bird And proceed to checkout And click continue And confirm$")
    public void add_to_cart_for_bird_and_proceed_to_checkout_and_click_continue_and_confirm() throws Throwable 
     {
        driver.findElement(By.xpath("//div[@id=\"SidebarContent\"]/a[5]")).click();
        driver.findElement(By.linkText("AV-CB-01")).click();
        driver.findElement(By.xpath("//div[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
        driver.findElement(By.linkText("Proceed to Checkout")).click();
        driver.findElement(By.xpath("//input[@name='newOrder']")).click();
        driver.findElement(By.linkText("Confirm")).click();
     }     

    @Then("^user should login successfully$")
    public void user_should_login_successfully() throws Throwable 
     {
        if(driver.findElement(By.xpath("//div[@id='WelcomeContent']")).isDisplayed())
        {
            System.out.println("user is successfully logged in");
        }
        else
        {
            System.out.println("user is not logged in");
        }
     }     

    @Then("^Order for fish should be submitted$")
    public void order_for_fish_should_be_submitted() throws Throwable 
     {
        if(driver.findElement(By.tagName("li")).isDisplayed())
        {
            System.out.println("order submitted");
        }
        else
        {
            System.out.println("order not submitted");
        }
        driver.findElement(By.linkText("Return to Main Menu")).click();
     }     

    @Then("^Order for bird should be submitted$")
    public void order_for_bird_should_be_submitted() throws Throwable 
     {
        if(driver.findElement(By.tagName("li")).isDisplayed())
        {
            System.out.println("order submitted");
        }
        else
        {
            System.out.println("order not submitted");
        }
        driver.findElement(By.linkText("Return to Main Menu")).click();
     } 
}