/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.config.Config;
import com.mycompany.service.inter.MenuLoginServiceInter;
import com.mycompany.util.InputUtil;
import java.util.HashMap;

/**
 *
 * @author betul
 */
public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void process() {
        String username = InputUtil.requireText("Enter username");
        String password = InputUtil.requireText("Enter password");
        HashMap<String, String> users = MenuRegisterService.getUsers();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            Config.setLoggedIn(true);
            return;
        } else if (!(users.containsKey(username) && users.get(username).equals(password))) {
            System.out.println("Username or password is invalid. If you don't have an account, please register first");
            process();
        } else if (!(username.equals("admin") && password.equals("123"))) {
            System.exit(0);
        }
        Config.setLoggedIn(true);
    }
}
