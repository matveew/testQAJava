package org.example;

import org.example.chromeDriver.Chrome;
import org.example.entity.HomePage;
import org.example.entity.ShoppingCartPage;
import org.example.entity.TopPart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {


        WebDriver driver = new Chrome().startChromeDriver();

        TopPart topPart = new TopPart(driver);

        HomePage homePage = topPart.goToHomePage();
        ShoppingCartPage shoppingCartPage = homePage.goToSoppingCartPageByClick();

        System.out.println(shoppingCartPage.getLabelContains().getText());

        homePage = shoppingCartPage.goToHomePage();

        System.out.println(topPart.isPageLoaded(homePage));
    }
}