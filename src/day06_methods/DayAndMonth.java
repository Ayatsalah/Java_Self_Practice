package day06_methods;

public class DayAndMonth {
    public static void main(String[] args) {

        int dayNum = 5;
        String result = day(dayNum);
        System.out.println(result);
        
        int monthNum=9;
        String result1=monthName(monthNum);
        System.out.println(result1);

        if (result1== "Invalid Number"){
            System.out.println("invalid number");}
            else{
        System.out.println(result1 + " has " + dayInMonth(monthNum) + " days.");}
    }
    public static String day(int dayNumber){
        String result = "";
        boolean valid;
        valid = (dayNumber == 1 || dayNumber == 2 || dayNumber == 3 || dayNumber == 4 ||
                dayNumber == 5 || dayNumber == 6 || dayNumber == 7) ? true : false;
        if (valid == false) {
            result = "invalid Number";
        } else {
            switch (dayNumber) {
                case (1) -> result = "Monday";
                case (2) -> result = "Tuesday";
                case (3) -> result = "Wednesday";
                case (4) -> result = "Thursday";
                case (5) -> result = "Friday";
                case (6) -> result = "Saturday";
                case (7) -> result = "Sunday";
            }
        }
        return result;
    }
    public static String monthName(int num) {
        boolean valid;
        String result="";
        if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 ||
                num == 7 || num == 8 || num == 9 || num == 10 || num == 11 ||
                num == 12) valid = true;
        else {
            valid = false;
        }

        if (valid == false) {
            result = "Invalid Number";
        } else {
            switch (num) {
                case 1 -> result = "January";
                case 2 -> result = "February";
                case 3 -> result = "March";
                case 4 -> result = "April";
                case 5 -> result = "May";
                case 6 -> result = "June";
                case 7 -> result = "July";
                case 8 -> result = "August";
                case 9-> result = "September";
                case 10-> result = "October";
                case 11->result = "November";
                case 12->result = "December";
            }
        }
        return result;

    }
    public static String dayInMonth(int monthNum){
        boolean valid;
        String result="";
        valid=(monthNum==1 || monthNum == 2 || monthNum == 3 || monthNum == 4 || monthNum == 5 || monthNum == 6 ||
                monthNum == 7 || monthNum == 8 || monthNum == 9 || monthNum == 10 || monthNum == 11 ||
                monthNum == 12)? true:false;

        if (valid==false) result="Invalid Number";

        else
        {switch (monthNum)
        {
            case 2 -> result ="28";
            case 1,3,5,7,8,10,12 -> result="31";
            case 4,6,9,11 ->result ="30";
        }
        }
        return result;
    }

}

/* Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days


 */
