package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;





@CucumberOptions
			(
			features=".//Features/Login",
			glue="stepDefinations",tags = {"@Sanity,@Smoke"},
			dryRun=false,
			monochrome=true,
			plugin={"pretty","html:test-output"}
			
					)
public class TestRunner extends AbstractTestNGCucumberTests {

}

