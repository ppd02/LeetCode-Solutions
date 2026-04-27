class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        arr = nums1 + nums2
        arr.sort()
        median = 0

        if len(arr)%2 != 0:
            index = int(len(arr)/2)
            return arr[index]
        else:
            index1 = int(len(arr)/2)
            index2 = index1 - 1
            median = (arr[index1] + arr[index2])/2

        return median