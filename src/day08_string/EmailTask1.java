package day08_string;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email");
        String str = input.nextLine();

        if (str.contains("_")) {
            int index = str.indexOf("_");
            String firstName = str.substring(0, index);
            int index2 = str.indexOf("@");
            String secondName = str.substring(index + 1, index2);
            String rest = str.substring(index2);
            //System.out.println(secondName+"_"+firstName+rest);
            System.out.println(secondName.concat("_".concat(firstName.concat(rest))));
        } else System.out.println(str);
    }
}
/*Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com

 */