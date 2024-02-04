package day09_array;

public class ClassMatesReversed {
    public static void main(String[] args) {
        //String[] classmates=new String[];


        String[] classmates = {"Kaylani Weber", "Crew Huber", "Raquel Orozco", "Keanu Jackson", "Avery Stuart",
                "Dion Spears", "Isabela Ball", "Shane Marin", "Celia Watson", "Greyson Carson"};

        for (int i = 0; i < classmates.length; i++) {
            for (int j = classmates[i].length()-1; j >=0 ; j--) {
                String reverse= ""+classmates[i].charAt(j);
                System.out.print(reverse);
            }
            System.out.println();
        }


    }
}
/* Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.

 */