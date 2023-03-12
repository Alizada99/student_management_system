/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.service.inter.MenuExitServiceInter;

/**
 *
 * @author betul
 */
public class MenuExitService implements MenuExitServiceInter {

    @Override
    public void process() {
        System.exit(0);
    }

}
