package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Feature\\FacebookLoginProvider.feature" , glue = {"StepDefinations"})

public class FacebookProRunner {

}
