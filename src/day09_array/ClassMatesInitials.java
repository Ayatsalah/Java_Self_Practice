package day09_array;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {
        String[] classmates = {"Kaylani Weber", "Crew Huber", "Raquel Orozco", "Keanu Jackson", "Avery Stuart",
                "Dion Spears", "Isabela Ball", "Shane Marin", "Celia Watson", "Greyson Carson"};

        for (int i = 0; i < classmates.length; i++) {


            System.out.println(classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ")+1));
        }

    }
}

/*Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.

 */
