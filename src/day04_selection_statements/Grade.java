package day04_selection_statements;

public class Grade {
    public static void main(String[] args) {
        char grade1 = 'B';

       /* switch (grade1){
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Great job");
            case 'C' -> System.out.println("Good");
            case 'D' -> System.out.println("Passed");
            case 'E' -> System.out.println("Failed");
            default ->  System.out.println("Invalid Grade");
    }*/
        if (grade1 == 'A') {
            System.out.println("Excellent");
        } else if (grade1 == 'B') {
            System.out.println("Great job");
        } else if (grade1 == 'C') {
            System.out.println("Good");
        } else if (grade1 == 'D') {
            System.out.println("Passed");
        } else if (grade1 == 'E') {
            System.out.println("Failed");
        } else System.out.println("Invalid Grade");

    }


        }

/*Create a class called Grade. A char variable named grade is given.
Write a program to print the following messages:

        'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
Otherwise: Invalid Grade

Example:
grade = 'B'

Output:
Great job*/
