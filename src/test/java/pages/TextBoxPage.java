package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {
    SelenideElement userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            addressInput = $("#currentAddress"),
            permAddressInput = $("#permanentAddress"),
            submitButton = $("#submit");


    public TextBoxPage openPage() {
        open("/text-box");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public TextBoxPage fixBanBox() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public TextBoxPage setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }

    public TextBoxPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public TextBoxPage setUserAddress(String value) {
        addressInput.setValue(value);
        return this;
    }

    public TextBoxPage setUserPermAddress(String value) {
        permAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage finishTest() {
        submitButton.click();
        return this;
    }

    public TextBoxPage checkResult(String key, String value) {
        $("#output #" + key).shouldHave(text(value));
        return this;
    }
}
