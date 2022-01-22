package com.teachmeskills.lesson_12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Task {
    public static void main(String[] args) {
        LocalDate nextWed = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(nextWed);
    }
}
