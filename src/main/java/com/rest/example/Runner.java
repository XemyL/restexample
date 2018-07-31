package com.rest.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/cover_photos.feature"},
        glue = "com.rest.example",
        plugin = {"pretty", "html:target/cucumber-html-report"}
)
public class Runner {

}