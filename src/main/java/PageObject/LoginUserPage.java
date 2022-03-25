package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class LoginUserPage {
    public SelenideElement

    authorizationButton = $(byAttribute("class","center-header_icon user-icon  user-icon")),
    emailinput = $(byAttribute("name", "email")),
    passwordinput = $(byAttribute("name", "password")),
    ForgetPass = $(byAttribute("name", "email"));

}
