package tests;

import WebSteps.MainSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Выбор города")
public class LocationTest extends TestBase {

        MainSteps steps = new MainSteps();

    @Test
        @DisplayName("Изменение города")
        @Tag("regres")
        void changeCityTest(){
            steps.openMainPage();
            steps.removeCookiesBar();
            steps.clickRegion();
            steps.inputRegion("Омск");
            steps.acceptLocation("Омск");
            steps.checkRegionOnTheMainPage("Омск");
            }
}
