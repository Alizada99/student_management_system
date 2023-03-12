/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bean;

import MyException.MyException;

/**
 *
 * @author betul
 */
public class Student extends Person {

    private String schoolName;
    private double scholarship;

    public Student(String name, String surname, int age, String schoolName, double scholarship) {
        super(name, surname, age);
        this.schoolName = schoolName;
        if (scholarship >= 66) {
            this.scholarship = scholarship;
        } else {
            throw new MyException("Min scholarship must be 66 AZN");
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "name=" + getName() + " " + "surname=" + getSurname() + " " + "age=" + getAge() + " " + "school name=" + getSchoolName() + " " + "scholarship=" + getScholarship();
    }

}
