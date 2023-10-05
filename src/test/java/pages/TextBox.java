package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBox {
    SelenideElement userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            addressInput = $("#currentAddress"),
            permAddressInput = $("#permanentAddress"),
            submitButton = $("#submit");


    public TextBox openPage() {
        open("/text-box");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public TextBox setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }

    public TextBox setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public TextBox setUserAddress(String value) {
        addressInput.setValue(value);
        return this;
    }

    public TextBox setUserPermAddress(String value) {
        permAddressInput.setValue(value);
        return this;
    }

    public TextBox finishTest() {
        submitButton.click();
        return this;
    }

}
