package stepObjects;

import PageObject.AddtoFavoritesPage;
import com.codeborne.selenide.conditions.*;

public class AddtoFavoritesSteps extends AddtoFavoritesPage {
    public AddtoFavoritesPage ClickFirstFavoriteButton() {
        FirstFavoriteButton.click();
        return this;
    }
    public AddtoFavoritesSteps clickSecondFavoriteButton(){
        SecondFavoriteButton.click();
        return this;
    }
    public AddtoFavoritesSteps clickThirdFavoriteButton(){
        ThirdFavoriteButton.click();
        return this;
    }
    public AddtoFavoritesSteps RemoveFirstFavoriteButton(){
        FirstFavoriteButton.click();
        return this;
    }
    public AddtoFavoritesSteps RemoveSecondFavoriteButton(){
        SecondFavoriteButton.click();
        return this;
    }
    public AddtoFavoritesSteps RemoveThirdFavoriteButton(){
        ThirdFavoriteButton.click();
        return this;
    }
}



