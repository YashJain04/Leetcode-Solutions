import java.io.*;
import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {

        ArrayList <Integer> newList = new ArrayList <> ();

        for (int num : nums) {
            if (num != val) {
                newList.add(num);
            }
        }

        for (int i = 0; i < newList.size(); i++) {
            nums[i] = newList.get(i);
        }

        return newList.size();

    }
}