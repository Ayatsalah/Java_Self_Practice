package day08_string;

import java.util.Scanner;

public class CombineWords1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String str1 = input.next();

        System.out.println("Enter the second word:");

        String str2 = input.next();

        int length = str1.length();

        if (str1.charAt(length - 1) == str2.charAt(0)) {
            System.out.println(str1.concat(str2.substring(1)));
        } else System.out.println(str1.concat(str2));
    }
}

