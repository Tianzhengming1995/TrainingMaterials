package com.abc.lesson;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入生产日期（yyyy-MM-dd）：");
        String productionDate = in.next();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date proDate = dateFormat.parse(productionDate);
        System.out.println("请输入保质期（天数）：");
        int shelfDate = in.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(proDate);
        calendar.add(calendar.DATE, shelfDate);
        calendar.add(calendar.DATE, -14);
        int i = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        while (i != 3) {
            calendar.add(calendar.DATE, 1);
            i = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        }
        String str = dateFormat.format(calendar.getTime());
        System.out.println("促销日为："+str);
    }
}
