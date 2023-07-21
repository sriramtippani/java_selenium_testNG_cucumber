//Employee Id: 20450630
//Launch the https://demo.guru99.com/test/newtours/login.php application in any 2 browser


package WebTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Guru99 
{

	public static void main(String[] args) 
	{
//		ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();     // running at edge browser
		driver.get("https://demo.guru99.com/test/newtours/login.php");

	}

}
