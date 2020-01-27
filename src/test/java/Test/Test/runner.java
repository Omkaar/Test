package Test.Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "testFeature",
     			  glue ="",
				  tags = {"@myTest"},
				 plugin = {"json:target/cucumber-report/error/cucumber.json"})						
public class runner{

}
