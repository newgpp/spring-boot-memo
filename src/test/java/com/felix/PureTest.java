package com.felix;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PureTest {

    @Test
    public void get_time_should_success() {
        LocalDateTime start = LocalDate.now().atStartOfDay();

        LocalDateTime end = start.plusMinutes(60);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        for (LocalDateTime date = start; date.isBefore(end); date = date.plusMinutes(10)) {
            System.out.println(date.format(formatter));
        }
    }
}
