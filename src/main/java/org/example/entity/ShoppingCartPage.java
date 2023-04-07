package org.example.entity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends TopPart {

    public static final String SHOPPING_CART_URL = "https://demo.opencart.com/index.php?route=checkout/cart";

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
        isPageLoaded(this);
        shoppingCart = driver.findElement(By.cssSelector("#content > h1"));
        labelContains = driver.findElement(By.cssSelector("#content > p"));
        buttonContinue = driver.findElement(By.cssSelector("#content > div > div > a"));
    }

    private WebElement shoppingCart;
    private WebElement labelContains;
    private WebElement buttonContinue;


    public WebElement getShoppingCart() {
        return shoppingCart;
    }

    public WebElement getLabelContains() {
        return labelContains;
    }

    public HomePage clickButtonContinue() {
        buttonContinue.click();
        return new HomePage(getWebDriver());
    }


}
