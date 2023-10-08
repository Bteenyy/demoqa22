package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataUtils {
    static Faker faker = new Faker(new Locale("ru"));

    public static String getRandomSex() {
        String[] genders = {"Male", "Female", "Others"};
        return genders[faker.number().numberBetween(0, genders.length - 1)];
    }

    public static String getRandomSubjects() {
        String[] subjects = {"Hindi", "English", "Maths", "Physics", "Chemistry",
                "Computer Science", "Commerce", "Accounting", "Economics",
                "Arts", "Social Studies", "History", "Civics"};
        return subjects[faker.number().numberBetween(0, subjects.length - 1)];
    }

    public static String getRandomHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return hobbies[faker.number().numberBetween(0, hobbies.length - 1)];
    }
    public static String getRandomState() {
        String[] state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return state[faker.number().numberBetween(0, state.length - 1)];
    }

}
