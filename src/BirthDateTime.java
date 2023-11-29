import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner icespice = new Scanner(System.in);

        int dayLimit;
        int year = InputHelper.getRangedInt(icespice, "Please enter the year you were born: ", 1950, 2010);
        int month = InputHelper.getRangedInt(icespice, "Please enter the month you were born: ", 1, 12);

        if(month == 4 || month == 6 || month == 9 || month == 11) {
            dayLimit = 30;
        } else if (month == 2) {
            dayLimit = 29;
        } else {
            dayLimit = 31;
        }

        int day = InputHelper.getRangedInt(icespice, "Please enter the day you were born: ", 1, dayLimit);
        int hour = InputHelper.getRangedInt(icespice, "Please enter the hour you were born: ", 1, 24);
        int minute = InputHelper.getRangedInt(icespice, "Please enter the minute you were born: ", 1, 59);

        System.out.printf("Year: %5d", year);
        System.out.printf("\nMonth: %4d", month);
        System.out.printf("\nDay: %6d", day);
        System.out.printf("\nHour: %5d", hour);
        System.out.printf("\nMinute: %3d", minute);
    }
}
