package com.example.designpatterns._01_creatinal_patterns._06_adapter;

import com.example.designpatterns._01_creatinal_patterns._06_adapter.security.LoginHandler;
import com.example.designpatterns._01_creatinal_patterns._06_adapter.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        UserDetailsService accountService = new AccountService();
        LoginHandler loginHandler = new LoginHandler(accountService);

        String login = loginHandler.login("junwoo", "junwoo");
        System.out.println(login);
    }
}
