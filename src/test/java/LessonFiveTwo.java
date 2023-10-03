import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
public class LessonFiveTwo {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl="https://the-internet.herokuapp.com";
        Configuration.pageLoadStrategy = "eager";}

    @Test
    void dragAndDrop()
    {
      open("/drag_and_drop");
        actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b")).release().perform();
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
        $("#column-b").dragAndDropTo("#column-a");
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
    }
}
