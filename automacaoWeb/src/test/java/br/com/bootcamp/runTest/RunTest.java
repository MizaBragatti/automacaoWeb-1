package br.com.bootcamp.runTest;

import org.junit.runner.RunWith;

import br.com.bootcamp.settings.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, dryRun = false,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty", "json:target/cucumber.json"},
		features = {"./src/test/resources/features"}, glue = {
		"br.com.bootcamp.web.steps", "br.com.bootcamp.mobile.steps",
		"br.com.bootcamp.settings", "br.com.bootcamp.commons",
		"br.com.bootcamp.enums"},
		tags = {"@mobile"})

public class RunTest extends BaseTest {
	
	

}
