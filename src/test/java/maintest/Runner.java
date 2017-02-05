package maintest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/html"},
		features={"feature/Use_case2.feature"},
		glue={"maintest","Stepdefinition"},
		monochrome=true

      )
public class Runner {

}
