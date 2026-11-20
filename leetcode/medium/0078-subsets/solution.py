class Solution(object):
    def solve(self, i, nums, curr, ans ):

        if(i == len(nums)):
            ans.append(curr[:])
            return

        curr.append(nums[i])
        self.solve(i+1, nums, curr, ans)
        curr.pop(len(curr)-1)
        self.solve(i+1, nums, curr, ans)
    
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        ans = []

        self.solve(0, nums, [], ans)

        return ans
        