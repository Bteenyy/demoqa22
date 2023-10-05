package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class MyTestDemoqa22 extends TestBase {

    @Test
    void demoQaTest() {
        open("/automation-practice-form");

        $x("//*[@id='firstName']").setValue("Rashit");
        $x("//*[@id='lastName']").setValue("Sakhbutdinov");
        $x("//*[@id='userEmail']").setValue("rasitsahbutdinov915455@gmail.com");
        $x("//div[contains(@class, 'custom-radio')][.//*[@id='gender-radio-1']]").click();
        $x("//*[@id='userNumber']").setValue("1234567890");
        $x("//*[@id='dateOfBirthInput']").click();
        $x("//option[contains(@value, '1992')]").click();
        $x("//option[@value='3']").click();
        $x("//div[contains(@class, 'react-datepicker__day--027')]").click();
        $x("//*[@id='subjectsInput']").setValue("che").pressEnter();
        $x("//div[contains(@class, 'custom-control')][.//*[@id='hobbies-checkbox-1']]").click();
        $x("//*[@id='uploadPicture']").uploadFromClasspath("lion.jpg");
        $x("//*[@id='currentAddress']").setValue("Russia");
        $x("//*[@id='stateCity-wrapper']").click();
        $x("//*[@id='react-select-3-option-0']").click();
        $x("//*[@id='city']").click();
        $x("//*[@id='react-select-4-option-1']").click();
        $x("//*[@id='submit']").click();

        $x("//div[@class='modal-content']").shouldHave(text("Rashit Sakhbutdinov"));
        $x("//div[@class='modal-content']").shouldHave(text("rasitsahbutdinov915455@gmail.com"));
        $x("//div[@class='modal-content']").shouldHave(text("Male"));
        $x("//div[@class='modal-content']").shouldHave(text("1234567890"));
        $x("//div[@class='modal-content']").shouldHave(text("27 April,1992"));
        $x("//div[@class='modal-content']").shouldHave(text("Chemistry"));
        $x("//div[@class='modal-content']").shouldHave(text("Sports"));
        $x("//div[@class='modal-content']").shouldHave(text("lion.jpg"));
        $x("//div[@class='modal-content']").shouldHave(text("Russia"));
        $x("//div[@class='modal-content']").shouldHave(text("NCR Gurgaon"));
    }
}
