package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:target/cucumber-report/cucumber.json"},
		monochrome = true,
		features = "classpath:features")
public class AllTest {
}