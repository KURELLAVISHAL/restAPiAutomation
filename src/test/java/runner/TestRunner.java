package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(monochrome = true,
        tags = "@regression",
        features = "src/test/resources/",
        plugin = {"pretty", "html:target/report.html"},
        glue = "StepDefinations")

public class TestRunner {

}