package day08_string;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String str = input.nextLine();
        int index1 = str.indexOf("_");
        int index2 = str.indexOf("@");
        int index3 = str.indexOf(".");

        String firstName = str.substring(0, index1);
        String secondName = str.substring(index1 + 1, index2);
        String domain = str.substring(index2 + 1, index3);

        String firstLetter1=firstName.substring(0,1);
        String firstLetter2=secondName.substring(0,1);
        String final1=firstName.replaceFirst(firstLetter1,firstLetter1.toUpperCase());
        String final2=secondName.replaceFirst(firstLetter2,firstLetter2.toUpperCase());

        System.out.println("First name: " + final1);
        System.out.println("Last Name: " + final2);
        System.out.println("Domain: " + domain);

    }
}
/*Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple

 */
