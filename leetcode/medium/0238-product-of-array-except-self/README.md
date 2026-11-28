# Product of Array Except Self

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, return  *an array*  `answer`  *such that*  `answer[i]`  *is equal to the product of all the elements of*  `nums`  *except*  `nums[i]`.

The product of any prefix or suffix of `nums` is  **guaranteed**  to fit in a  **32-bit**  integer.

You must write an algorithm that runs in `O(n)` time and without using the division operation.

 

Original
Python3
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
**Runtime:** 47 ms (beats 8.93%)  
**Memory:** 26.6 MB (beats 34.62%)  
**Submitted:** 2026-11-28T05:54:55.940Z  

```py
class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        
        n = len(nums)
        prefix = [1] * n
        suffix = [1] * n

        prefix[0] = nums[0]
        suffix[n-1] = nums[n-1]

        for i in range(1,n):

            prefix[i] = prefix[i-1] * nums[i]
            suffix[n-i-1] = suffix[n-i] *  nums[n-i-1]

        ans = [1] * n
        ans[0] = suffix[1]
        ans[n-1] = prefix[n-2]

        for i in range(1, n-1):

            ans[i] = prefix[i-1] * suffix[i+1]

        return ans
```

---

[View on LeetCode](https://leetcode.com/problems/product-of-array-except-self/)