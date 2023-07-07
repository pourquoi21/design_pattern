package com.in28minutes.ifstatement.examples;

public class DaysRunner {

    public static void main(String[] args) {
        System.out.println(determineNameOfMonth(9));

        System.out.println(determineNameOfDay(6));

        System.out.println(isWeekDay(3));
    }

    public static String determineNameOfDay(int dayNumber) {
        String result;
        switch (dayNumber) {
        case 0:
            result = "Sunday";
            break;
        case 1:
            result = "Monday";
            break;
        case 2:
            result = "Tuesday";
            break;
        case 3:
            result = "Wednesday";
            break;
        case 4:
            result = "Thursday";
            break;
        case 5:
            result = "Friday";
            break;
        case 6:
            result = "Saturday";
            break;
        default:
            result = "Wrong dayNumber";
            break;
        }
        return result;
    }

    public static boolean isWeekDay(int dayNumber) {
        switch (dayNumber) {
        case 0:
            return false;
        case 1:
            return true;
        case 2:
            return true;
        case 3:
            return true;
        case 4:
            return true;
        case 5:
            return true;

        case 6:
            return false;

        default:
            return false;
        }
    }

    public static String determineNameOfMonth(int monthNumber) {

        switch (monthNumber) {
        case 1:
            return "January";
        case 2:
            return "February";
        case 3:
            return "March";
        case 4:
            return "April";
        case 10:
            return "October";
        case 11:
            return "November";
        case 12:
            return "December";
        }
        return "This number isn't for a month";
    }

}
