package day08_string;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split (Yes or No)?");
        String split = input.next();

        System.out.println("Enter the number of people:");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount:");
        int checkAmount = input.nextInt();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = input.next();

        double percentage = 0;
        if (serviceQuality.equalsIgnoreCase("poor")) {
            percentage = 0.05;
        } else if (serviceQuality.equalsIgnoreCase("fair")) {
            percentage = 0.1;
        } else if (serviceQuality.equalsIgnoreCase("good")) {
            percentage = 0.15;
        } else if (serviceQuality.equalsIgnoreCase("great")) {
            percentage = 0.2;
        } else if (serviceQuality.equalsIgnoreCase("excellent")) {
            percentage = 0.25;
        }

        double tip = checkAmount * percentage;
        double totalToPay = checkAmount + tip;
        double totalPerPerson = totalToPay / numberOfPeople;
        double tipPerPerson = tip / numberOfPeople;

        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + tip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);
    }
}
/* There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75


 */
