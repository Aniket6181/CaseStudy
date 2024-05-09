
package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test/resources/features/caseStudy.feature",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"html: target/reports/HtmlReports.html"
				}
		)
		

public class TestRunner extends AbstractTestNGCucumberTests{

}
