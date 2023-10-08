package pages.components;

import com.github.javafaker.Faker;
import utils.DataUtils;

import java.util.Date;
import java.util.Locale;

public class EnteredDataRegComponent {
    Faker faker = new Faker(new Locale("en"));
    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String userEmail = faker.internet().emailAddress();
    public String gender = DataUtils.getRandomSex();
    public String userNumber = faker.phoneNumber().subscriberNumber(10);
    public Date date = faker.date().birthday();
    public String dayOfB = String.valueOf(date.getDay());
    public String monthCalendar = "April";
    public String yearCalendar = String.valueOf(faker.number().numberBetween(1900,2100));
    public String subjectsInput = DataUtils.getRandomSubjects();
    public String hobbiesInput = DataUtils.getRandomHobbies();
    public String picturesInput = "lion.jpg";
    public String addressInput = faker.country().name();
    public String stateInput = "NCR";
    public String cityInput = "Gurgaon";


}
