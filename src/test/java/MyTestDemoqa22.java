import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class MyTestDemoqa22 {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "none";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void demoQaTest() {
        open("/automation-practice-form");

        $x("//*[@id='firstName']").setValue("Rashit");
        $x("//*[@id='lastName']").setValue("Sakhbutdinov");
        $x("//*[@id='userEmail']").setValue("rasitsahbutdinov915455@gmail.com");
        $(byText("Male")).click();
        $x("//*[@id='userNumber']").setValue("1234567890");
        $x("//*[@id='dateOfBirthInput']").click();
        $x("//option[contains(@value, '1992')]").click();
        $x("//option[@value='3']").click();
        $x("//div[contains(@class, 'react-datepicker__day--027')]").click();
        // $x("//div[contains(@class, 'value')]").setValue("Geometry").pressEnter();
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $x("//*[@id='uploadPicture']").uploadFromClasspath("lion.jpg");
    }
}
