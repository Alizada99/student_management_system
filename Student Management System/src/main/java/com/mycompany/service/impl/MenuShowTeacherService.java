/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;


import com.mycompany.bean.Teacher;
import com.mycompany.config.Config;
import com.mycompany.service.inter.MenuShowTeacherServiceInter;
import java.util.ArrayList;

/**
 *
 * @author betul
 */
public class MenuShowTeacherService implements MenuShowTeacherServiceInter {

    @Override
    public void process() {
        if (!Config.isLoggedIn()){
            throw new IllegalStateException("You must log in  before accessing this menu item!!!");
        }
        ArrayList<Teacher> st = Config.instance().getTeachers();

        for (Teacher s : st) {
            System.out.println(s);
        }

    }
}
