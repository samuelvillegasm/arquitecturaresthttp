package com.example.arquitecturaresthttp.helper;

import java.time.LocalDate;
import java.time.Period;

public class AgeHelper {

    public static boolean isValidBirthday(int day, int month, int year){
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDay = LocalDate.of(year, month, day);
        return currentDate.isAfter(birthDay);
    }

    public static int getAgeByBirthday(int day, int month, int year){
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDay = LocalDate.of(year, month, day);
        return Period.between(birthDay, currentDate).getYears();
    }
}
