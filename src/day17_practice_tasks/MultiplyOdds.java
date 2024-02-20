package day17_practice_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class MultiplyOdds {
    public static void main(String[] args) {

        Map<Character,Integer> map = new LinkedHashMap<>();
        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);

//        for (Integer each : map.values()) {
//            if (each%2==1){
//                map.re(map.get(each),each*2);
//            }
//
//        }
        for (Character each : map.keySet()) {

            if(map.get(each)%2 == 1){
                map.replace(each,map.get(each)*2);
            }

        }
        System.out.println(map);
    }
}
/*Create a class named MultiplyOdds and write a program that takes a map with characters as keys
and integers as values. The program will iterate through the map and, for each entry where the value
is an odd number, it will multiply this value by two.

         Example:
               map = {'a'=1, 'b'=2, 'c'=3, 'd'=4, 'e'=5}

         Output:
            {'a'=2, 'b'=2, 'c'=6, 'd'=4, 'e'=10}

 */