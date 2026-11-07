# Permutations

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array `nums` of distinct integers, return all the possible permutations. You can return the answer in  **any order**.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

```

 **Example 2:** 

```
Input: nums = [0,1]
Output: [[0,1],[1,0]]

```

 **Example 3:** 

```
Input: nums = [1]
Output: [[1]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 6
- -10 <= nums[i] <= 10
- All the integers of nums are unique.

## Solution

**Language:** Python  
**Runtime:** 1 ms (beats 53.88%)  
**Memory:** 19.5 MB (beats 59.21%)  
**Submitted:** 2026-11-07T07:03:07.278Z  

```py
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
```

---

[View on LeetCode](https://leetcode.com/problems/permutations/)