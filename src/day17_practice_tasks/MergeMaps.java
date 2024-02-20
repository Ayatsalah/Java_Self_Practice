package day17_practice_tasks;

import java.util.Map;
import java.util.TreeMap;

public class MergeMaps {
    public static void main(String[] args) {
        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();
        Map<Character, Integer> result = new TreeMap<>();

        map1.put('A', 10);
        map1.put('B', 20);
        map2.put('B', 30);
        map2.put('C', 40);

        for (Character each1 : map1.keySet()) {
            for (Character each2 : map2.keySet()) {
                if (each1!=each2) {
                    result.putIfAbsent(each1, map1.get(each1));
                    result.putIfAbsent(each2, map2.get(each2));}
                else {result.put(each1, (map1.get(each1) + map2.get(each2)));}

            }

        }
        System.out.println(result);
    }
}
/* Create a class named MergeMaps and write a program that merge two given maps.
If a key is present in both maps, add their corresponding values together.

         Example:
               map1 = {'A'=10, 'B'=20}
               map2 = {'B'=30, 'C'=40}

         Output:
               {'A'=10, 'B'=50, 'C'=40}


 */