package com.abc.lesson;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class Exercise12 {
    @Test
    public void testLeftPadAndRightPad() {
        String name = StringUtils.leftPad("goodman", 10, "*");
        System.out.println(name);

        name = StringUtils.rightPad("goodman", 10, "*");
        System.out.println(name);
    }

    @Test
    public void testRepeat() {
        String str = "Java";
        str = StringUtils.repeat(str, 10);
        System.out.println(str);
    }

    @Test
    public void testAbbreviate() {
        String line = "How long no see you";
        line = StringUtils.abbreviate(line, 15);
        System.out.println(line);
    }

    @Test
    public  void testJoin(){
        String[] strArr={"JAVA","C++","C#","PHP","Objective-C"};
        String str=StringUtils.join(strArr," ");
        System.out.println(str);
    }
}
