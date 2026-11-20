# Modular Exponentiation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given three integers  **x**,  **n**, and  **M**, compute (x^n) % M, i.e., the remainder when  **x**  raised to the power  **n**  is divided by  **M**.

 **Examples:** 

```
Input: x = 3, n = 2, M = 4
Output: 1
Explanation: 32 % 4 = 9 % 4 = 1.

```

```
Input: x = 2, n = 6, M = 10
Output: 4
Explanation: 26 % 10 = 64 % 10 = 4.
```

 **Constraints:** 
1 ≤ x, n, M ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T17:57:05.812Z  

```java
class Solution {

    public long power(long x, int e, int M) {

        if(e == 0) return 1;

        x = x % M;

        long p = power(x, e / 2, M);

        p = (p * p) % M;

        if(e % 2 == 1) {
            p = (p * x) % M;
        }

        return p;
    }

    public int powMod(int x, int n, int M) {

        return (int)power(x, n, M);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/modular-exponentiation-for-large-numbers5537/1)