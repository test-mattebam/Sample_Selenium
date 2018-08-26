package com.websystique.springboot.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "com.wbsystique.springboot.steps",
        features = "classpath:cucumber/UserLoginByName.feature"
)
public class MainTest {
}
