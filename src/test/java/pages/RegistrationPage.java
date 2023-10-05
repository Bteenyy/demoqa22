package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    SelenideElement firstNameInput =  $("#firstName");


    public RegistrationPage setFirstName(String value)
    {
        firstNameInput.setValue(value);
        return this;
    }
}
