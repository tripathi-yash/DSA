# Number of Common Factors

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two positive integers `a` and `b`, return  *the number of  **common**  factors of* `a` *and* `b`.

An integer `x` is a  **common factor**  of `a` and `b` if `x` divides both `a` and `b`.

 

 **Example 1:** 

```
Input: a = 12, b = 6
Output: 4
Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.

```

 **Example 2:** 

```
Input: a = 25, b = 30
Output: 2
Explanation: The common factors of 25 and 30 are 1, 5.

```

 

 **Constraints:** 

- 1 <= a, b <= 1000

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 71.91%)  
**Memory:** 42 MB (beats 51.43%)  
**Submitted:** 2026-10-25T03:52:15.270Z  

```java
class Solution {
    public int commonFactors(int a, int b) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=1; i*i <= a; i++){
            
            if((a % i) == 0) {
                set.add(i);
                set.add(a/i);
            }
        }

        int cmnFact = 0;
        for(int i=1; i*i <= b; i++){

            if((b % i) == 0) {

                if(set.contains(i)) cmnFact++;
                if(i != (b/i) && set.contains(b/i)) cmnFact++;
            }
        }

        return cmnFact;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-common-factors/)