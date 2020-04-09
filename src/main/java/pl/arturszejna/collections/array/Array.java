package pl.arturszejna.collections.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Array {
    static private String isDuplicatePrivateMessage(Integer[] myArray) {
        Set<Integer> mySet = new HashSet<>();

        for ( Integer x : myArray )
            if (!mySet.add(x))
                return "a duplicate exist";
        return "a duplicate not exist";
    }

    static private boolean isDuplicate(Integer[] myArray) {
        Set<Integer> mySet = new HashSet<>();

        for ( Integer x : myArray )
            if (!mySet.add(x))
                return true;

        return false;
    }

    static void isDuplicateMessage(Integer[] myArray) {
        System.out.println(isDuplicatePrivateMessage(myArray));
    }

    static Integer[] removeAllDuplicates(Integer[] myArray){
        if(isDuplicate(myArray)) {
            Set<Integer> set = new HashSet<>();
            Collections.addAll(set, myArray);

            return set.toArray(new Integer[0]);
        }
        return myArray;
    }

}
