package guru.qa;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class TestClass {

    @Test
    void FirstTest() {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        DayOfWeek todaysDayOfWeek = today.getDayOfWeek();
        DayOfWeek yesterdaysDayOfWeek = yesterday.getDayOfWeek();

        if (todaysDayOfWeek != yesterdaysDayOfWeek) {
            System.out.println("Everything is fine. Yesterday was "+ yesterdaysDayOfWeek + ", and today is " + todaysDayOfWeek);
        }
    }
}
