package tests;

import org.junit.jupiter.api.Test;

public class MyTestDemoqa22 extends TestBase {


    @Test
    void demoQaTest() {
        registrationPage.openPage()
                .setFirstName(dataReg.firstName)
                .setLastName(dataReg.lastName)
                .setUserEmail(dataReg.userEmail)
                .setGender(dataReg.gender)
                .setUserNumber(dataReg.userNumber)
                .setDateOfB(dataReg.dayClendar, dataReg.monthCalendar, dataReg.yearCalendar)
                .setSubjectsInput(dataReg.subjectsInput)
                .setHobbiesInput(dataReg.hobbiesInput)
                .setPicturesInput(dataReg.picturesInput)
                .setAddressInput(dataReg.addressInput)
                .setStateInput(dataReg.stateInput)
                .setCityInput(dataReg.cityInput)
                .finishTest()
                .checkResult("Student Name", dataReg.firstName + " " + dataReg.lastName)
                .checkResult("Student Email", dataReg.userEmail)
                .checkResult("Gender", dataReg.gender)
                .checkResult("Mobile", dataReg.userNumber)
                .checkResult("Date of Birth", dataReg.dayClendar + " " + dataReg.monthCalendar + "," + dataReg.yearCalendar)
                .checkResult("Subjects", dataReg.subjectsInput)
                .checkResult("Hobbies", dataReg.hobbiesInput)
                .checkResult("Picture", dataReg.picturesInput)
                .checkResult("Address", dataReg.addressInput)
                .checkResult("State and City", dataReg.stateInput + " " + dataReg.cityInput);
    }
}
