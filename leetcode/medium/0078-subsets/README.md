# Subsets

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of  **unique**  elements, return  *all possible*   *subsets*   *(the power set)*.

The solution set  **must not**  contain duplicate subsets. Return the solution in  **any order**.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [[],[0]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10
- All the numbers of nums are unique.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 88.63%)  
**Memory:** 43.8 MB (beats 92.17%)  
**Submitted:** 2026-10-23T05:42:04.806Z  

```java
class Solution {

    public void solver(int[] nums, int i, List<List<Integer>> ans, List<Integer> subset){

        if(i == nums.length) {
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        solver(nums, i+1, ans, subset);
        subset.remove(subset.size()-1);
        solver(nums, i+1, ans, subset);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        solver(nums, 0, ans, subset);
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subsets/)