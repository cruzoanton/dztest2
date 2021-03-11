package com.it.tests;

import com.it.App;
import com.it.users.Mail;
import com.it.users.MailFactory;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    protected User validUser= UserFactory.getValidUser();
    protected Mail validMail = MailFactory.getValidMail();
    protected App app=new App();
    

    @AfterSuite
    public void afterSuite() {
   //     app.common.stopApp();
    }
}
