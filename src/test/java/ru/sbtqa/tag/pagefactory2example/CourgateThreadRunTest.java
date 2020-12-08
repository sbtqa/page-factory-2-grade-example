package ru.sbtqa.tag.pagefactory2example;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.junit.Courgette;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.pagefactory.Tag;


@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 10,
        runLevel = CourgetteRunLevel.SCENARIO,
//        runLevel = CourgetteRunLevel.FEATURE,
        //rerunFailedScenarios = true,
        showTestOutput = true,
        reportTargetDir = "build",
        cucumberOptions = @CucumberOptions(
                features = {"src/test/resources/en/features/"},
                glue = {"ru.sbtqa.tag.stepdefs",
                        "ru.sbtqa.tag.pagefactory2example.stepdefs"},
                plugin = {
                        "pretty",
                        "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                        "json:build/chrome/cucumber-report/cucumber.json",
                        "html:build/chrome/cucumber-report/cucumber.html"
                },
                strict = true
        ))
public class CourgateThreadRunTest extends Tag {
}