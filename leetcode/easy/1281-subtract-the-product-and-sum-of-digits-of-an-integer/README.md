# Subtract the Product and Sum of Digits of an Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer number `n`, return the difference between the product of its digits and the sum of its digits.

 

 **Example 1:** 

```
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2  *3*  4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

```

 **Example 2:** 

```
Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4  *4*  2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21

```

 

 **Constraints:** 

- 1 <= n <= 10^5

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.5 MB (beats 95.15%)  
**Submitted:** 2026-10-24T07:43:15.567Z  

```java
class Solution {
    public int subtractProductAndSum(int n) {
        
        int temp = n, sum = 0;
        long prod = 1;

        while(temp > 0){

            int dig = temp % 10;
            prod *= dig;
            sum += dig;
            temp /= 10;
        }

        return (int)(prod - sum);

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)