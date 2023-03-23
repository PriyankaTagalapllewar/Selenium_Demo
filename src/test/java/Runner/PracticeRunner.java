package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty" }, features = "src/test/resources/Features/Practice.feature", glue = {
		"stepdefinition", "Hooks" }, monochrome = true, dryRun = false)
public class PracticeRunner extends AbstractTestNGCucumberTests {

}
