package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"C:\\Users\\HP\\Desktop\\Selenium\\Selenium_WorkSpace\\CucumberProject1\\src\\test\\java\\features"}, // path of the features file
		glue = {"stepDefinitions"}, // Path of the stepDefinitions file
		plugin = {"pretty"},
		monochrome = true, // Displays the proper output in a proper readable format
		strict = true, // it will check if any steps are not defined in step definitions file
		dryRun = false // to check the mapping is proper between feature file and step def file
		
		)

public class ScotiaTest {

}
