/* 2. Write a program to check if today is independence day (15th August) or not using java MonthDay class. Using the method isBefore () find out if today is before or after the independence day. If today is before independence day then print “Independence day is yet to come this year." otherwise print “Independence day was already celebrated this year.” [Perform internet search if required.]*/
package lab2;

import java.time.LocalDate;
import java.time.MonthDay;

public class IndependenceDayChecker {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();
        
        // Create a MonthDay object for Independence Day (15th August)
        MonthDay independenceDay = MonthDay.of(8, 15);
        
        // Check if today is Independence Day
        if (MonthDay.from(today).equals(independenceDay)) {
            System.out.println("Today is Independence Day!");
        } else {
            // Check if today is before or after Independence Day
            if (MonthDay.from(today).isBefore(independenceDay)) {
                System.out.println("Independence day is yet to come this year.");
            } else {
                System.out.println("Independence day was already celebrated this year.");
            }
        }
    }
}
