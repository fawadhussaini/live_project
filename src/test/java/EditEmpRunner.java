import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"pretty", "html:target/EditEmpRunner.html",
                "rerun:target/failed-scenarios/EditEmp.txt"},
        features = "src/main/resources/features/EditEmp.feature",
        glue = {"steps"},
        stepNotifications = true,
        tags = "@edit"
)


public class EditEmpRunner {
}
