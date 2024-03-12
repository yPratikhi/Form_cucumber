package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith (Cucumber.class)
@io.cucumber.testng.CucumberOptions(
		features = "C:\\Users\\yprat\\OneDrive\\Desktop\\SDET\\TestNgDemo\\src\\test\\resources\\Login\\Login.feature",
		glue = "steps"
		)
public class loginRunner extends AbstractTestNGCucumberTests {

}
