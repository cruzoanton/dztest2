package com.it;

import com.it.helpers.*;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashboardHelper dashboard;
    public NewMailHelper newmail;


    public App() {
        this.common = new CommonHelper();
        this.login = new LoginHelper();
        this.dashboard = new DashboardHelper();
        this.newmail = new NewMailHelper();
       }
}
