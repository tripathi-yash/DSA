# Subsets

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of  **unique**  elements, return  *all possible*   *subsets*   *(the power set)*.

The solution set  **must not**  contain duplicate subsets. Return the solution in  **any order**.

 

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
**Runtime:** 0 ms  
**Memory:** 19.4 MB  
**Submitted:** 2026-11-02T22:59:35.659Z  

```py
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
```

---

[View on LeetCode](https://leetcode.com/problems/subsets/)