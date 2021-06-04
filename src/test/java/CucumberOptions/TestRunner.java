package CucumberOptions;

import io.cucumber.core.options.CucumberOptionsAnnotationParser;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;
// must use specific dependencies which we have in the pom.xml file


//first way
@RunWith(Cucumber.class)
@CucumberOptions(
                features = "src/test/java/features/Login.feature",
                glue = "stepDefinitions"

                //another syntax way
            /*  features = {"src/test/java/features"},
                glue = "StepDefinitions"*/
)

//second way
/*@CucumberOptions(
        features = {"src/test/java/features"},
        glue = "StepDefinitions"
)*/


public class TestRunner {





}
