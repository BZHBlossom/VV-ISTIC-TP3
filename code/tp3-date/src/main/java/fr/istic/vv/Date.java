package fr.istic.vv;

class Date implements Comparable<Date> {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static boolean isValidDate(int day, int month, int year) {
        return year >= 0 && month <= 12 && month >= 1 && day >= 1 &&
                !(month % 2 == 1 && day > 31) && !(month % 2 == 0 && day > 30) &&
                !(month == 2 && day >= 29);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else return year % 100 != 0;
    }

    public Date nextDate() {
        return null;
    }

    public Date previousDate() {
        return null;
    }

    public int compareTo(Date other) {
        return 0;
    }

}