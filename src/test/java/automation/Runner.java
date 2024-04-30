package automation;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;


import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html"},
        features = "src/main/resources/features/LogIn.feature",
        glue = {"glue", "automation", "automation/utils"}
)
public class Runner {

}
