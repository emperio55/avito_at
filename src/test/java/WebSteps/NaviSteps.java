package WebSteps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class NaviSteps {
    private final SelenideElement rubricaAvitoAuto = $("[data-marker='visual-rubricator/image-Авто']");
    private final SelenideElement rubricaAuto = $("[data-marker='visual-rubricator/image-Автомобили'");
    private final SelenideElement avitoPostfix = $("[data-marker='search-form/logo/postfix']");

    @Step("Выбор рубрики Авто из рубрикатора")
    public void openAvitoAutoFromRubricator(){
        rubricaAvitoAuto.click();
        rubricaAuto.click();
        avitoPostfix.shouldBe(Condition.visible);
    }

}