# Subsets

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of  **unique**  elements, return  *all possible*   *subsets*   *(the power set)*.

The solution set  **must not**  contain duplicate subsets. Return the solution in  **any order**.

 

Original
Python
 **Example 1:** 

```
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [[],[0]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10
- All the numbers of nums are unique.

## Solution

**Language:** Python  
**Runtime:** 1 ms (beats 24.08%)  
**Memory:** 12.3 MB (beats 95.56%)  
**Submitted:** 2026-11-20T20:27:55.434Z  

```py
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
        
```

---

[View on LeetCode](https://leetcode.com/problems/subsets/)