package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class LessonTen extends ConfigLessonTen {
    @BeforeEach
    void setup() {
        open("https://dotabuff.com");
    }

    @Tag("CheckingSearch")
    @ValueSource(strings = {"Chen", "Pudge", "Axe"})
    @DisplayName("")
    @ParameterizedTest
    void testByOneValue(String heroName) {
        $(".home-search").$("#q").setValue(heroName).pressEnter();
        $(".hero-link").shouldHave(text(heroName));
    }

    @CsvSource(value = {
            "Chen, Support",
            "Pudge, Disabler",
            "Axe, Carry"
    })
    @Tag("CheckingPosition")
    @DisplayName("")
    @ParameterizedTest
    void testByTwoValue(String heroName, String typeOfHero) {
        $(".home-search").$("#q").setValue(heroName).pressEnter();
        $(".inner").$(".body-item").shouldHave(text(typeOfHero));
    }

    static Stream<Arguments> testByThreeValue() {
        return Stream.of(
                Arguments.of("Axe", List.of("Berserker's Call", "Battle Hunger", "Counter Helix", "Culling Blade")),
                Arguments.of("Chen", List.of("Penitence", "Holy persuasion", "Divine favor", "Hand of god")),
                Arguments.of("Slark", List.of("Dark pact", "Pounce", "Essence shift", "Depth shroud", "Shadow dance"))
        );
    }

    @Tag("CheckingAbilities")
    @MethodSource
    @ParameterizedTest
    void testByThreeValue(String heroName, List<String> talents) {
        $(".home-search").$("#q").setValue(heroName).pressEnter();
        $(".inner").$(".body-item").click();
        $$("ul.dropdown-menu li a").findBy(text("Abilities")).click();
        $(".col-8").$$(By.tagName("header")).shouldHave(texts(talents));
    }
}