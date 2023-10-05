package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class MyTestDemoqa22 extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void demoQaTest() {
        registrationPage.openPage()
                .setFirstName("Rashit")
                .setLastName("Sakhbutdinov")
                .setUserEmail("rasitsahbutdinov915455@gmail.com")
                .setGender("Male")
                .setUserNumber("1234567890")
                .setDateOfB("27", "April", "1992")
                .setSubjectsInput("che")
                .setHobbiesInput("Sports")
                .setPicturesInput("lion.jpg")
                .setAddressInput("Russia")
                .setStateInput("NCR")
                .setCityInput("Gurgaon")
                .finishTest()
                .checkResult("Student Name", "Rashit Sakhbutdinov")
                .checkResult("Student Email", "rasitsahbutdinov915455@gmail.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "1234567890")
                .checkResult("Date of Birth", "27 April,1992")
                .checkResult("Subjects", "Chemistry")
                .checkResult("Hobbies", "Sports")
                .checkResult("Picture", "lion.jpg")
                .checkResult("Address", "Russia")
                .checkResult("State and City", "NCR Gurgaon");
    }
}
