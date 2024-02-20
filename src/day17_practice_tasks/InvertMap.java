package day17_practice_tasks;

import java.util.Map;
import java.util.TreeMap;

public class InvertMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap<>();
        Map<String,Integer> result=new TreeMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        for (Integer each : map.keySet()) {
            result.put(map.get(each),each);

        }
        System.out.println(map);
        System.out.println(result);
    }
}
/*Create a class named InvertMap and write a program that returns a new map which is the
inverted version of the provided map, meaning the keys become values and the values become keys.
It is assumed that there are no duplicate values in the original map.

         Example:
               map = {1="a", 2="b", 3="c"}

         Output:
               {"a"=1, "b"=2, "c"=3}

 */