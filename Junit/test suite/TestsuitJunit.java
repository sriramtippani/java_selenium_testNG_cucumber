//Employee Id: 20450630
//Create a test suite with all the above mentioned exercises and execute the same

package jun;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({
      MyUnitTest.class,
      EmployeeTest.class,
      PalindromeTest.class
})
public class TestsuitJunit {

}