/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.util;

import com.mycompany.service.impl.MenuAddStudentService;
import com.mycompany.service.impl.MenuAddTeacherService;
import com.mycompany.service.impl.MenuExitService;
import com.mycompany.service.impl.MenuRegisterService;
import com.mycompany.service.impl.MenuLoginService;
import com.mycompany.service.impl.MenuShowStudentService;
import com.mycompany.service.impl.MenuShowTeacherService;
import com.mycompany.service.inter.MenuService;

/**
 *
 * @author betul
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add student", new MenuAddStudentService()),
    ADD_TEACHER(4, "Add teacher", new MenuAddTeacherService()),
    SHOW_ALL_STUDENT(5, "Show students", new MenuShowStudentService()),
    SHOW_ALL_TEACHER(6, "Show teachers", new MenuShowTeacherService()),
    EXIT(7, "Exit", new MenuExitService()),
    UNKNOWN;

    private Menu() {
    }

    private int number;
    private String label;
    private MenuService service;

    private Menu(int number, String label, MenuService service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public int getNumber() {
        return number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public static Menu find(int selectedNumber) {
        Menu m[] = Menu.values();
        for (int i = 0; i < m.length; i++) {
            if (selectedNumber == m[i].getNumber()) {
                return m[i];
            }
        }
        return UNKNOWN;
    }
}
