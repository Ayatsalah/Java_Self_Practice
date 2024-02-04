package day03_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 50;
        int weeklyHors = 45;
        double stateTaxRate = 0.06;
        double federalTaxRate = 0.26;

        double salaryBeforeTax = 52*hourlyRate*weeklyHors;
        double stateTax = salaryBeforeTax * stateTaxRate ;
        double federalTax = salaryBeforeTax * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("\t Gross pay is: $" + salaryBeforeTax);
        System.out.println("\t Federal tax is: $" + federalTax);
        System.out.println("\t State Tax is: $" + stateTax );
        System.out.println("\t Total Tax is: $" + totalTax);
        System.out.println("\t Net income is: $" + salaryAfterTax);

    }
}
/*                      Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0

*/