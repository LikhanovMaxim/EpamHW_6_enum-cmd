public enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    private final int[] daysCount;
    private final int monthCount;

    Month() {
        monthCount = 12;
        daysCount = new int[12];
        daysCount[0] = 31; //JANUARY
        daysCount[1] = 28; //FEBRUARY
        daysCount[2] = 31; //MARCH
        daysCount[3] = 30; //APRIL
        daysCount[4] = 31; //MAY
        daysCount[5] = 30; //JUNE
        daysCount[6] = 31; //JULY
        daysCount[7] = 31; //AUGUST
        daysCount[8] = 30; //SEPTEMBER
        daysCount[9] = 31; //OCTOBER
        daysCount[10] = 30; //NOVEMBER
        daysCount[11] = 31; //DECEMBER
    }

    public Month next() {
        return values()[(ordinal() + 1) % monthCount];
    }

    public int countDays() {
        return daysCount[ordinal()];
    }
}
