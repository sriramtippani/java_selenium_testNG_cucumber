//Employee Id: 20450630
//Create the following class and implement the method to concatenate two strings and return the result,
Class Name: MyUnit
Method: stringConcat(String,String):String
Create a Junit test class to test the above class.

package jun;

import org.junit.Assert;
import org.junit.Test;

public class MyUnitTest
{
      MyUnit myunit;
      @Test
      public void stringConcatTest()
      {
            myunit=new MyUnit();
            String res=myunit.Stringconcat("wipro","tech");
            Assert.assertEquals("wiprotech",res);
      }
}