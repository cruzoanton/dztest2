package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/div[6]/div[1]/div[1]/p/a")
    private WebElement newMail;

    @FindBy(xpath = "//*[@id=\"mesgList\"]/form/div[1]/a/span[3]/span")
    private WebElement checkLast;

    public void sendNewMail() {
		newMail.click();
	}
        public String chkSubject() {
        return checkLast.getText();
    }

}
