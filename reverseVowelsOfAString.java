import java.util.*;
import java.io.*;

class Solution {
    public String reverseVowels(String s) {
        
        ArrayList <Character> vowels = new ArrayList <Character>();
        ArrayList <Character> vowelsInWord = new ArrayList<Character>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        for (int i = s.length() - 1; i > -1; i--) {
            if (vowels.contains(s.charAt(i))) {
                vowelsInWord.add(s.charAt(i));
            }
        }

        int counter = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                result += vowelsInWord.get(counter);
                counter++;
            }

            else result += s.charAt(i);
        }

        return result;

    }
}