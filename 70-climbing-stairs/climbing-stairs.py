class Solution:
    def climbStairs(self, n: int) -> int:
        memo = {}
        return self.recur(n, memo)
        
    def recur(self, n: int, memo:dict[int, int]) -> int:
        if n == 0 or n == 1:
            return 1
        if n not in memo:
            memo[n] =  self.recur(n-1, memo) + self.recur(n-2, memo)
        return memo[n]