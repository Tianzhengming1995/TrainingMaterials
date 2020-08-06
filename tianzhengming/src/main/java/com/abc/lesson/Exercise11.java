package com.abc.lesson;

public class Exercise11 {
    public static void main(String[] args) {
        char star = '\u4e00';
        int count=0;
        StringBuilder stringBuilder=new StringBuilder();
        while (star <= '\u9fa5') {
            stringBuilder.append(star);
            count++;
            star++;
            if(count%50==0)
                stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }
}
