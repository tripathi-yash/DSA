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

**Language:** Java  
**Runtime:** 19 ms (beats 50.29%)  
**Memory:** 97.5 MB (beats 90.92%)  
**Submitted:** 2026-10-30T05:31:33.770Z  

```java
class Solution {

    public void solve(int idx, int n, int k, List<Integer> curr, List<List<Integer>> ans){
 
        if(curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=idx; i<=n; i++){
            curr.add(i);
            solve(i+1,n,k,curr,ans);
            curr.remove(curr.size()-1);
        }

    }
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>(); // final answer

        List<Integer> curr = new ArrayList<>(); // temp list to store combinations
        solve(1,n,k,curr,ans);

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/combinations/)