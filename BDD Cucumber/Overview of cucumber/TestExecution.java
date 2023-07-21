//Employee Id:20450630

package cucumber; import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/cucumber/Introduction_to_cucumber.feature", "src/test/java/cucumber/Overview_of_cucumber.feature"}
        ,glue={"cucumber"}  //package name
        ,tags={"@Initialize","@validlogin","@validsubmit1","@validsubmit2"}
        )
public class TestExecution
{
}