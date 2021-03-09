package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewMailPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"to\"]")
    private WebElement recieverMail;

    @FindBy(xpath = "/html/body/div[4]/div[6]/div[1]/div[1]/div[1]/div/form/div[5]/div[2]/span/input[1]")
    private WebElement subjectMail;

    @FindBy(xpath = "//*[@id=\"text\"]")
    private WebElement textMail;

    @FindBy(xpath = "/html/body/div[4]/div[6]/div[1]/div[1]/p[3]/input[1]")
    private WebElement btnSend;


    public void sendMail(String reciever,String subject,String text) {
        recieverMail.sendKeys(reciever);
        subjectMail.sendKeys(subject);
        textMail.sendKeys(text);
        btnSend.click();
    }

}




