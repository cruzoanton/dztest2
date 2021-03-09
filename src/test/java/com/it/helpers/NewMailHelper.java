package com.it.helpers;

import com.it.pages.NewMailPage;
import com.it.users.Mail;

public class NewMailHelper extends NewMailPage {
    public void sendMail(Mail mail) {
        sendMail(mail.reciever, mail.subject, mail.text);
    }
}

