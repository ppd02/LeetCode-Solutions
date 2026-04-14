class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        arr = []
        if(len(nums1) > len(nums2)):
            for i in nums2:
                if i in nums1:
                    nums1.remove(i)
                    arr.append(i)
        else:
            for i in nums1:
                if i in nums2:
                    nums2.remove(i)
                    arr.append(i)
        
        return arr