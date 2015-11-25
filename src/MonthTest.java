import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MonthTest {

    @Test
    public void firstMonthNext() throws Exception {
        Month month = Month.JANUARY;
        Month nextMonth = Month.FEBRUARY;
        assertTrue(month.next() == nextMonth);
    }

    @Test
    public void middleMonthNext() throws Exception {
        Month month = Month.JUNE;
        Month nextMonth = Month.JULY;
        assertTrue(month.next() == nextMonth);
    }

    @Test
    public void lastMonthNext() throws Exception {
        Month month = Month.DECEMBER;
        Month nextMonth = Month.JANUARY;
        assertTrue(month.next() == nextMonth);
    }

    @Test
    public void evenMonthCountDays() throws Exception {
        Month evenMonth = Month.MARCH;
        int result = 31;
        assertTrue(result == evenMonth.countDays());
    }

    @Test
    public void oddMonthCountDays() throws Exception {
        Month oddMonth = Month.NOVEMBER;
        int result = 30;
        assertTrue(result == oddMonth.countDays());
    }

    @Test
    public void exceptionFebruaryCountDays() throws Exception {
        Month evenMonth = Month.FEBRUARY;
        int result = 28;
        assertTrue(result == evenMonth.countDays());
    }
}