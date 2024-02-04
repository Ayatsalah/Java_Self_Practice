package day04_selection_statements;

public class FINRA {
    public static void main(String[] args) {
        int num = 15;
        int multipleOf3 = num % 3;
        int multipleOf5 = num % 5;

        if (multipleOf3 == 0 && multipleOf5 == 0) {
            System.out.println("FINRA");
        } else if (multipleOf3 == 0) {
            System.out.println("FIN");
        } else if (multipleOf5 == 0) {
            System.out.println("RA");
        } else {
            System.out.println("error");
        }


    }
}
/* Create a class called FINRA. Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.

			Example:
				   number = 15

			Output:
				  FINRA
*/