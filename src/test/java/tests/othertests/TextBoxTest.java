package tests.othertests;


import org.junit.jupiter.api.Test;
import pages.TextBoxPage;
import utils.EnteredDataRegComponent;

public class TextBoxTest extends TestBase {
    TextBoxPage textBox = new TextBoxPage();
    EnteredDataRegComponent dataTextBox = new EnteredDataRegComponent();

    @Test
    void fillFormTest() {
        textBox.openPage()
                .fixBanBox()
                .setUserName(dataTextBox.firstName + " " + dataTextBox.lastName)
                .setUserEmail(dataTextBox.userEmail)
                .setUserAddress(dataTextBox.addressInput)
                .setUserPermAddress(dataTextBox.secondAddress)
                .finishTest()
                .checkResult("name", dataTextBox.firstName + " " + dataTextBox.lastName)
                .checkResult("email", dataTextBox.userEmail)
                .checkResult("currentAddress", dataTextBox.addressInput)
                .checkResult("permanentAddress", dataTextBox.secondAddress);

    }

}
