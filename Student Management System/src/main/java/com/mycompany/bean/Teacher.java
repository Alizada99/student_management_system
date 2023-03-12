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
public class Teacher extends Person {

    private String schoolName;
    private double salary;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, String surname, int age, String schoolName, double salary) {
        super(name, surname, age);
        this.schoolName = schoolName;
        if (salary >= 345) {
            this.salary = salary;
        } else {
            throw new MyException("Min salary must be 345");
        }
        if (age >= 24 && age <= 67) {
            this.age = age;
        } else {
            throw new MyException("Age must be 24 or older");
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + getName() + " " + "surname=" + getSurname() + " " + "age=" + getAge() + " " + "school name=" + getSchoolName() + " " + "salary=" + getSalary();
    }

}
