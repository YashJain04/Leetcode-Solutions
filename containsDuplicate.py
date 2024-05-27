class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        result = set()

        for number in nums:
            if number not in result:
                result.add(number)
            else:
                return True
        
        return False