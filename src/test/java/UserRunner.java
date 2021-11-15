import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"pretty", "html:target/UserRunner.html",
                "rerun:target/failed-scenarios/User.txt"},
        features = "src/main/resources/features/User.feature",
        glue = {"steps"},
        stepNotifications = true
        // tags = "@user-mgt"
)


public class UserRunner {
}
