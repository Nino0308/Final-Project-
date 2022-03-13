package stepObjects;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class RegistrationSteps extends RegistrationPage {
    public RegistrationPage GoToRegistrationPage() {
        RegistrationButton.click();
        UserIsOnRegistrationPage.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
    public RegistrationSteps Fillemail(String emailValue){
        emailinput.setValue(emailValue);
        return this;
    }
    public RegistrationSteps Fillpassword(String passwordValue){
        passwordinput.setValue(passwordValue);
        return this;

    }
}
