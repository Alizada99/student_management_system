/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.util;

import com.mycompany.config.Config;
import static com.mycompany.util.Menu.LOGIN;
import static com.mycompany.util.Menu.REGISTER;
import java.util.Scanner;

/**
 *
 * @author betul
 */
public class MenuUtil {

    public static void showAllMenu() {
        Menu m[] = Menu.values();
        for (int i = 0; i < m.length; i++) {
            if (m[i] != Menu.UNKNOWN) {
                if (m[i] == LOGIN || m[i] == REGISTER) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(m[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(m[i]);
                }
            }
        }
    }

    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select menu:");
        showAllMenu();
        int selectedMenu = sc.nextInt();
        Menu menu = Menu.find(selectedMenu);
        menu.process();
    }
}
