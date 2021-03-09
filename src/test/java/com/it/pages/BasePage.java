package com.it.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static com.it.common.Constants.BASE_URL;

public abstract class BasePage {
    protected static WebDriver driver;
    static {
        WebDriverManager.chromedriver().setup();
        //  System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
