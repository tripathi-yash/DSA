# Fibonacci Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

The  **Fibonacci numbers**, commonly denoted `F(n)` form a sequence, called the  **Fibonacci sequence**, such that each number is the sum of the two preceding ones, starting from `0` and `1`. That is,

```
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.

```

Given `n`, calculate `F(n)`.

 

 **Example 1:** 

```
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

```

 **Example 2:** 

```
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

```

 **Example 3:** 

```
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

```

 

 **Constraints:** 

- 0 <= n <= 30

## Solution

**Language:** Python  
**Runtime:** 52 ms (beats 42.82%)  
**Memory:** 19 MB (beats 82.17%)  
**Submitted:** 2026-10-29T16:50:13.922Z  

```py
class Solution:
    def fib(self, n: int) -> int:
        
        first = i = 0
        sec = 1
        nectTerm = 0

        while(i < n):
           
           nextTerm = first + sec
           first = sec
           sec = nextTerm

           i += 1

        return first


```

---

[View on LeetCode](https://leetcode.com/problems/fibonacci-number/)