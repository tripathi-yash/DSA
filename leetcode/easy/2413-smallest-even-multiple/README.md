# Smallest Even Multiple

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a  **positive**  integer `n`, return  *the smallest positive integer that is a multiple of  **both*** `2` *and* `n`.

 

 **Example 1:** 

```
Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.

```

 **Example 2:** 

```
Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.

```

 

 **Constraints:** 

- 1 <= n <= 150

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.9 MB (beats 83.94%)  
**Submitted:** 2026-10-25T02:58:04.179Z  

```java
class Solution {

    public int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a%b);
    }
    public int smallestEvenMultiple(int n) {
        
        int gcd = gcd(n , 2);

        return (2 * n) / gcd;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-even-multiple/)