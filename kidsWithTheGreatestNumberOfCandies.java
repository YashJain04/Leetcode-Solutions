import java.util.*;
import java.io.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxValue = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxValue) {
                maxValue = candies[i];
            }
        }

        List <Boolean> myList = new ArrayList <Boolean> ();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxValue) {
                myList.add(true);
            }

            else {
                myList.add(false);
            }
        }

        return myList;

    }
}