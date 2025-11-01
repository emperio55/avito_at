package tests;

import WebSteps.MainSteps;
import WebSteps.NaviSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Открытие страницы АвитоАвто")
public class AvitoAutoTest extends TestBase{
    MainSteps steps = new MainSteps();
    NaviSteps naviSteps = new NaviSteps();

        @Test
        @DisplayName("Открытие раздела Легковые автомобили с главной страницы")
        @Tag("regres")
        void openAutoFromMainPage() throws InterruptedException {
            steps.openMainPage();
            naviSteps.openAvitoAutoFromRubricator();
        }
    }