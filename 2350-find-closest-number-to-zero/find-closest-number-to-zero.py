class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        mini = float('inf')

        for i in nums:
            if abs(i) < abs(mini):
                mini = i
            elif abs(i) == abs(mini):
                mini = max(mini, i)
       
        return mini