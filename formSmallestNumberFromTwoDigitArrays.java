import java.io.*;
import java.util.*;

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {

        int smallestFirst = nums1[0];
        int smallestSecond = nums2[0];
        ArrayList <Integer> duplicateValues = new ArrayList <Integer> ();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    duplicateValues.add(nums1[i]);
                }
            }
        }

        if (!duplicateValues.isEmpty()) {
            Collections.sort(duplicateValues);
            return duplicateValues.get(0);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] < smallestFirst) smallestFirst = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] < smallestSecond) smallestSecond = nums2[i];
        }

        if (smallestFirst < smallestSecond) {
            String wordResult = Integer.toString(smallestFirst) + Integer.toString(smallestSecond);
            return Integer.parseInt(wordResult);
        }

        String wordResult = Integer.toString(smallestSecond) + Integer.toString(smallestFirst);
        return Integer.parseInt(wordResult);
    }
}