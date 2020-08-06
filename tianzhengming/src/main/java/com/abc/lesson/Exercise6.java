package com.abc.lesson;

public class Exercise6 {
    public static void main(String[] args) {
        long[] numArrays=new long[10];
        long sum=0L;
        String numString="9";
        for(int i=0;i<10;i++)
        {
            numArrays[i]=Long.parseLong(numString);
            sum=sum+numArrays[i];
            numString=numString+9;
        }
        System.out.println(sum);
    }
}
