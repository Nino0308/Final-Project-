package Shopshop;


import Utils.Runner;
import org.junit.Assert;
import org.junit.Test;
import stepObjects.RegistrationSteps;

import static Dataobject.RegistrationData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class Registration extends Runner {
    public Registration() {
    }


    @Test
    public void Registration() {
        open("https://shopshop.ge/home");
        $(".center-header_icon user-icon  user-icon");
        $(byAttribute("class", "center-header_icon user-icon  user-icon")).click();
        $(byText("ახალი ვარ SHOPSHOP-ზე")).click();
        $(byAttribute("name", "email")).setValue("ninoo.khutsishvili@gmail.com");
        $(byAttribute("name", "password")).setValue("nino123456");
        $(byAttribute("name", "confirm_password")).setValue("nino123456");
        $(byAttribute("name", "first_name")).setValue("Nino");
        $(byAttribute("name", "last_name")).setValue("Khutsishvili");
        $(byAttribute("name", "checkbox")).click();
        sleep(3000);
        Assert.assertEquals("ninoo.khutsishvili@gmail.com", $(byAttribute("name", "email")).getValue());
        Assert.assertEquals("nino123456", $(byAttribute("name", "password")).getValue());
        Assert.assertEquals("nino123456", $(byAttribute("name", "confirm_password")).getValue());
        Assert.assertEquals("Nino", $(byAttribute("name", "first_name")).getValue());
        Assert.assertEquals("Khutsishvili", $(byAttribute("name", "Last_name")).getValue());
        Assert.assertEquals("nino123456", $(byAttribute("name", "password")).getValue());

    }

    @Test
    public void RegistrationSteps(){
        RegistrationSteps steps = new RegistrationSteps();
        steps.GoToRegistrationPage();
        Assert.assertTrue(steps.UserIsOnRegistrationPage.isDisplayed());
        steps
                .Fillemail(emailValue)
                .Fillpassword(passwordValue);
        Assert.assertEquals(steps.emailinput.getValue(),emailValue);
        Assert.assertEquals(steps.passwordinput.getValue(),passwordValue);


}

}
