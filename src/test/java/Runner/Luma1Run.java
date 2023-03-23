package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty" }, features = "src/test/resources/Features/LumaShop.feature", glue = {
		"stepdefinition", "Hooks" }, monochrome = true, dryRun = false)
public class Luma1Run extends AbstractTestNGCucumberTests {
	//@Override
	//@DataProvider(parallel = true)
	//public Object[][] scenarios() {
		//return super.scenarios();
	}


