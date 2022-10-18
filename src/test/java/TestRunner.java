import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utils.SendReportScreenShootToEmail;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        features = {"src/test/resources/features/"},
        glue={"stepDef"}
        ,plugin = {"json:target/cucumber.json"}
        ,tags = "@Regression"
)

public class TestRunner {
//    @AfterClass
//    public static void afterClass() throws IOException, InterruptedException {
//        SendReportScreenShootToEmail.SendEmail();
//    }
}
