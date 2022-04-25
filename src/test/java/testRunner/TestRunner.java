package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"C:\\Users\\yolukoya\\MyWorkSpace\\OLRForm\\src\\test\\resources\\features" },

		glue = { "stepDefinitions", "appHooks" }, dryRun = false, tags = "not @skip", // if you want to skip a scenario

		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/", "rerun:target/rerun.txt" }, monochrome = true
				
				

)

public class TestRunner {

}
