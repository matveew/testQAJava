package org.example.chromeDriver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome {
    public WebDriver startChromeDriver() {
        try {

            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            System.setProperty("webdriver.chrome.whitelistedIps", "");
            ChromeOptions options = new ChromeOptions();
            // options.addArguments("--headless");
            options.addArguments("--window-size=1920,1080");
            // options.addArguments("start-maximized"); // open Browser in maximized mode
            options.addArguments("disable-infobars"); // disabling infobars
            options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
            options.addArguments("--no-sandbox"); // Bypass OS security model
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            System.out.println("profile.default_content_setting_values.notifications");
            options.addArguments("--disable-notifications");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36");


            return new org.openqa.selenium.chrome.ChromeDriver(options);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
