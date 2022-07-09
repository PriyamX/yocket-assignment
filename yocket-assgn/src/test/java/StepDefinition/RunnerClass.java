package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepDefinition" }, monochrome = true,

		plugin = { "pretty", "json:target/JSONReports/report.json", "html:target/HtmlReports",
				"junit:target/JUnitReports/report.xml" }, tags = "@YocketMasterDetails")

public class RunnerClass {

}
