package com.it.users;

public class Mail {
    public String reciever;
    public String subject;
    public String text;

    public Mail(String reciever, String subject, String text) {
        this.reciever=reciever;
        this.subject = subject;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "reciever='" + reciever + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mail mail = (Mail) o;

        if (reciever != null ? !reciever.equals(mail.reciever) : mail.reciever != null) return false;
        if (subject != null ? !subject.equals(mail.subject) : mail.subject != null) return false;
        return text != null ? text.equals(mail.text) : mail.text == null;
    }

    @Override
    public int hashCode() {
        int result = reciever != null ? reciever.hashCode() : 0;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }
}
