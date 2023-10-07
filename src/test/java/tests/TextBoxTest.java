package tests;


import org.junit.jupiter.api.Test;
import pages.TextBoxPage;
import pages.components.EnteredDataTextBoxComponent;

public class TextBoxTest extends TestBase {
    TextBoxPage textBox = new TextBoxPage();
    EnteredDataTextBoxComponent dataTextBox = new EnteredDataTextBoxComponent();

    @Test
    void fillFormTest() {
        textBox.openPage()
                .fixBanBox()
                .setUserName(dataTextBox.uerName)
                .setUserEmail(dataTextBox.userEmail)
                .setUserAddress(dataTextBox.userAddress)
                .setUserPermAddress(dataTextBox.userPermAddress)
                .finishTest()
                .checkResult("name", dataTextBox.uerName)
                .checkResult("email", dataTextBox.userEmail)
                .checkResult("currentAddress", dataTextBox.userAddress)
                .checkResult("permanentAddress", dataTextBox.userPermAddress);

    }

}
