package com.teachmeskills.lesson_12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date myDate = sdf.parse("22/01/2021");
        sdf.applyPattern("EEE, d MMM yyyy");
        String sMyDate = sdf.format(myDate);
        System.out.println(sMyDate);
    }
}
