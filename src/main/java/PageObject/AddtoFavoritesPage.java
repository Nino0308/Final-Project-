package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AddtoFavoritesPage {
    protected SelenideElement
        FirstFavoriteButton = $(byXpath("//*[@id=__next]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div/button")),
        SecondFavoriteButton = $(byXpath("//*[@id=\"__next\"]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/button")),
        ThirdFavoriteButton = $(byXpath("//*[@id=\"__next\"]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div/button")),
        RemoveFirstFavorite = $(byXpath("//*[@id=__next]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div/button")),
        RemoveSecondFavorite = $(byXpath("//*[@id=\"__next\"]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/button")),
        RemoveThirdFavorite = $(byXpath("//*[@id=\"__next\"]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div/button"));


}
