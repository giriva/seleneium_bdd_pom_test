package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/giriprasadvasudevan/Downloads/herokuapp 2/resources/test1.feature",
				glue={"stepdefinition"}
		)
public class TestRunner {

}
