package Runner_package;
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
 
@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/com/features",
glue = "SearchHotels_StepDefinition",
plugin = {"pretty", "html:target/cucumber-reports.html"}
		
		)
 
public class Runner_Class {
 
	
	
	}