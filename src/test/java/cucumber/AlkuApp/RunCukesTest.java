package cucumber.AlkuApp;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/Cursos_Test.feature",tags = {"~@Scenario1"}, plugin = "json:target/cucumber-report-json")
public class RunCukesTest {
	

}
