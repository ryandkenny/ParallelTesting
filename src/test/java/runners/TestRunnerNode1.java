package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
 features = "src/test/java/features/",
	glue = {"stepDefs"},
 	plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
 			 "junit:target/cucumber-reports/Cucumber.xml"},
 	monochrome = true,
 	tags = "@node1Chrome"
 )
public class TestRunnerNode1 extends AbstractTestNGCucumberTests {
}
