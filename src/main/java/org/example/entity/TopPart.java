package org.example.entity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TopPart {
    private final WebDriver driver;

    public TopPart(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public HomePage goToHomePage() {
        driver.get(HomePage.HOME_PAGE_URL);
        return new HomePage(driver);
    }

    public ShoppingCartPage goToShoppingCartPage() {
        driver.get(ShoppingCartPage.SHOPPING_CART_URL);
        return new ShoppingCartPage(driver);
    }


    public boolean isPageLoaded(TopPart basePage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
        return true;
    }


}
