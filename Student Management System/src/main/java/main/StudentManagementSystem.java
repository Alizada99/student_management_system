/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import com.mycompany.config.Config;
import com.mycompany.util.MenuUtil;

/**
 *
 * @author betul
 */
public class StudentManagementSystem {

    public static void main(String[] args) {
       Config.initialize();
       MenuUtil.showMenu();
    }
}
