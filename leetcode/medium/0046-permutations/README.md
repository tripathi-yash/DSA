# Permutations

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array `nums` of distinct integers, return all the possible permutations. You can return the answer in  **any order**.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

```

 **Example 2:** 

```
Input: nums = [0,1]
Output: [[0,1],[1,0]]

```

 **Example 3:** 

```
Input: nums = [1]
Output: [[1]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 6
- -10 <= nums[i] <= 10
- All the integers of nums are unique.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 40.75%)  
**Memory:** 45.1 MB (beats 86.34%)  
**Submitted:** 2026-10-30T06:36:33.701Z  

```java
class Solution {

    public void solve(int idx, int[] nums, List<Integer> curr, List<List<Integer>> ans, boolean[] isPresent){

        if(idx == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(isPresent[nums[i]+10]) continue;
            isPresent[nums[i]+10] = true;
            curr.add(nums[i]);

            solve(idx+1, nums,curr, ans, isPresent);
            curr.remove(curr.size()-1);
            isPresent[nums[i]+10] = false;
            
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] isPresent = new boolean[21];

        solve(0,nums, curr, ans, isPresent);
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/permutations/)