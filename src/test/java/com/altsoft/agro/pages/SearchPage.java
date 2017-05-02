package com.altsoft.agro.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

@DefaultUrl("/")
public class SearchPage extends PageObject {

    @FindBy(name="q")
    WebElement search;

    public void searchFor(String keywords) {
        search.sendKeys(keywords, Keys.ENTER);
        waitFor(titleContains(keywords));
    }

}
