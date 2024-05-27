class Solution {
    public String mergeAlternately(String word1, String word2) {

        String result = "";

        if (word1.isBlank() && word2.isBlank()) return "";
        if (word1.isBlank()) return word2;
        if (word2.isBlank()) return word1;

        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                result += word1.charAt(i);
                result += word2.charAt(i);
            }
        }

        else if (word1.length() < word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                result += word1.charAt(i);
                result += word2.charAt(i);
            }

            for (int i = word1.length(); i < word2.length(); i++) {
                result += word2.charAt(i);
            }
        }

        else if (word2.length() < word1.length()) {
            for (int i = 0; i < word2.length(); i++) {
                result += word1.charAt(i);
                result += word2.charAt(i);
            }

            for (int i = word2.length(); i < word1.length(); i++) {
                result += word1.charAt(i);
            }
        }


        return result;

    }
}