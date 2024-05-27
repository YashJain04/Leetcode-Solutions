class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        if (len(nums) == k):
            return nums

        storeAmount = {}
        result = []

        for number in nums:
            if (number not in storeAmount):
                storeAmount[number] = 1
            else:
                storeAmount[number] += 1

        sortedAmount = sorted(storeAmount.items(), key=lambda x: x[1], reverse=True)
        sortedAmount = dict(sortedAmount)
        sortedAmount = list(sortedAmount.keys())
        
        i = 0
        while (len(result) != k):
            result.append(sortedAmount[i])
            i += 1
        
        return result