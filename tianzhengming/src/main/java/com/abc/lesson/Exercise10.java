package com.abc.lesson;

import org.junit.Test;

public class Exercise10 {
    @Test
    public void IsPalindrome() {
        String str = "able was i ere i saw elba";
        int leftIndex = 0;
        int rightIndex = str.length() - 1;
        boolean flag = true;
        while ((rightIndex - leftIndex) >=1) {
            if (str.charAt(leftIndex) == str.charAt(rightIndex)) {
                leftIndex++;
                rightIndex--;
            } else {
                flag = false;
                System.out.println(flag + "该字符串不是回文串！");
                break;
            }
        }
        if (flag)
            System.out.println(flag + "该字符串是回文串");
    }
}
