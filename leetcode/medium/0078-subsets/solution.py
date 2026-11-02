class Solution:
    def subsets(self, nums: list[int]) -> list[list[int]]:
        
        ans = [[]]

        if(len(nums) > 1):
            for i in range(len(nums)):
                ans.append([nums[i]])
                for j in range(i+1,len(nums)):
                    ans.append([nums[i],nums[j]])

        ans.append(nums)
        
        return ans