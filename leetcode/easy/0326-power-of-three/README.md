# Power of Three

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, return  *`true` if it is a power of three. Otherwise, return `false`*.

An integer `n` is a power of three, if there exists an integer `x` such that `n == 3x`.

 

 **Example 1:** 

```
Input: n = 27
Output: true
Explanation: 27 = 33

```

 **Example 2:** 

```
Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.

```

 **Example 3:** 

```
Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).

```

 

 **Constraints:** 

- -231 <= n <= 231 - 1

 

 **Follow up:**  Could you solve it without loops/recursion?

## Solution

**Language:** Python  
**Runtime:** 19 ms (beats 23.71%)  
**Memory:** 19.1 MB (beats 85.32%)  
**Submitted:** 2026-10-29T17:25:18.877Z  

```py
class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        
        return n > 0 and (pow(3,19) % n == 0)
```

---

[View on LeetCode](https://leetcode.com/problems/power-of-three/)