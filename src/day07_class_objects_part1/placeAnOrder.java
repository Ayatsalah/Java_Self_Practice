package day07_class_objects_part1;

import java.util.Scanner;

public class placeAnOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name");

        String productName = input.nextLine();
        System.out.println("Enter the price");
        double price = input.nextDouble();
        System.out.println("Enter the quantity");
        int quantity = input.nextInt();
        System.out.println("Enter their first name");
        String firstName = input.next();
        System.out.println(firstName + ", " + "your order for " + quantity + " " + productName + " has been placed. your total is " + price*quantity + ".");
        input.close();

    }
}
/*
    Ask the user to enter the product name (multiple words).
    Ask the user to enter the price (double).
    Ask the user to enter the quantity (int).
    Ask the user to enter their first name (String, single word).

    Print in the following format:

        Example:
             Inputs: "Apples", 1.5, 5, "Luke"

        Output:
             Luke, your order for 5 Apples has been placed. Your total is 7.5.

 */