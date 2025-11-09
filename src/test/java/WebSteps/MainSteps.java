package WebSteps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainSteps {
    private final SelenideElement locationNotify = $("._8kIjJQ>*:first-child");
    private final SelenideElement location = $("[data-marker='search-form/change-location']");
    private final SelenideElement cleanButton = $("[data-marker='popup-location/region/clearButton']");
    private final SelenideElement clickInputLocation = $("[data-marker='popup-location/region']");
    private final SelenideElement inputLocation = $("[data-marker='popup-location/region/search-input']");
    private final SelenideElement regionDropdownList = $("[data-marker='popup-location/region/dropdown']");
    private final SelenideElement saveLocation = $("[data-marker='popup-location/save-button']");
    private final SelenideElement buttonAgreeCookies = $("[class='EzaxZ']");

    @Step("Открыть главную страницу")
    public void openMainPage(){
        open("/");
    };

    @Step("Клик по региону")
    public void clickRegion(){
        location.click();
    };

    @Step("Очистить поле поиска")
    public void clearSearchBox(){
        location.click();
    };

    @Step("Ввод города")
    public void inputRegion(String region){
        clickInputLocation.click();
        inputLocation.setValue(region);
        regionDropdownList.shouldHave(Condition.text("Омская область"));
    };

    @Step("Выбор города")
    public void acceptLocation (String region){
        regionDropdownList.shouldHave(Condition.text(region)).click();
        saveLocation.click();
    };

    @Step("Проверка выбранного города")
    public void checkRegionOnTheMainPage (String region){
        location.shouldHave(Condition.text(region));
    };

    @Step("Проверка выбранного города")
    public void removeCookiesBar () {
        buttonAgreeCookies.shouldBe(Condition.visible).click();
    }
}