/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Elvin Aliyev
 */
public class InputUtil {

    public static String requireText(String title) {
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text;
    }

    public static int requireNumber(String title) {
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
}
