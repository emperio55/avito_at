package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Tag;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AutoPage {

    private final SelenideElement naviBreadcrumbs = $("[data-marker='breadcrumbs']");
    private final SelenideElement textHeader = $("[page-title/text]");
    private final SelenideElement popularModelFilter = $(".popular-rubricator-header-J9ctW");
    private final SelenideElement allModelFilter = $(".popular-rubricator-button-n8JDG");
    ElementsCollection rubricatorLinks = $$(".popular-rubricator-root-rYhau>:nth-child(2)");
    @Tag("Проверка популярных моделей в фильтре")

    public void modelCentralFilter(){
        popularModelFilter.shouldBe(visible);
        allModelFilter.shouldBe(enabled);
        rubricatorLinks.shouldBe(sizeGreaterThan(0));
        allModelFilter.click();
        rubricatorLinks.shouldBe(sizeGreaterThan(0));
    }
}
