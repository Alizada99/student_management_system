/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.config;

import com.mycompany.bean.Student;

import com.mycompany.bean.Teacher;
import com.mycompany.util.FileUtility;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author betul
 */
public class Config implements Serializable {

    public static Config instance() {
        if (config == null) {
            return new Config();
        }
        return config;
    }

    public static void save() {
        FileUtility.writeObjectToFile(Config.instance(), "ms.obj");
    }

    public static void initialize() {
        Object obj = FileUtility.readObjectFromFile("ms.obj");
        if (obj == null) {
            return;
        }
        if (obj instanceof Config) {
            config = (Config) obj;
        }
    }

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
    public static Config config = null;
    private static boolean LoggedIn;

    public static boolean isLoggedIn() {
        return LoggedIn;
    }

    public static void setLoggedIn(boolean LoggedIn) {
        Config.LoggedIn = LoggedIn;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students.add(students);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers.add(teachers);
    }

}
