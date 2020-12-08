package ru.sbtqa.tag.pagefactory2example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.pagefactory.Tag;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty",
        "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
        glue = {"ru.sbtqa.tag.stepdefs",
                "ru.sbtqa.tag.pagefactory2example.stepdefs"},
        features = {"src/test/resources/en/features/"}
)
public class CucumberTest extends Tag {}