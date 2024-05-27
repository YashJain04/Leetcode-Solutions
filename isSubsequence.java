class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length() > t.length()) return false;
        if (s.equals(t)) return true;

        int timesRan = 0;
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + timesRan; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    counter++;
                    break;
                }

                else timesRan += 1;
            }
        }

        if (counter == s.length()) return true;
        return false;
    }
}

// s = "abc", t = "ahbgdc"
// a -> a
// b -> h
// b -> b
// c -> g