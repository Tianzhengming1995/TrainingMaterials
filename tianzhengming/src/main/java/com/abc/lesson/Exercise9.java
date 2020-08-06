package com.abc.lesson;

import org.junit.Test;

public class Exercise9 {
    @Test
    public void getLastString1(){
        String str="someapp/manager/emplist.action";
        String[] strings=str.split("/");
        System.out.println(strings[strings.length-1]);
    }

    @Test
    public void getLastString2(){
        String str="someapp/manager/emplist.action";
        int lastIndex=str.lastIndexOf('/');
        System.out.println(str.substring(lastIndex+1));
    }
}
