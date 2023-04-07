package org.example.entity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends TopPart {
    public static final String HOME_PAGE_URL = "https://demo.opencart.com/";

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        isPageLoaded(this);
    }

    public ShoppingCartPage goToSoppingCartPageByClick() {
        super.getWebDriver().findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[4]/a/i")).click();
        return new ShoppingCartPage(getWebDriver());
    }


}
