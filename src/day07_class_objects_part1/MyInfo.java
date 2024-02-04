package day07_class_objects_part1;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your gender");
        String gender = input.next();

        input.nextLine();
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number");
        long phone = input.nextLong();

        System.out.println("Enter your Zip code");
        int zip = input.nextInt();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();
        input.nextLine();
        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state name");
        String stateName = input.nextLine();

        System.out.println("Enter your building number");
        int buldingNo = input.nextInt();
        input.nextLine();
        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone number: " + phone);
        System.out.println("School name: " + schoolName);
        System.out.println("Address:\n\t" + buldingNo + " " + streetName + "\n\t" + cityName + ", " + stateName + " " + zip);
    }
}
/*     Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode


 */
