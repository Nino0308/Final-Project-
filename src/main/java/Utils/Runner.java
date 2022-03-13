package Utils;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class Runner {
    public static void setup(){
        Configuration.browser = "Chrome";
        open("https://shopshop.ge/home");



    }
}
