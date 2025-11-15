package tests;

import Pages.AutoPage;
import WebSteps.MainSteps;
import WebSteps.NaviSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Открытие страницы АвитоАвто")
public class AvitoAutoTest extends TestBase{
    MainSteps steps = new MainSteps();
    NaviSteps naviSteps = new NaviSteps();
    AutoPage autoPage =  new AutoPage();

        @Test
        @DisplayName("Открытие раздела Легковые автомобили с главной страницы")
        @Tag("regres")
        void openAutoFromMainPage(){
            steps.openMainPage();
            naviSteps.openAvitoAutoFromRubricator();
        }

        @Test
        @DisplayName("Проверка наличия основных элементов на странице АвитоАвто")
        @Tag("regres")
        void checkMainElementsOnThePage(){
            steps.openMainPage();
            naviSteps.openAvitoAutoFromRubricator();
            autoPage.modelCentralFilter();
        }
    }