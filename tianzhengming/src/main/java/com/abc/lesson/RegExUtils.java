package com.abc.lesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUtils {
    public static final String IDENTITY_CARD = "(^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|" +
            "(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}$)";
    public static final String ZIP_CODE = "[1-9]\\\\d{5}";
    public static final String PHONE_NUMBER = "^((13[0-9])|(15[^4,\\\\D])|(17[0])|(18[0,5-9]))\\\\d{8}$";

    public static boolean check(String str) {
        Pattern p1 = Pattern.compile(IDENTITY_CARD);
        Pattern p2 = Pattern.compile(ZIP_CODE);
        Pattern p3 = Pattern.compile(PHONE_NUMBER);
        Matcher m1 = p1.matcher(str);
        Matcher m2 = p2.matcher(str);
        Matcher m3 = p3.matcher(str);
        boolean rs1 = m1.matches();
        boolean rs2 = m2.matches();
        boolean rs3 = m3.matches();
        return rs1 || rs2 || rs3;
    }

    public static boolean identityCard(String str) {
        return str.matches(IDENTITY_CARD);
    }

    public static boolean zipcode(String str) {
        return str.matches(ZIP_CODE);
    }

    public static boolean phoneNumber(String str) {
        return str.matches(PHONE_NUMBER);
    }
}

