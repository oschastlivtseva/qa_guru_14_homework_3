package guru.qa;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class TestClass {

    @Test
    void FirstTest() {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        DayOfWeek todayDayOfWeek = today.getDayOfWeek();
        DayOfWeek yesterdaysDayOfWeek = yesterday.getDayOfWeek();

        if (todayDayOfWeek != yesterdaysDayOfWeek) {
            System.out.println("Everything is fine. Yesterday was "+ yesterdaysDayOfWeek + ", and today is " + todayDayOfWeek);
        } else {
            System.out.println(
                    "Something is wrong. Please recheck the data from variables 'today': " + today
                            + ", 'todayDayOfWeek': " + todayDayOfWeek
                            + " and 'yesterday': " + yesterday
                            + ", 'yesterdaysDayOfWeek': " + yesterdaysDayOfWeek
            );
        }
    }
}
