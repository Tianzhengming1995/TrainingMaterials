package com.abc.lesson;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("请输入年龄：");
        String ageString = consoleIn.next().trim();
        consoleIn.close();
        int age=0;
        try {
            age = Integer.parseInt(ageString);
        } catch (Exception e) {
            System.out.println("输入有误，请重新输入！");
        }
        if (age >= 18 && age <= 50)
            System.out.println(true);
        else System.out.println(false);
    }
}
