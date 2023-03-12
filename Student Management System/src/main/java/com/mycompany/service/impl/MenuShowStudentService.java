/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.bean.Student;
import com.mycompany.config.Config;
import com.mycompany.service.inter.MenuShowStudentServiceInter;
import java.util.ArrayList;

/**
 *
 * @author betul
 */
public class MenuShowStudentService implements MenuShowStudentServiceInter {

    @Override
    public void process() {
        if (!Config.isLoggedIn()){
            throw new IllegalStateException("You must log in  before accessing this menu item!!!");
        }
        ArrayList<Student> st = Config.instance().getStudents();

        for (Student s : st) {
            System.out.println(s);

        }
    }

}
