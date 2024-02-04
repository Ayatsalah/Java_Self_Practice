package day08_string;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word:");
       String word= input.next();
      // String word1=word.toLowerCase();
       if(word.startsWith("x") || word.startsWith("X")){
           String str=word.replaceFirst("x","a");
           System.out.println(str);
       }
       else System.out.println(word);
    }
}
/*Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex

 */