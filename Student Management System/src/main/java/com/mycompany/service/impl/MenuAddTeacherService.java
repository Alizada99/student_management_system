/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.bean.Teacher;
import com.mycompany.config.Config;
import com.mycompany.service.inter.MenuAddTeacherServiceInter;
import com.mycompany.util.InputUtil;


/**
 *
 * @author betul
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

    @Override
    public void process() {
        if (!Config.isLoggedIn()){
            throw new IllegalStateException("You must log in  before accessing this menu item!!!");
        }
        String name = InputUtil.requireText("Enter name");
        String surname = InputUtil.requireText("Enter surname");
        int age = InputUtil.requireNumber("Enter age");
        String schoolName = InputUtil.requireText("Enter school name");
        int salary = InputUtil.requireNumber("Enter salary");
        Teacher st = new Teacher(name, surname, age, schoolName, salary);

        Config c = new Config();
        Config.instance().setTeachers(st);

        Config.save();
    }

}
