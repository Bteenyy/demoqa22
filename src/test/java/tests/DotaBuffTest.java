package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import pages.DotaBuffPage;

import java.util.List;
import java.util.stream.Stream;


public class DotaBuffTest extends ConfigDotaBuff {
    DotaBuffPage dotaBuffPage = new DotaBuffPage();

    @ValueSource(strings = {"Chen", "Pudge", "Axe"})
    @ParameterizedTest(name = "В поисковой выдаче присутствует имя героя {0} для запроса {0}")
    @Tags({@Tag("UI"), @Tag("Search"), @Tag("Smoke")})
    void testByOneValueTest(String heroName) {
        dotaBuffPage.openPage()
                .setHeroName(heroName)
                .checkResultNameHero(heroName);
    }

    @CsvSource(value = {
            "Chen, Support",
            "Pudge, Disabler",
            "Axe, Carry"
    })
    @Tags({@Tag("UI"), @Tag("Type"), @Tag("Regress")})
    @ParameterizedTest(name = "В поисковой выдаче присутствует категория героя {1} под именем героя {0}")
    void testByTwoValueTest(String heroName, String typeOfHero) {
        dotaBuffPage.openPage()
                .setHeroName(heroName)
                .checkResultTypeHero(typeOfHero);
    }

    static Stream<Arguments> testByThreeValueTest() {
        return Stream.of(
                Arguments.of("Axe", List.of("Berserker's Call", "Battle Hunger", "Counter Helix", "Culling Blade")),
                Arguments.of("Chen", List.of("Penitence", "Holy persuasion", "Divine favor", "Hand of god")),
                Arguments.of("Slark", List.of("Dark pact", "Pounce", "Essence shift", "Depth shroud", "Shadow dance"))
        );
    }

    @Tags({@Tag("UI"), @Tag("Abilities"), @Tag("Regress")})
    @MethodSource
    @ParameterizedTest(name = "Во вкладе способности героя {0} присутствуют способности {1}")
    void testByThreeValueTest(String heroName, List<String> talents) {
        dotaBuffPage.openPage()
                .setHeroName(heroName)
                .clickHeroName()
                .abilitiesButton()
                .checkAbilities(talents);
    }
}