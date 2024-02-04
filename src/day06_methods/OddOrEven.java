package day06_methods;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 101;

        System.out.println(isOdd(number));
        System.out.println(isEven(number));
    }
    public static boolean isOdd(int num) {
        boolean result;
        if (num % 2 == 1) {
            result = true;
        } else result = false;
        return result;
    }
    public static boolean isEven(int num) {
        boolean result3;
        if (num % 2 == 0) {
            result3= true;
        } else result3= false;
        return result3;
    }
}
/*. Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true

 */