# Combinations

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers `n` and `k`, return  *all possible combinations of*  `k`  *numbers chosen from the range*  `[1, n]`.

You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
Explanation: There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.

```

 **Example 2:** 

```
Input: n = 1, k = 1
Output: [[1]]
Explanation: There is 1 choose 1 = 1 total combination.

```

 

 **Constraints:** 

- 1 <= n <= 20
- 1 <= k <= n

## Solution

**Language:** Python  
**Runtime:** 135 ms (beats 20.20%)  
**Memory:** 61.4 MB (beats 57.83%)  
**Submitted:** 2026-11-05T13:40:43.277Z  

```py
class Solution:

    def solve(self, idx , n, k, ans, curr):

        if len(curr) == k:
            ans.append(curr[:])
            return 

        for i in range(idx,n+1):
            curr.append(i)
            self.solve(i+1,n,k,ans,curr)
            curr.pop(len(curr)-1)

    def combine(self, n: int, k: int) -> list[list[int]]:
        
        ans = []
        curr = []

        self.solve(1, n, k, ans, curr)

        return ans
```

---

[View on LeetCode](https://leetcode.com/problems/combinations/)