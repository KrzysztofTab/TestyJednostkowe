package pl.krisT.naming;

import java.time.YearMonth;

public class Calendar {
    public int getDaycount(int year, int month){
        return YearMonth.of(year,month).lengthOfMonth();
    }
}
