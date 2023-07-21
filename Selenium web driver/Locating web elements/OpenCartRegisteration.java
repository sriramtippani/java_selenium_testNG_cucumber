//Employee Id: 20450630
//Inspect the  Text box of https://demo.opencart.com/  > My Account > Registration page .
Share the name value of all the Text box(First Name,Last Name,E-Mail,Password).

package WebTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartRegisteration 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//span [text()= 'My Account']")).click();
		driver.findElement(By.xpath("//ul[@ class= 'dropdown-menu dropdown-menu-right show']/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id= 'input-firstname']")).sendKeys("sriram");
		driver.findElement(By.xpath("//input[@id= 'input-lastname']")).sendKeys("tippani");
		driver.findElement(By.xpath("//input[@id= 'input-email']")).sendKeys("sriramtippani2000@gmail.com");
		driver.findElement(By.xpath("//input[@id= 'input-password']")).sendKeys("Any@1234");
		
		

	}

}
