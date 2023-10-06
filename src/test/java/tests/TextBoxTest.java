package tests;


import org.junit.jupiter.api.Test;
public class TextBoxTest extends TestBase {


    @Test
    void fillFormTest() {
        textBox.openPage()
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
