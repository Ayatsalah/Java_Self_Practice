package day07_class_objects_part1;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of cents");
        int d=input.nextInt();
        int dollars = d/100;
        int cents=d-(dollars*100);
        System.out.println(d+ " cents is equal to " + dollars+" dollars and " + cents + " cents");

        input.close();

    }
}
/*
Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents


 */
