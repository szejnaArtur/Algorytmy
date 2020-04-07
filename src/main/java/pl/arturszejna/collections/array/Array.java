package pl.arturszejna.collections.array;

import java.util.HashSet;
import java.util.Set;

class Array {
    static private String isDuplicates(int[] myArray) {
        Set<Integer> mySet = new HashSet<Integer>();


        for ( Integer x : myArray ) {
            if (!mySet.add(x)) {
                return "a duplicate exist";
            }
        }
        return "a duplicate not exist";
    }

    static void checkForDuplicates(int[] myArray) {
        Set<Integer> mySet = new HashSet<Integer>();
        System.out.println(isDuplicates(myArray));
    }

}
