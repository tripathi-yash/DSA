# Ugly Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

An  **ugly number**  is a  *positive*  integer which does not have a prime factor other than 2, 3, and 5.

Given an integer `n`, return `true`  *if*  `n`  *is an  **ugly number***.

 

 **Example 1:** 

```
Input: n = 6
Output: true
Explanation: 6 = 2 × 3

```

 **Example 2:** 

```
Input: n = 1
Output: true
Explanation: 1 has no prime factors.

```

 **Example 3:** 

```
Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.

```

 

 **Constraints:** 

- -231 <= n <= 231 - 1

## Solution

**Language:** Python  
**Runtime:** 0 ms  
**Memory:** 19.2 MB  
**Submitted:** 2026-10-29T15:51:49.044Z  

```py
class Solution:
    def isUgly(self, n: int) -> bool:
        
        if(n <= 0):
            return False

        i = 2

        while( i*i <= n):

            if((n%i) == 0 and ((n // i) % 2 != 0 )):
                if(i not in [2,3,5] or n // i not in [2,3,5]):
                   return False
            
            i += 1

        return True

  
```

---

[View on LeetCode](https://leetcode.com/problems/ugly-number/)