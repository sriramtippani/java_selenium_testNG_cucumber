//Employee Id:20450630
//src/test/java ----> testing ----> Testing_DemoTest.java

package testing;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing_DemoTest

{

//Google google;

WebDriver driver;


@DataProvider(name="value1")

public String[] priovideTestData()

{

return new String[] {"java", "Selenium", "Testing Concept"};

}


@BeforeClass

public void setup()

{

WebDriverManager.chromedriver().setup();

driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

}


@Test(dataProvider = "value1")//, dataProviderClass = Google.class)

public void searchValue(String value)

{

//google.search(value);

driver.get("https://www.google.com/");

driver.findElement(By.name("q")).sendKeys(value);

driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

driver.navigate().back();

}


@AfterClass

public void tearDown()

{

//google.exitTab();

driver.quit();

}

}