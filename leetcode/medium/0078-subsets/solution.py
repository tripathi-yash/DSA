class Solution:
    def subsets(self, nums: list[int]) -> list[list[int]]:
        
        ans = [[]]

        for num in nums:
            temp = []
            for curr in ans:
                temp.append([num] + curr)
            ans.extend(temp)
        
        return ans