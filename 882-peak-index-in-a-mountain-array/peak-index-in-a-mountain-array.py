class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        peak = 0
        for i in range(1, len(arr)):
            if arr[i] < arr[i-1]:
                peak = i-1
                break

        return peak