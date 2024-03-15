package Test_runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./feature_file/data.feature",
glue="step_definations")


public class Test_runner_orange1 {

}
