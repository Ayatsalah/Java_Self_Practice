package day05_loops;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        int multi =1;
        for (int i = num; i > 0; i--) {
            multi *= i;
        }
        System.out.println(multi);
    }
}
/*Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

*/