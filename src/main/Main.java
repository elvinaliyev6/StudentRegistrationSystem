/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import util.InputUtil;
import util.MenuUtil;

/**
 *
 * @author Elvin Aliyev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = InputUtil.requireNumber("what do you want to do?"
                    + "\n1.Register student"
                    + "\n2.Show all students"
                    + "\n3.Find students"
                    + "\n4.Update student"
                    + "\n5.Exit");
            MenuUtil.processMenu(menu);
        }
    }

}
