package SDETPkg;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\balabhadrunia\\eclipse-workspace\\testing\\src\\test\\java\\Features\\OrangeHRM.Feature",
		glue="StepDefinitions",
		dryRun=false, 
		strict=true, 
		monochrome=true,
		plugin= {"pretty", "html:test-output"},
		tags= {"@SanityTest"}
		)

public class Selenium_16_17_18_CucumberScenarios {

}
