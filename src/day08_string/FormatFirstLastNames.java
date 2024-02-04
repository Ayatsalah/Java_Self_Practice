package day08_string;

import java.util.Scanner;

public class FormatFirstLastNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your first name:");
        String str1 = input.next();

        System.out.println("Enter your last name:");
        String str2 = input.next();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        String firstletter1 = str1.substring(0, 1);
        String firstletter2 = str2.substring(0, 1);

         str1=str1.replaceFirst(firstletter1,firstletter1.toUpperCase());
         str2=str2.replaceFirst(firstletter2,firstletter2.toUpperCase());

        System.out.println(str1 + " " + str2);

    }
}
/* Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School

 */
