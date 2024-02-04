package day06_methods;

public class MathUtility {
    public static void main(String[] args) {

        int result1 = calculate(10, '+', 20);
        System.out.println(result1);
        System.out.println(calculate(2.5,'*',3.0));
        int squareResult=square(8);
        int cubeResult =cube(3);
        System.out.println(squareResult);
        System.out.println(cubeResult);
        System.out.println(square(1.5));
        System.out.println(cube(2.5));

    }
    public static int calculate(int num1, char operator, int num2) {
        int result;
        //boolean validOperator = (operator == '+' || operator == '-' || operator == '*' || operator == '/') ? true : false;
        //if (validOperator == false) {
           // return result = 0;
       // } else {
            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
                default -> result=0;
            }
            return result;
        }
    public static double calculate(double num1, char operator, double num2) {
        double result;
       // boolean validOperator = (operator == '+' || operator == '-' || operator == '*' || operator == '/') ? true : false;
      //  if (validOperator == false) {
          //  return result = 0;
        //} else {
            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
                default -> result=0;
            }
            return result;
        }
    public static int square(int num){
        int result=calculate(num,'*',num);
        return result;

    }
    public static double square(double num){
        double result=calculate(num,'*',num);
        return result;
    }
    public static int cube(int num){
        int result=square(num)*num;
        return result;
    }
    public static double cube(double num){
        double result=square(num)*num;
        return result;
    }
}
/*
	5.3 Create a method named square that takes an int and returns the square, hierarchically calling the
	calculate method to calculate the square.

			Example:
				int num = square(8);

			Output:
				64

	5.4 Overload the square method for double numbers.

			Example:
				double num = square(1.5);

			Output:
				2.25

	5.5 Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9

	5.6 Overload the cube method for double numbers.

			Example:
				double num = cube(2.5);

			Output:
				15.625


 */
