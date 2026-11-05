class Solution:

    def solve(self, idx , n, k, ans, curr):

        if len(curr) == k:
            ans.append(curr[:])
            return 

        for i in range(idx,n+1):
            curr.append(i)
            self.solve(i+1,n,k,ans,curr)
            curr.pop(len(curr)-1)

    def combine(self, n: int, k: int) -> list[list[int]]:
        
        ans = []
        curr = []

        self.solve(1, n, k, ans, curr)

        return ans