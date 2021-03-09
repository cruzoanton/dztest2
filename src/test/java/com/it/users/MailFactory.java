package com.it.users;

import java.util.ResourceBundle;

public class MailFactory {
    static ResourceBundle resourceMail = ResourceBundle.getBundle("mail");

    public static Mail getValidMail() {
        return new Mail(resourceMail.getString("reciever"),
                resourceMail.getString("subject"),
                resourceMail.getString("text"));

    }
}
