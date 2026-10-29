# Three Divisors

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, return `true` *if* `n` *has  **exactly three positive divisors**. Otherwise, return* `false`.

An integer `m` is a  **divisor**  of `n` if there exists an integer `k` such that `n = k * m`.

 

 **Example 1:** 

```
Input: n = 2
Output: false
Explantion: 2 has only two divisors: 1 and 2.

```

 **Example 2:** 

```
Input: n = 4
Output: true
Explantion: 4 has three divisors: 1, 2, and 4.

```

 

 **Constraints:** 

- 1 <= n <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.1 MB (beats 61.38%)  
**Submitted:** 2026-10-29T15:21:20.183Z  

```java
class Solution {
    public boolean isThree(int n) {
        
        int count = 0;

        for(int i=1; i*i<=n; i++){

            if((n % i == 0) && (i != (n/i))) count+=2;
            else if(n % i == 0)count++;
        }

        if(count == 3) return true;

        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/three-divisors/)