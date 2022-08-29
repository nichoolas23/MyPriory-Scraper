package com.example.mypriorybot;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.devtools.v102.network.model.Cookie;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class MainPage {
    public SelenideElement InputUser = $("#Username");
    public SelenideElement Next = $("#nextBtn");
    public SelenideElement InputPass = $("#Password");
    public SelenideElement Login = $("#loginBtn");
    public SelenideElement Body = $("body");

}
