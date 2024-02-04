package day07_class_objects_part1;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your score:");
        int grade=input.nextInt();
        String result = "Invalid Score";

        if (grade >= 0 && grade <= 100) {

            if (grade >= 90) {
                result = "A";
            } else if (grade >= 80) {
                result = "B";
            } else if (grade >= 70) {
                result = "C";
            } else if (grade >= 60) {
                result = "D";
            } else {
                result = "F";
            }

        }
        System.out.println("Your grade is "+result);

        input.close();
    }
    }

/*Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B

 */
