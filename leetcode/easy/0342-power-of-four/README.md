# Power of Four

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, return  *`true` if it is a power of four. Otherwise, return `false`*.

An integer `n` is a power of four, if there exists an integer `x` such that `n == 4x`.

 

 **Example 1:** 

```
Input: n = 16
Output: true

```

 **Example 2:** 

```
Input: n = 5
Output: false

```

 **Example 3:** 

```
Input: n = 1
Output: true

```

 

 **Constraints:** 

- -231 <= n <= 231 - 1

 

 **Follow up:**  Could you solve it without loops/recursion?

## Solution

**Language:** JavaScript  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 56.8 MB (beats 28.72%)  
**Submitted:** 2026-10-31T11:07:45.094Z  

```js
/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfFour = function(n) {
    
    if(n <= 0) return false;

    while(n > 1){
        
        if(n % 4 != 0) return false;

        n /= 4; 
    }

    return true;
};
```

---

[View on LeetCode](https://leetcode.com/problems/power-of-four/)