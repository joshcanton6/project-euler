/*
 * You are given the following information, but you may prefer to do some research for yourself.
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */

import java.util.Calendar;

static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    int sundays = 0;
    for (int year = 1901; year <= 2000; year++) {
        for (int month = 0; month <= 11; month++) {
            cal.set(year, month, 1);
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) sundays++;
        }
    }
    System.out.println(sundays);
}