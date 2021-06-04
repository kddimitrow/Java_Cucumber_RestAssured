package CucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/featuresAdd",
        glue = "stepDefinition1"
)

public class TestRunnerAddPlace {
}
