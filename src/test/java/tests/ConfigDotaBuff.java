package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class ConfigDotaBuff {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl="https://dotabuff.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
}
