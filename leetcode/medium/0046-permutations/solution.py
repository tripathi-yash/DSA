class Solution:

    def solve(self, idx, nums, curr, ans, freq):

        if(idx == len(nums)):
            ans.append(list(curr))
            return

        for i in range(len(nums)):

            if(freq[nums[i]+10]):
                continue
            freq[nums[i]+10] = True
            curr.append(nums[i])

            self.solve(idx+1,nums,curr,ans,freq)

            freq[nums[i]+10] = False
            curr.pop(len(curr)-1)

    def permute(self, nums: list[int]) -> list[list[int]]:
        
        curr = []
        ans = []
        freq = [False] * 21

        self.solve(0,nums,curr,ans,freq)

        return ans