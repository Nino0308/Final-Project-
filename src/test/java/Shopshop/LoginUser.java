package Shopshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.As;
import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginUser {

    @Test
    public void LoginUserToshop(){
        Configuration.browser = "chrome";
        open("https://shopshop.ge/home");
        $(byAttribute("class", "center-header_icon user-icon  user-icon")).click();
        $(byAttribute("name", "email")).setValue("ninoo.khutsishvili@gmail.com");
        $(byAttribute("name", "password")).setValue("nino123456");
        $(byAttribute("class","register-btn")).click();
        sleep(5000);

        Assert.assertEquals("ninoo.khutsishvili@gmail.com", $(byAttribute("name", "email")).getValue());
        Assert.assertEquals("nino123456", $(byAttribute("name", "password")).getValue());

    }

    @Test
    //Password recover

    public void PasswordRecover(){
        Configuration.browser = "chrome";
        open("https://shopshop.ge/home");
        $(byAttribute("class", "center-header_icon user-icon  user-icon")).click();
        $(byAttribute("name", "email")).setValue("ninoo.khutsishvili@gmail.com");
        $(byText("დაგავიწყდა პაროლი?")).shouldBe(Condition.visible,Duration.ofMillis(3000)).click();
        $(byText("შეიყვანე ელ.ფოსტა პროფილის აღდგენისთვის")).shouldBe(Condition.visible,Duration.ofMillis(3000)).click();
        $(byAttribute("name", "email")).setValue("ninoo.khutsishvili@gmail.com");
        sleep(5000);

        Assert.assertEquals("ninoo.khutsishvili@gmail.com",$(byAttribute("name","email")).getValue());

    }
}
