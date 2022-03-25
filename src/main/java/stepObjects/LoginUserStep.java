package stepObjects;

import PageObject.LoginUserPage;

public class LoginUserStep extends LoginUserPage {
    public LoginUserPage GoToAuthorisationPage() {
        authorizationButton.click();
        return this;
    }
    public LoginUserStep Fillemail(String EmailValue){
        emailinput.setValue(EmailValue);
        return this;
    }
    public LoginUserStep FillPassword(String PasswordValue){
        passwordinput.setValue(PasswordValue);
        return this;
    }
    public LoginUserStep FillrecoverEmail(String RecoverEmail){
        emailinput.setValue(RecoverEmail);
        return this;
    }
}
