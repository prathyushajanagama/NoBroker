package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Prathyusha Janagama\\Downloads\\Nobrokercucuc\\Nobrokercucuc\\Features",
glue="stepdefenitions",monochrome=true,dryRun=false,plugin= {"pretty","html:report/report.html"})


public class runner {
	
	
	
	
	

}
