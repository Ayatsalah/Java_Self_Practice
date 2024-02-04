package day07_class_objects_part1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = input.nextDouble();

        double a = r * r * 3.14;
        double p = 2 * r * 3.14;

        System.out.println("The area of the Circle is " + a);
        System.out.println("The perimeter of the Circle is " + p);
        input.close();
    }
}
/*Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4

 */
