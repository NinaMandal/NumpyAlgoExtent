package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				
					features= {"C:\\Users\\dimpl\\OneDrive\\Documents\\NumpyNinja\\Practice1\\NumpyDsAlgo1\\NumpyDsAlgo\\src\\test\\java\\FeatureFiles\\registerFeature.feature"},
					glue={"StepDefinitions", "hooks"},
							
					plugin= {"pretty", "html:reports/myreport.html", 
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
							
					dryRun=false,    // checks mapping between scenario steps and step definition methods
					monochrome=true,    // to avoid junk characters in output
					publish=true   // to publish report in cucumber server
					
		)
public class TestRunner {

		}
