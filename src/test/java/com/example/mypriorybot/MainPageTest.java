package com.example.mypriorybot;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v102.network.model.Cookie;
import org.openqa.selenium.devtools.v102.network.model.LoadingFinished;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.driverManagerEnabled = true;
    }

    @BeforeEach
    public void setUp() {
        open("https://priory.myschoolapp.com/app#login");
    }

    @Test
    public void search() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        System.getenv("");
        mainPage.InputUser.sendKeys(System.getenv("MyPrioryUsername"));
        mainPage.Next.click();
        mainPage.InputPass.sendKeys(System.getenv("MyPrioryPassword"));
        mainPage.Login.click();
        while (driver.getCurrentUrl().contains("https://priory.myschoolapp.com/app/student#studentmyday/schedule") == false);
        var grades = new String[]{"7th", "8th", "9th", "10th", "11th", "12th"};
        for (var grade : grades){
            driver.get("https://priory.myschoolapp.com/api/directory/directoryresultsget?directoryId=2644&searchVal=&facets=7968_"+ grade +"+Grade&searchAll=false");
            System.out.println(mainPage.Body.getText());
        }





    }

}
