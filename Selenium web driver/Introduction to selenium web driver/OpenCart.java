// Employee Id: 20450630
//write the automation selenium script to launch https://demo.opencart.com/ application and  display the title and currect url in the console


package WebTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}