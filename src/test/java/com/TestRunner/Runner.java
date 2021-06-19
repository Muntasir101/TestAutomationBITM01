package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="Features", glue= {"com.StepDefinition"},

		plugin= {
				"pretty",
				"html:target/Htmlreports/HTMLReport",
				"json:target/JSONReports/jsonReport.json",
				"junit:target/JUnitReports/Report.xml"
				
		}
		
		
		)

public class Runner {


}
