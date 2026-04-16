class Solution:
    def addBinary(self, a: str, b: str) -> str:
        
        decA, decB = int(a, 2), int(b, 2)

        res = decA + decB
        
        return bin(res)[2:]