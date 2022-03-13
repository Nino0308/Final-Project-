package PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement

    RegistrationButton = $(byText("ახალი ვარ SHOPSHOP-ზე")),
    emailinput =  $(byAttribute("name","email")),
    passwordinput = $(byAttribute("name","password")),
    confirmpasswordinput = $(byAttribute("name","confirm_password")),
    UserIsOnRegistrationPage = $(byText("ninoo.khutsishvili@gmail.com"));

}
