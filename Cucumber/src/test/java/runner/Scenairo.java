package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/feature/Data.feature",
glue="stepsdef",
monochrome=true,
publish= true)





	

public class Scenairo extends AbstractTestNGCucumberTests {

	@DataProvider(parallel = true)
    public Object[][] scenarios() {
		return super.scenarios();
	}
}