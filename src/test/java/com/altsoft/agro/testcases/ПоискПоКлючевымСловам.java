package com.altsoft.agro.testcases;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Поиск/find_by_keywords.feature",
                 glue = "com.altsoft.agro.steps")
public class ПоискПоКлючевымСловам {

}