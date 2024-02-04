package day06_methods;

public class DayAndMonth1 {
    public static void main(String[] args) {
        int dayNum = 5;
       day(dayNum);

        int monthNum=9;
       monthName(monthNum);

       int month=6;


    }
    public static void day(int dayNum) {
        String result = "";
        if (dayNum >= 1 && dayNum <= 7) {
            switch (dayNum) {
                case (1) -> result = "Monday";
                case (2) -> result = "Tuesday";
                case (3) -> result = "Wednesday";
                case (4) -> result = "Thursday";
                case (5) -> result = "Friday";
                case (6) -> result = "Saturday";
                case (7) -> result = "Sunday";
            }
            System.out.println(result);
        } else System.out.println("Invalid Number");
    }
    public static void monthName(int num){
        String result1 = "";
        if (num >= 1 && num <= 12) {
            switch (num) {
                case 1 -> result1 = "January";
                case 2 -> result1 = "February";
                case 3 -> result1 = "March";
                case 4 -> result1 = "April";
                case 5 -> result1 = "May";
                case 6 -> result1 = "June";
                case 7 -> result1 = "July";
                case 8 -> result1 = "August";
                case 9-> result1 = "September";
                case 10-> result1 = "October";
                case 11->result1 = "November";
                case 12->result1 = "December";
            }
            System.out.println(result1);
        } else System.out.println("Invalid Number");
    }
    public static void dayInMonth(int monthNum){

        int result =0;

        if (monthNum>=1 && monthNum<=12){
            switch (monthNum) {
                case 2 -> result =28;
                case 1,3,5,7,8,10,12 -> result=31;
                case 4,6,9,11 ->result =30;
        }
            System.out.println(" has " + result + " days.");}

        else System.out.println("Invalid Number");
    }

    }

