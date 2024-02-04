package day06_methods;

public class MaximumAndMinimum {
    public static void main(String[] args) {

       double resultMax =max(10,200);
       double resultMin = min(20,1);

        System.out.println(resultMax);
        System.out.println(resultMin);

    }
    public static int max(int num1, int num2) {
        int maxNum;
        if (num1 > num2) maxNum = num1;
        else maxNum = num2;
        return maxNum;
    }
    public static double max(double num1, double num2) {
        double maxNum;
        if (num1 > num2) maxNum = num1;
        else maxNum = num2;
        return maxNum;
    }
    public static int min(int num1, int num2) {
        int minNum;
        if (num1 > num2) minNum = num2;
        else minNum = num1;
        return minNum;
    }
    public static double min(double num1, double num2) {
        double minNum;
        if (num1 > num2) minNum = num2;
        else minNum = num1;
        return minNum;
    }
}
/*Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100

 */