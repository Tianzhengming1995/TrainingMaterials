package com.abc.lesson;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("请选择功能：1.显示全部记录 2.查询登录记录 0.退出");
        int caseNum = consoleIn.nextInt();
        consoleIn.close();
        switch (caseNum) {
            case 0:
                System.out.println("欢迎使用");
            case 1:
                System.out.println("显示全部记录");
                break;
            case 2:
                System.out.println("查询登记记录");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
