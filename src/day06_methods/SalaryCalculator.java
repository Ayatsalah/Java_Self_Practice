package day06;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourly1=45;
        int weeklyHour1 =40;

        double result = salary(hourly1,weeklyHour1);
        System.out.println(result);

    }
    public static double salary(double hourlyRate, int weeklyHour){

        double result = hourlyRate*weeklyHour*52;
        return result;

    }
}

/*Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0


 */