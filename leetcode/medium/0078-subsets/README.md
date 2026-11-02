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
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 19.3 MB (beats 59.67%)  
**Submitted:** 2026-11-02T23:16:49.605Z  

```py
class Solution:
    def subsets(self, nums: list[int]) -> list[list[int]]:
        
        ans = [[]]

        for num in nums:
            temp = []
            for curr in ans:
                temp.append([num] + curr)
            ans.extend(temp)
        
        return ans
```

---

[View on LeetCode](https://leetcode.com/problems/subsets/)