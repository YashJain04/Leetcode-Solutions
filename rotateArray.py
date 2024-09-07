class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        container = nums.copy()

        for i in range(len(nums)):
            nums[i] = container[(i + (len(nums)-k)) % len(nums)]