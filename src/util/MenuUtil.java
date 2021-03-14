/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Elvin Aliyev
 */
public class MenuUtil {

    public static void processMenu(int selectedMenu) {
        switch (selectedMenu) {
            case 1:
                StudentUtil.registerStudents();
                break;
            case 2:
                StudentUtil.printAllRegisteredStudents();
                break;
            case 3:
                StudentUtil.findStudentsAndPrint();
                break;
            case 4:
                StudentUtil.updateStudentWithNewObject();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;
        }
    }

    public static String requireName() {
        return InputUtil.requireText("Enter name");
    }

    public static String requireSurname() {
        return InputUtil.requireText("Enter surname");
    }

    public static int requireAge() {
        return InputUtil.requireNumber("Enter age");
    }

    public static String requireClassName() {
        return InputUtil.requireText("Enter class");
    }

    public static void showSuccessOpMessage() {
        System.out.println("Operation completed successfully");
    }
}
