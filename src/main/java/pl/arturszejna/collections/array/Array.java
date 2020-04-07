package pl.arturszejna.collections.array;

import java.util.HashSet;
import java.util.Set;

class Array {
    static private String isDuplicatePrivateMessage(int[] myArray) {
        Set<Integer> mySet = new HashSet<Integer>();

        for ( Integer x : myArray )
            if (!mySet.add(x))
                return "a duplicate exist";
        return "a duplicate not exist";
    }

    static private boolean isDuplicate(int[] myArray) {
        Set<Integer> mySet = new HashSet<Integer>();

        for ( Integer x : myArray )
            if (!mySet.add(x))
                return true;

        return false;
    }

    static void isDuplicateMessage(int[] myArray) {
        System.out.println(isDuplicatePrivateMessage(myArray));
    }

    static int[] removeAllDuplicates(int[] myArray){
        if(isDuplicate(myArray)) {
            Set<Integer> set = new HashSet<Integer>();

            for ( Integer x : myArray )
                set.add(x);

            int[] newArray = new int[set.size()];
            int i = 0;

            for ( Integer x : set )
                newArray[i++] = x;

            return newArray;
        }
        return myArray;
    }

}
