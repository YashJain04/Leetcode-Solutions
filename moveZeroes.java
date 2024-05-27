class Solution {
    public void moveZeroes(int[] nums) {
        
        int trackZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[trackZero] = nums[i];
                trackZero += 1;
            }
        }

        for (int i = trackZero; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}