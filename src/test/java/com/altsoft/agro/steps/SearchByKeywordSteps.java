package com.altsoft.agro.steps;

import com.altsoft.agro.pages.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchByKeywordSteps {

    @Managed
    SearchPage searchPage;

    @Given("Я хочу купить шерстяной шарф")
    public void I_Want_To_Buy() {
        searchPage.open();
    }

    @When("Я ищу вещи содержащие слово '(.*)'")
    public void I_Search_Items_Contains_Keyword(String keywords) {
        searchPage.searchFor(keywords);
    }

    @Then("Я должен видеть только вещи содержащие слово '(.*)'")
    public void I_Should_See_Only_Items_Contains_Keyword(String keywords) {
        assertThat(searchPage.getTitle()).contains(keywords);
    }
}
