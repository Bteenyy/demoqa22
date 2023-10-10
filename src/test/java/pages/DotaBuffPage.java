package pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DotaBuffPage {
    SelenideElement homeSearch = $(".home-search").$("#q"),
            heroLink = $(".hero-link"),
            typeHero = $(".inner").$(".body-item"),
            abilities = $$("ul.dropdown-menu li a").findBy(text("Abilities"));
    ElementsCollection abilitiesPage = $(".col-8").$$(By.tagName("header"));


    public DotaBuffPage openPage() {
        open("");
        return this;

    }

    public DotaBuffPage setHeroName(String value) {
        homeSearch.setValue(value).pressEnter();
        return this;
    }

    public DotaBuffPage checkResultNameHero(String value) {
        heroLink.shouldHave(text(value));
        return this;
    }

    public DotaBuffPage checkResultTypeHero(String value) {
        typeHero.shouldHave(text(value));
        return this;
    }

    public DotaBuffPage clickHeroName() {
        typeHero.click();
        return this;
    }

    public DotaBuffPage abilitiesButton() {
        abilities.click();
        return this;
    }

    public DotaBuffPage checkAbilities(List<String> value) {
        abilitiesPage.shouldHave(texts(value));
        return this;
    }
}

