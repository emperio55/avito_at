package tests;

import attachments.Attach;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class TestBase {
    static ChromeOptions options = new ChromeOptions();

    @BeforeAll
    static void setupForLaunch() throws MalformedURLException {
        Configuration.browser = System.getProperty("browser");
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        SelenideLogger.addListener("allure", new AllureSelenide());
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs", prefs);

        Configuration.remote = System.getProperty("remoteWDurl");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;

        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
