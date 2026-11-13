# Self Dividing Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **self-dividing number**  is a number that is divisible by every digit it contains.

- For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

A  **self-dividing number**  is not allowed to contain the digit zero.

Given two integers `left` and `right`, return  *a list of all the  **self-dividing numbers**  in the range*  `[left, right]` (both  **inclusive**).

 

Original
Python3
 **Example 1:** 

```
Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

```

 **Example 2:** 

```
Input: left = 47, right = 85
Output: [48,55,66,77]

```

 

 **Constraints:** 

- 1 <= left <= right <= 104

## Solution

**Language:** Python  
**Runtime:** 4 ms (beats 77.65%)  
**Memory:** 19.1 MB (beats 95.54%)  
**Submitted:** 2026-11-13T17:53:56.910Z  

```py
class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> list[int]:
        
        ans = []

        for i in range(left, right+1):
            temp = i

            isSelfDiv = True
            while(temp != 0):
                rem = temp % 10

                if((rem != 0) and ((i % rem) == 0) ):
                    temp //= 10
                    
                else:
                    isSelfDiv = False
                    break

            if(isSelfDiv):
                ans.append(i)

        return ans

```

---

[View on LeetCode](https://leetcode.com/problems/self-dividing-numbers/)