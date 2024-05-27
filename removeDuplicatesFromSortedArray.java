import java.io.*;
import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

        ArrayList <Integer> newList = new ArrayList <Integer> ();
        ArrayList <Integer> newList2 = new ArrayList <Integer> ();

        for (int num : nums) {
            newList.add(num);
        }

        for (int i = 0; i < newList.size(); i++) {

            for (int j = i + 1; j < newList.size(); j++) {

                if (newList.get(i) == newList.get(j)) {
                    newList.set(j, null);
                }

            }
        }

        for (Integer num : newList) {
            if (num != null) {
                newList2.add(num);
            }
        }

        System.out.println(newList2);

        for (int i = 0; i < newList2.size(); i++) {
            nums[i] = newList2.get(i);
        }

        return newList2.size();

    }
}