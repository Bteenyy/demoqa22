package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MyTestDemoqa22 extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void demoQaTest() {
        registrationPage.openPage();
        registrationPage.setFirstName("Rashit");
        registrationPage.setLastName("Sakhbutdinov");
        registrationPage.setUserEmail("rasitsahbutdinov915455@gmail.com");
        registrationPage.setGender("Male");
        registrationPage.setUserNumber("1234567890");

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
        //sleep(4000);
    }
}
