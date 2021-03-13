/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import beans.Student;
import main.Config;

/**
 *
 * @author Elvin Aliyev
 */
public class StudentUtil {

    public static Student fillStudent() {
        String name = InputUtil.requireText("Enter name: ");
        String surname = InputUtil.requireText("Enter surname");
        int age = InputUtil.requireNumber("Enter age: ");
        String className = InputUtil.requireText("Enter class: ");

        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void printAllRegisteredStudents() {

        for (int i = 0; i < Config.students.length; i++) {
            if (Config.students == null) {
                return;
            }

            Student st = Config.students[i];
            System.out.println(st.getFullInfo());
        }
    }

    public static void registerStudents() {
        int count = InputUtil.requireNumber("Nece telebe qeydiyyatdam kecireceksiniz?");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Register");
            Config.students[i] = StudentUtil.fillStudent();
        }
        System.out.println("Registration completed successfully");
        StudentUtil.printAllRegisteredStudents();
    }

    public static void findStudentsAndPrint() {
        String text = InputUtil.requireText("Type name,surname or class name");
        Student[] result = findStudents(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getFullInfo());
        }
    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text)
                    || st.getSurname().contains(text)
                    || st.getClassName().contains(text)) {
                count++;
            }
        }

        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text)
                    || st.getSurname().contains(text)
                    || st.getClassName().contains(text)) {
                result[found++] = st;
            }
        }
        return result;
    }

}
