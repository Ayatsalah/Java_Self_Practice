package day08_string;

import java.util.Scanner;

public class WithoutFirstCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first words:");
        String str1 = input.next();
        String word1 = str1.substring(1);
        System.out.println("Enter second Word");
        String str2 = input.next();
        String word2 = str2.substring(1);
        System.out.println(word1.concat(word2));
    }
}
/* Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana

 */