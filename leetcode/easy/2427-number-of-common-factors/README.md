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
**Memory:** 41.5 MB (beats 93.35%)  
**Submitted:** 2026-10-25T03:40:28.775Z  

```java
class Solution {
    public int commonFactors(int a, int b) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=1; i*i <= a; i++){
            
            if((a % i) == 0) {
                map.put(i, map.getOrDefault(i,0) + 1);
                if (i != (a/i))
                map.put((a/i), map.getOrDefault((a/i),0) + 1);
            }
        }

        for(int i=1; i*i <= b; i++){
            if((b % i) == 0) {
                map.put(i, map.getOrDefault(i,0) + 1);
                if (i != (b/i))
                map.put((b/i), map.getOrDefault((b/i),0) + 1);
            }
        }

        int cmnFact = 0;
        for(int val : map.values()){
            if (val > 1) cmnFact++;
        }

        return cmnFact;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-common-factors/)