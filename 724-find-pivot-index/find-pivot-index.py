class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        leftSum, rightSum = 0, 0
        for i in nums:
            rightSum += i

        for i in range(len(nums)):
            rightSum -= nums[i]
            if leftSum == rightSum:
                return i
            else:
                leftSum += nums[i]

        return -1