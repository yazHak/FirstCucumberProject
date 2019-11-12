package cucumberoptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featurefiles", glue = "stepdefinitions", tags = {"@Amazon"})

public class TestRunner {

}


