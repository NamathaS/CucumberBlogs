package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\namat\\Documents\\Testing\\Automation\\CucumberBlogs\\SeleniumCucumberBlogs\\src\\test\\resources\\features",
        glue="stepDef",
        plugin = { "json:target/cucumber-reports/cucumber.json",
                "pretty", "html:target/html-report/cucumber-html-reports.html",
                "junit:target/cucumber-reports/cucumber.xml" }
        )
public class Runner extends AbstractTestNGCucumberTests {

}
