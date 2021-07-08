package testRunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/"}, glue = "stepDefinitions", monochrome = true
,plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber-reports/cucumber.json"}
//		, plugin = { "pretty", "html:target/site/cucumber-pretty" }, 
)
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}





