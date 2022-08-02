package guru.qa;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;


public class TestClass {

    @Test
    void FirstTest() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.minusDays(1);

        DayOfWeek todaysDayOfWeek = today.getDayOfWeek();
        DayOfWeek tomorrowsDayOfWeek = tomorrow.getDayOfWeek();

        if (todaysDayOfWeek != tomorrowsDayOfWeek) {
            System.out.println("Everything is fine. Today is " + todaysDayOfWeek + ", and tomorrow will be " + tomorrowsDayOfWeek);
        }
    }

    @Test
    void SecondTest() {
        LocalDate today = LocalDate.now();
        LocalDate next = today.plusMonths(1);

        Month todaysMonth = today.getMonth();
        Month nextMonth = next.getMonth();

        if (todaysMonth != nextMonth) {
            System.out.println("Everything is fine. Now is " + todaysMonth + ", and next month will be " + nextMonth);
        }
    }
}
