import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        features = {"src/test/resources/features/"},
        glue={"stepDef"}
        ,plugin = {"json:target/cucumber.json"}
        ,tags = "@Regression"
)

public class TestRunner {
}
