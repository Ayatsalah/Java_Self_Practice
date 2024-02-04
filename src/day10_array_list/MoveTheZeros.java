package day10_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MoveTheZeros {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        int count = Collections.frequency(list, 0);

        list.removeAll(Arrays.asList(0));

        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        System.out.println(list);

    }
}
/*Create a class called MoveTheZeros and write a program with the following specifications:
   5.1 Given an ArrayList, move all zeros to the last indexes of the ArrayList.

	            Example:
	                list: {1,0,2,0,3,0,4,0}

	            output:
	                [1, 2, 3, 4, 0, 0, 0, 0]

 */