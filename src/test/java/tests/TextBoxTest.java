package tests;


import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTest extends TestBase {

    TextBoxPage textBox = new TextBoxPage();

    @Test
    void fillFormTest() {
        textBox.openPage()
                .setUserName("Alex Egorov")
                .setUserEmail("alex@egorov.com")
                .setUserAddress("Some address 1")
                .setUserPermAddress("Another address 1")
                .finishTest()
                .checkResult("name", "Alex Egorov")
                .checkResult("email", "alex@egorov.com")
                .checkResult("currentAddress", "Some address 1")
                .checkResult("permanentAddress", "Another address 1");

    }

}
