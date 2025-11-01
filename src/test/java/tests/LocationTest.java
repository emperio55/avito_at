package tests;

import WebSteps.MainSteps;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import static java.lang.Thread.sleep;

@DisplayName("Выбор города")
public class LocationTest extends TestBase {
        MainSteps steps = new MainSteps();

    @Test
        @DisplayName("Изменение города")
        @Tag("smoke")
        void changeCityTest() throws InterruptedException {
            steps.openMainPage();
            steps.removeCookiesBar();
            steps.clickRegion();
            steps.inputRegion("Омск");
            steps.acceptLocation("Омск");
            steps.checkRegionOnTheMainPage("Омск");
            }
}
