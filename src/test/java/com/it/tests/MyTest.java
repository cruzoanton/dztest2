package com.it.tests;

import com.it.common.Constants;
import com.it.pages.BasePage;
import com.it.pages.DashBoardPage;
import com.it.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.it.common.Constants.*;

public class MyTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        app.login.login(validUser);
        app.dashboard.sendNewMail(); //кликаем создать новое письмо
        app.newmail.sendMail(validMail);


         //Assert.assertEquals(, validUser.email);
    }
}
