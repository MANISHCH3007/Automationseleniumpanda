package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = {
		"stepdefination" }, tags = "@Reg", plugin = "html:target/testReport/test.html")
public class TestRunner {

}
