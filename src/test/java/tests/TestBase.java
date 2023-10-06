package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;
import pages.TextBoxPage;
import pages.components.EnteredDataRegComponent;
import pages.components.EnteredDataTextBoxComponent;

public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    TextBoxPage textBox = new TextBoxPage();
    EnteredDataRegComponent dataReg=new EnteredDataRegComponent();
    EnteredDataTextBoxComponent dataTextBox = new EnteredDataTextBoxComponent();
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
}
