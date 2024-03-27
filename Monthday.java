/*1. Print the names of All months and the total number of days in each month using the enum java.time.Month. Consider that the year is not Leap Year.*/
package lab2;

import java.time.Month;
import java.time.YearMonth;

public class Monthday {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            YearMonth yearMonth = YearMonth.of(2024, month);
            int daysInMonth = yearMonth.lengthOfMonth();
            System.out.println(month + ": " + daysInMonth + " days");
        }
    }
}
