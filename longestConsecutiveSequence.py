class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        if (len(nums) == 0):
            return 0

        noDuplicates = sorted(set(nums))
        highestResult, result = 0, 0

        for i in range(len(noDuplicates)):
            if (result == highestResult + 1):
                highestResult = result

            if(i + 1 == len(noDuplicates)):
                return highestResult + 1

            if (noDuplicates[i + 1] == noDuplicates[i] + 1):
                result += 1
                
            else:
                result = 0