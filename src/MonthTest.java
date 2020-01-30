import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MonthTest {

    @Test
    public void firstMonthNext() throws Exception {
        assertTrue(Month.JANUARY.next() == Month.FEBRUARY);
    }

    @Test
    public void middleMonthNext() throws Exception {
        assertTrue(Month.JUNE.next() == Month.JULY);
    }

    @Test
    public void lastMonthNext() throws Exception {
        assertTrue(Month.DECEMBER.next() == Month.JANUARY);
    }

    @Test
    public void evenMonthCountDays() throws Exception {
        assertTrue(31 == Month.MARCH.countDays());
    }

    @Test
    public void oddMonthCountDays() throws Exception {
        assertTrue(30 == Month.NOVEMBER.countDays());
    }

    @Test
    public void exceptionFebruaryCountDays() throws Exception {
        assertTrue(28 == Month.FEBRUARY.countDays());
    }

}