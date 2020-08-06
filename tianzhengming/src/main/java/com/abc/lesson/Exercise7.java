package com.abc.lesson;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args)
    {
        //method1();
        method2();
    }
    public static void method1() {
        int num = (int) (Math.random() * 1000);
        Scanner consoleIn = new Scanner(System.in);
        do {
            System.out.println("请输入你猜测的数字（1-1000），退出请按0：");
            int inputNum = consoleIn.nextInt();
            if (inputNum == 0) {
                System.out.println("真遗憾，下次再挑战吧！");
                break;
            }
            if (inputNum < 0 || inputNum > 1000)
                System.out.println("输入有误，请按提示重新输入！");
            else if (inputNum == num) {
                System.out.println("恭喜，你猜对了！");
                break;
            } else if (inputNum < num)
                System.out.println("太小了！");
            else if (inputNum > num)
                System.out.println("太大了！");
        } while (consoleIn.hasNext());
        consoleIn.close();
    }

    public static void method2() {
        int num = (int) (Math.random() * 1000);
        Scanner consoleIn = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你猜测的数字（1-1000），退出请按0：");
            int inputNum = consoleIn.nextInt();
            if (inputNum == 0) {
                System.out.println("真遗憾，下次再挑战吧！");
                break;
            }
            if (inputNum < 0 || inputNum > 1000)
                System.out.println("输入有误，请按提示重新输入！");
            else if (inputNum == num) {
                System.out.println("恭喜，你猜对了！");
                break;
            } else if (inputNum < num) {
                System.out.println("太小了！");
            } else if (inputNum > num) {
                System.out.println("太大了！");
            }
        }
        consoleIn.close();
    }
}