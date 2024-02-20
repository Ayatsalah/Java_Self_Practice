package day17_practice_tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str="bbcccaaaaa";

        Map<Character,Integer> map = new LinkedHashMap<>();
       ArrayList <Character> ch=new ArrayList<>();
        for (char each : str.toCharArray()) {
            ch.add(each);
        }
        for (Character each : ch) {
            int n=Collections.frequency(ch,each);
            map.putIfAbsent(each,n);

        }
        System.out.println(map);

    }
}
/*Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}

 */