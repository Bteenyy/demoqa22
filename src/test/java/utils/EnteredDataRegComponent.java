package utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class EnteredDataRegComponent {
    static Faker faker = new Faker();
    public static String[] genders = {"Male", "Female", "Others"},
            subjects = {"Hindi", "English", "Maths", "Physics", "Chemistry",
                    "Computer Science", "Commerce", "Accounting", "Economics",
                    "Arts", "Social Studies", "History", "Civics"},
            hobbies = {"Sports", "Reading", "Music"},
            state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"},
            ncrCity = {"Delhi", "Gurgaon", "Noida"},
            uttarPradeshCity = {"Agra", "Lucknow", "Merrut"},
            haryanaCity = {"Karnal", "Panipat"},
            rajasthanCity = {"Jaipur", "Jaiselmer"};
    public static Map<String, String> statesAndCities = new HashMap<>() {
        {
            put("NCR", ncrCity[faker.number().numberBetween(0, ncrCity.length - 1)]);
            put("Uttar Pradesh", uttarPradeshCity[faker.number().numberBetween(0, uttarPradeshCity.length - 1)]);
            put("Haryana", haryanaCity[faker.number().numberBetween(0, haryanaCity.length - 1)]);
            put("Rajasthan", rajasthanCity[faker.number().numberBetween(0, rajasthanCity.length - 1)]);
        }
    };

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String userEmail = faker.internet().emailAddress();
    public String gender = genders[faker.number().numberBetween(0, genders.length - 1)];
    public String userNumber = faker.phoneNumber().subscriberNumber(10);
    Date date = faker.date().birthday();
    public String dayOfB = new SimpleDateFormat("dd").format(date);
    public String monthCalendar = new SimpleDateFormat("MMMM", Locale.ENGLISH).format(date);
    public String yearCalendar = new SimpleDateFormat("y").format(date);
    public String subjectsInput = subjects[faker.number().numberBetween(0, subjects.length - 1)];
    public String hobbiesInput = hobbies[faker.number().numberBetween(0, hobbies.length - 1)];
    public String picturesInput = "lion.jpg";
    public String addressInput = faker.address().fullAddress();
    ;
    public String stateInput = state[faker.number().numberBetween(0, state.length - 1)];
    public String cityInput = statesAndCities.get(stateInput);
    public String secondAddress = faker.address().secondaryAddress();


}
