package org.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberTestes.json", "html:target/reports"},
        features = "src/test/resources/features",
        tags = {"@test"},
        glue = {"org.test"}
)
public class RunTest {
    @AfterClass
    public static void closeApp(){
        Hooks.quitDriver();
    }
}
