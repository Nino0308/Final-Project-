package Shopshop;


import PageObject.RegistrationPage;
import Utils.Runner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import stepObjects.RegistrationSteps;

import java.net.PortUnreachableException;
import java.time.Duration;

import static Dataobject.RegistrationData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class Registration extends Runner {
    public Registration() {
    }

    // User registration - happy pass

    @Test
    public void RegistrationToshop() {
        Configuration.browser = "chrome";
        open("https://shopshop.ge/home");
        $(".center-header_icon user-icon  user-icon");
        $(byAttribute("class", "center-header_icon user-icon  user-icon")).click();
        $(byText("ახალი ვარ SHOPSHOP-ზე")).shouldBe(Condition.visible,Duration.ofMillis(3000)).click();
        $(byAttribute("name", "email")).setValue("ninoo.khutsishvili@gmail.com");
        $(byAttribute("name", "password")).setValue("nino123456");
        $(byAttribute("name", "confirm_password")).setValue("nino123456");
        $(byAttribute("name", "first_name")).setValue("Nino");
        $(byAttribute("name", "last_name")).setValue("Khutsishvili");
        $(byAttribute("type","checkbox")).click();
        $(byAttribute("class","register-btn")).click();
        sleep(3000);
        Assert.assertEquals("ninoo.khutsishvili@gmail.com", $(byAttribute("name", "email")).getValue());
        Assert.assertEquals("nino123456", $(byAttribute("name", "password")).getValue());
        Assert.assertEquals("nino123456", $(byAttribute("name", "confirm_password")).getValue());
        Assert.assertEquals("Nino", $(byAttribute("name", "first_name")).getValue());
        Assert.assertEquals("Khutsishvili", $(byAttribute("name", "Last_name")).getValue());

    }

    @Test
    public void RegistrationSteps(){
        RegistrationSteps steps = new RegistrationSteps();
        steps.GoToRegistrationPage();
        Assert.assertTrue(steps.UserIsOnRegistrationPage.isDisplayed());
        RegistrationSteps steps1 = steps
                .Fillemail(emailValue)
                .Fillpassword(passwordValue)
                .Fillconfirm_password(confirm_passwordValue)
                .Fillfirst_name(first_nameValue)
                .Filllast_name(last_nameValue);
        Assert.assertEquals(steps.emailinput.getValue(),emailValue);
        Assert.assertEquals(steps.passwordinput.getValue(),passwordValue);
        Assert.assertEquals(steps.confirmpasswordinput.getValue(),confirm_passwordValue);
        Assert.assertEquals(steps.firstnameinput.getValue(),first_nameValue);
        Assert.assertEquals(steps.lastnameinput.getValue(),last_nameValue);

}

    @Test
    // incorrect confirmation password -negative case

    public void incorrectpass(){
        Configuration.browser = "chrome";
        open("https://shopshop.ge/home");
        $(".center-header_icon user-icon  user-icon");
        $(byAttribute("class", "center-header_icon user-icon  user-icon")).click();
        $(byText("ახალი ვარ SHOPSHOP-ზე")).shouldBe(Condition.visible,Duration.ofMillis(3000)).click();
        $(byAttribute("name", "email")).setValue("ninoo.khutsishvili@gmail.com");
        $(byAttribute("name", "password")).setValue("nino123456");
        $(byAttribute("name", "confirm_password")).setValue("nino123458");
        $(byAttribute("name", "first_name")).setValue("Nino");
        $(byAttribute("name", "last_name")).setValue("Khutsishvili");
        $(byAttribute("type","checkbox")).click();
        $(byAttribute("class","register-btn")).click();
        $(byText("პაროლი არ ემთხვევა")).shouldBe(Condition.visible, Duration.ofMillis(3000));
        sleep(3000);

        Assert.assertEquals("ninoo.khutsishvili@gmail.com", $(byAttribute("name", "email")).getValue());
        Assert.assertEquals("nino123456", $(byAttribute("name", "password")).getValue());
        Assert.assertEquals("nino123458", $(byAttribute("name", "confirm_password")).getValue());
        Assert.assertEquals("Nino", $(byAttribute("name", "first_name")).getValue());
        Assert.assertEquals("Khutsishvili", $(byAttribute("name", "Last_name")).getValue());
        Assert.assertEquals("პაროლი არ ემთხვევა",$(byAttribute("class","error-block")).getValue());

    }

    @Test
    public void Incorrectpass() {
        RegistrationSteps steps = new RegistrationSteps();
        steps.GoToRegistrationPage();
        Assert.assertTrue(steps.UserIsOnRegistrationPage.isDisplayed());
        steps
                .Fillemail(emailValue)
                .Fillpassword(passwordValue)
                .Fillconfirm_password(confirm_passwordValue)
                .Fillfirst_name(first_nameValue)
                .Filllast_name(last_nameValue);

    }
}
