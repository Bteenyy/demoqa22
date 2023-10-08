package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.selector.ByTagAndText;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LessonTen extends ConfigLessonTen {
    @BeforeEach
    void setup() {
        open("https://ru.dotabuff.com");
    }

    @ValueSource(strings = {"Chen", "Pudge", "Axe"})
    @Tag("CheckindSearch")
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
    @Tag("CheckindSearch")
    @DisplayName("")
    @ParameterizedTest
    void testByTwoValue(String heroName, String typeOfHero) {
        $(".home-search").$("#q").setValue(heroName).pressEnter();
        $(".inner").$(".body-item").shouldHave(text(typeOfHero));
    }

    static Stream<Arguments> testByThreeValue() {
        return Stream.of(
                Arguments.of("Abaddon", List.of("Mist Coil","Aphotic Shield", "Curse of Avernus","Borrowed Time"))
        );
    }
    @MethodSource
    @ParameterizedTest
    void testByThreeValue(String heroName, List<String> talents) {
        $(".home-search").$("#q").setValue(heroName).pressEnter();
        $(".inner").$(".body-item").click();
        $("img[data-hasqtip='2']").click();
        //$$(".hero-secondary-ability-icons r-none-mobile").filter(visible).shouldHave(CollectionCondition.texts(talents));
        sleep(4000);
    }
}
    //String heroName, String talentsOfHero