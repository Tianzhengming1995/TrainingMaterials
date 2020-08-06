package com.abc.lesson;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("请输入单价（￥）：");
        double unitPrice=consoleIn.nextDouble();
        System.out.println("请输入数量：");
        int amountOfGoods=consoleIn.nextInt();
        System.out.println("请输入金额（￥）：");
        double amountEnter=consoleIn.nextDouble();
        consoleIn.close();
        double amountRecive=unitPrice*amountOfGoods;
        if(amountRecive>=500)
            amountRecive=amountRecive*0.8;
        if(amountEnter>amountRecive)
        {
            System.out.println("应收金额为：￥"+amountRecive+"找零为：￥"+(amountEnter-amountRecive));
        }else {
            System.out.println("输入信息有误！");
        }
    }
}