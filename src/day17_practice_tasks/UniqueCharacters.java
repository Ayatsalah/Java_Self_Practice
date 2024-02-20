package day17_practice_tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class UniqueCharacters {
    public static void main(String[] args) {
        Map<Character,Integer> map=new TreeMap<>();
        String str="aabcccdeeeef";
        ArrayList<Character> ch=new ArrayList<>();
        for (char c : str.toCharArray()) {
            ch.add(c);
        }
        for (Character each : ch) {
            int n = Collections.frequency(ch,each);
            if (n==1){
               map.put(each,n) ;
            }

        }
        System.out.println(map);
    }
}
/*Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}


 */