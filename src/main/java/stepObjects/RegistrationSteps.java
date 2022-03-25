package stepObjects;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static Dataobject.RegistrationData.incorrect_passValue;

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
    public RegistrationSteps Fillconfirm_password(String confirm_passwordValue){
        confirmpasswordinput.setValue(confirm_passwordValue);
        return this;
    }
    public RegistrationSteps Fillfirst_name(String first_nameValue){
        firstnameinput.setValue(first_nameValue);
        return this;
    }
    public RegistrationSteps Filllast_name(String last_nameValue){
        lastnameinput.setValue(last_nameValue);
        return this;
    }
}





