package Acceptance_pa;



import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "use_cases" , 
plugin = { "html:target/cucumber/wikipedia.html"},
monochrome = true ,
snippets = SnippetType.CAMELCASE,
glue = {"Acceptance_pa"},
strict = true )
public class Acceptance{
	
	 
}

