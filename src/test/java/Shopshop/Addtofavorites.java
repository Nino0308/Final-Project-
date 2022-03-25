package Shopshop;

import Utils.Runner;
import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;



public class Addtofavorites extends Runner {

    @Test
    public void AddtofavoritesToshop(){
        Configuration.browser = "chrome";
        open("https://shopshop.ge/home");
        $(byXpath("//*[@id=__next]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div/a/img[1]")).click();
        $(byXpath("//*[@id=__next]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div/button")).click();
        $(byXpath("//*[@id=\"__next\"]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/button")).click();
        $(byXpath("//*[@id=\"__next\"]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div/button")).click();
        sleep(5000);

    }

    @Test
    //remove from favorites
    public void RemovefromFavorite(){
        Configuration.browser = "chrome";
        open("https://shopshop.ge/home");
        $(".notification").click();
        $(byXpath("//*[@id=__next]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div/button")).click();
        $(byXpath("//*[@id=\"__next\"]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/button")).click();
        $(byXpath("//*[@id=\"__next\"]/div[3]/main/div/div/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div/button")).click();

    }

}
