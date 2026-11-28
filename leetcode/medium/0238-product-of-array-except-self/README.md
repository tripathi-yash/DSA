# Product of Array Except Self

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, return  *an array*  `answer`  *such that*  `answer[i]`  *is equal to the product of all the elements of*  `nums`  *except*  `nums[i]`.

The product of any prefix or suffix of `nums` is  **guaranteed**  to fit in a  **32-bit**  integer.

You must write an algorithm that runs in `O(n)` time and without using the division operation.

 

Original
Python
 **Example 1:** 

```
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

```

 **Example 2:** 

```
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

```

 

 **Constraints:** 

- 2 <= nums.length <= 105
- -30 <= nums[i] <= 30
- The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

 

 **Follow up:**  Can you solve the problem in `O(1)` extra space complexity? (The output array  **does not**  count as extra space for space complexity analysis.)

## Solution

**Language:** Python  
**Runtime:** 30 ms (beats 77.89%)  
**Memory:** 20.1 MB (beats 55.10%)  
**Submitted:** 2026-11-28T06:46:47.937Z  

```py
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
```

---

[View on LeetCode](https://leetcode.com/problems/product-of-array-except-self/)