package com.abc.lesson;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("请输入该学员的分数（0-100）：");
        double score = consoleIn.nextDouble();
        consoleIn.close();
        if (score <= 0 || score >= 100)
            System.out.println("请输入0到100以内的分数");
        else if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println("A");
        else if (score >= 60)
            System.out.println("C");
        else System.out.println("D");
    }
}
