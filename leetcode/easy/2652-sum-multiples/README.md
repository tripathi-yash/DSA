# Sum Multiples

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer `n`, find the sum of all integers in the range `[1, n]`  **inclusive**  that are divisible by `3`, `5`, or `7`.

Return  *an integer denoting the sum of all numbers in the given range satisfying the constraint.* 

 

 **Example 1:** 

```
Input: n = 7
Output: 21
Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.

```

 **Example 2:** 

```
Input: n = 10
Output: 40
Explanation: Numbers in the range [1, 10] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9, 10. The sum of these numbers is 40.

```

 **Example 3:** 

```
Input: n = 9
Output: 30
Explanation: Numbers in the range [1, 9] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9. The sum of these numbers is 30.

```

 

 **Constraints:** 

- 1 <= n <= 103

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 10.30%)  
**Memory:** 42.1 MB (beats 87.11%)  
**Submitted:** 2026-10-31T11:17:09.852Z  

```java
class Solution {
    public int sumOfMultiples(int n) {
        
        int sum =0;

        while(n > 0){
            
            if(n % 3 == 0) sum += n;
            else if(n % 5 == 0) sum += n;
            else if(n % 7 == 0) sum += n;

            n--;
        }

        return sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-multiples/)