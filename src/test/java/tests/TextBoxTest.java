package tests;

import org.junit.Test;
import pages.TextBox;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxTest {
    public class TextBoxTests extends TestBase {
        TextBox textBox = new TextBox();

        @Test
        void fillFormTest() {
            textBox.openPage()
                    .setUserName("Alex Egorov")
                    .setUserEmail("alex@egorov.com")
                    .setUserAddress("Some address 1")
                    .finishTest();


//        $("#output").$("#name").shouldHave(text("Alex Egorov"));
            $("#output #name").shouldHave(text("Alex Egorov"));
            $("#output #email").shouldHave(text("alex@egorov.com"));
            $("#output #currentAddress").shouldHave(text("Some address 1"));
            $("#output #permanentAddress").shouldHave(text("Another address 1"));
        }
    }
}
