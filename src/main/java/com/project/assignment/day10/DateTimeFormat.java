package com.project.assignment.day10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter format1 =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        String dateFormat1 = currentDate.format(format1);
        String dateFormat2 = currentDate.format(format2);
        String dateFormat3 =currentDate.format(format3);

        System.out.println("Currnet date is dd/MM/YYYY format: "+dateFormat1);
        System.out.println("Currnet date is yyyy-MM-dd format: "+dateFormat2);
        System.out.println("Currnet date is EEE, MMM dd, yyyy format: "+dateFormat3);




    }
}
