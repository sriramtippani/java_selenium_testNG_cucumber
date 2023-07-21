//Employee Id:20450630
//Inspect the  Text box of https://demo.opencart.com/  > My Account > Login
Share the id value of E-Mail Address and Password

package WebTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartLogin 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//span [text()=\"My Account\"]")).click();
		driver.findElement(By.xpath("//a [text()=\"Login\"]")).click();
		driver.findElement(By.id("input-email")).sendKeys("sriramtippani2000@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Any@1234");
		

	}

}
