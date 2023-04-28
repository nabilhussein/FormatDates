package com.date.io;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(fmt);
        System.out.println(formattedDate);

        DateTimeFormatter fmt1 =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate1 = today.format(fmt1);
        System.out.println(formattedDate1);

        DateTimeFormatter fmt2 =
                DateTimeFormatter.ofPattern("MMM dd, yyyy ");
        String formattedDate2 = today.format(fmt2);
        System.out.println(formattedDate2);

        DateTimeFormatter fmt3 =
                DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm");
        String formattedDate3 = today.format(fmt3);
        System.out.println(formattedDate3);
    }
}
