package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"},
tags="@data_outline")
public class RunCukesTest {
	//changed on 29th july 12:19 abc
}
