class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        freq = {}
        for i in nums:
            freq[i] = freq.get(i, 0) + 1

        res = 0
        print(freq)
        for k,v in freq.items():
            if freq.get(k) == 1:
                res = k
        
        return res