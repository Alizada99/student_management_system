/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.bean.Student;
import com.mycompany.config.Config;
import com.mycompany.service.inter.MenuAddStudentServiceInter;
import com.mycompany.util.InputUtil;


/**
 *
 * @author betul
 */
public class MenuAddStudentService implements MenuAddStudentServiceInter {
    
    @Override
    public void process() {
        if (!Config.isLoggedIn()){
            throw new IllegalStateException("You must log in  before accessing this menu item!!!");
        }
        String name = InputUtil.requireText("Enter name");
        String surname = InputUtil.requireText("Enter surname");
        int age = InputUtil.requireNumber("Enter age");
        String schoolName = InputUtil.requireText("Enter school name");
        int scholarship = InputUtil.requireNumber("Enter scholarship");
        
        Student st = new Student(name, surname, age, schoolName, scholarship);
        
        Config c = new Config();
        Config.instance().setStudents(st);
        
        Config.save();
    }
    
}
