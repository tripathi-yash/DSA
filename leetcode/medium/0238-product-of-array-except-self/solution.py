class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        
        prefix = suffix = 1
        n = len(nums)

        ans = []

        for i in nums:
            ans.append(prefix)
            prefix *= i

        for j in range(n-1, -1, -1):
            ans[j] *= suffix
            suffix *= nums[j]

        return ans