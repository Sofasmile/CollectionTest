package com.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularUtil {
    private static final String PHONE_NUMBER = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}\\-\\d{2}\\-\\d{2}$";
    private static final String EMAIL = "^\\w+[a-zA-Z0-9\\.\\_\\-]*@([a-zA-Z]+\\.)+[a-zA-Z]+$";
    private static final String DATE = "^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[012])\\.(19|2[0-9])([0-9]{2})$";
    private static final String IP = "^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]?|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]?|[0-9])$";

    public static boolean isPhoneNumber(String phoneNumberCheck) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(phoneNumberCheck);
        return matcher.matches();
    }

    public static boolean isEmail(String emailCheck) {
        Pattern pattern = Pattern.compile(EMAIL);
        Matcher matcher = pattern.matcher(emailCheck);
        return matcher.matches();
    }

    public static boolean isDate(String dateCheck) {
        Pattern pattern = Pattern.compile(DATE);
        Matcher matcher = pattern.matcher(dateCheck);
        if (matcher.matches()) {
            Pattern subString = Pattern.compile("\\.");
            String[] numbers = subString.split(dateCheck);
            return isCorrectDate(numbers[0], numbers[1], numbers[2]);
        } else {
            return false;
        }
    }

    private static boolean isCorrectDate(String dd, String mm, String yyyy) {
        int year = Integer.parseInt(yyyy);
        if (dd.equals("31") && isCorrectMonth(mm)) {
            return false;
        }
        if (dd.equals("30") && mm.equals("02")) {
            return false;
        }
        if (dd.equals("29") && mm.equals("02") && !isCorrectYear(year)) {
            return false;
        }
        return true;
    }

    private static boolean isCorrectYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 | year % 400 == 0));
    }

    private static boolean isCorrectMonth(String month) {
        return (month.equals("02") | month.equals("04")
                | month.equals("06") | month.equals("09")
                | month.equals("11"));
    }

    public static boolean isIP(String ipCheck) {
        Pattern pattern = Pattern.compile(IP);
        Matcher matcher = pattern.matcher(ipCheck);
        return matcher.matches();
    }
}
