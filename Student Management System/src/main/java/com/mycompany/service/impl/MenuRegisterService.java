/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;


import com.mycompany.service.inter.MenuRegisterServiceInter;
import com.mycompany.util.InputUtil;

import java.util.HashMap;

public class MenuRegisterService implements MenuRegisterServiceInter {

    private static final HashMap<String, String> users = new HashMap<>();

    @Override
    public void process() {
        int id = InputUtil.requireNumber("Enter student id");
        String name = InputUtil.requireText("Enter student name");
        String email = InputUtil.requireText("Enter student email");
        int course = InputUtil.requireNumber("Enter student course");
        register();
    }

    public void register() {
        String username = InputUtil.requireText("Enter username");
        String password = InputUtil.requireText("Enter password");
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Please choose a different username.");
            register();
        } else if (!isValidPassword(password)) {
            System.out.println("Password must be at least 8 characters long and contain letters, numbers and symbols.");
            register();
        } else {
            users.put(username, password);
            System.out.println("You have successfully registered in the system..."
                    + "\nYour username is: " + username
                    + "\nYour password is: " + password);
        }
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        password = ("(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).+");
        return password.matches(password);
    }

    public static HashMap<String, String> getUsers() {
        return users;
    }
}
