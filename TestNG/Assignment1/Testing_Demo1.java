//Employee Id:20450630
/*  src/test/java ----> testing ----> Testing_Demo1.java */

package testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Testing_Demo;

public class Testing_Demo1
{
      
      Testing_Demo testing_demo;
      @BeforeTest
      public void setup()
      {
            testing_demo=new Testing_Demo(); // create object for parent class in this class to get values and methods
            testing_demo.setup();
      }
      
      @Test(priority=1)
      public void openURL()
      {
            testing_demo.openURL("http://demo.guru99.com/test/newtours/index.php");
      }
      
      @Test(priority=2)
      public void functionality()
      {
            String value1 = "sriram";
            String value2 = "durga123@";
            testing_demo.login(value1, value2);
      }
      
      @AfterTest
      public void exitWeb()
      {
            testing_demo.tearDown();
      }
}