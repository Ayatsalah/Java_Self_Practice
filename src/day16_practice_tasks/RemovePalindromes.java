package day16_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));
        List<String> result=new ArrayList<>();

        String str="";

        for (int i = 0; i < list.size(); i++) {
            str= list.get(i);
            String str2="";
            for(int j=str.length()-1;j>=0;j--){
                str2+=""+str.charAt(j);
            }
           // if (str.equalsIgnoreCase(str2)){list.remove(str);}
            if (!str.equalsIgnoreCase(str2)){result.add(str);}
        }
        System.out.println(result);
       // System.out.println(list);
    }
}

/* Create a class named RemovePalindromes and write a program that removes all palindrome strings from a given list of strings. The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}




 */