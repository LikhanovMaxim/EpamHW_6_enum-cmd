public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    private final int countDays;
    Month(int countDays) {
        this.countDays = countDays;
    }

    public Month next() {
        return values()[(ordinal() + 1) % values().length];
    }

    public int countDays() {
        return this.countDays;
    }
}
