package pl.krisT.TestCalendar;

import java.time.YearMonth;

public class Calendar {
    public int getDaycount(int year, int month) {
        return YearMonth.of(year, month).lengthOfMonth();
    }
//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                return 31;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                return 30;
//        }
//        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
//    }
}
