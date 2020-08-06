package com.abc.lesson;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("请输入年份（例如：2012）");
        long year = consoleIn.nextLong();
        consoleIn.close();
        if (year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + "是闰年");
        }else {
            System.out.println(year + "不是闰年，请重新输入！");
        }
    }
}
