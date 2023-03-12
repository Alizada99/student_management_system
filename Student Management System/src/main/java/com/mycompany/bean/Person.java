/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bean;

import MyException.MyException;
import java.io.Serializable;

/**
 *
 * @author betul
 */
public abstract class Person implements Serializable {

    private String name;
    private String surname;
    private int age;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        if (age >= 16) {
            this.age = age;
        } else {
            throw new MyException("Age must be 16 or older");
        }
    }

    Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
