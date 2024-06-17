package com.paramount.techtalkpresentation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter" ,"html:target/cucumber-report"},
        glue = "com.paramount.techtalkpresentation",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources")

public class RunCucumberTest {
}