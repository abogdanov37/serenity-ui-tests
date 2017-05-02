package com.altsoft.agro.steps;

import com.altsoft.agro.pages.SearchPage;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import net.thucydides.core.annotations.Managed;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchByKeywordSteps {

    @Managed
    SearchPage searchPage;

    @Дано("^Я хочу купить шерстяной шарф$")
    public void iWantToBuy() {
        searchPage.open();
    }

    @Когда("^Я ищу вещи содержащие слово '(.*)'$")
    public void iSearchItemsContainsKeyword(String keywords) {
        searchPage.searchFor(keywords);
    }

    @Тогда("^Я должен видеть только вещи содержащие слово '(.*)'$")
    public void iShouldSeeOnlyItemsContainsKeyword(String keywords) {
        assertThat(searchPage.getTitle()).contains(keywords);
    }
}
