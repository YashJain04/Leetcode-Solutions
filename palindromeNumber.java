class Solution {
    public boolean isPalindrome(int x) {
        char [] array = Integer.toString(x).toCharArray();
        if (array[0] == '-') return false;
        else if (array.length == 2) {
            if (array[0] == array[1]) return true;
            else return false;
        }

        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[array.length -  1 - i]) continue;
                else return false;
            }
        }
        return true;
    }
}