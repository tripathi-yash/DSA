# Number of Good Pairs

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers `nums`, return  *the number of  **good pairs***.

A pair `(i, j)` is called  *good*  if `nums[i] == nums[j]` and `i` < `j`.

 

 **Example 1:** 

```
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

```

 **Example 2:** 

```
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.

```

 **Example 3:** 

```
Input: nums = [1,2,3]
Output: 0

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 84.38%)  
**Memory:** 42.3 MB (beats 95.07%)  
**Submitted:** 2026-10-24T04:25:16.994Z  

```java
class Solution {
    public int numIdenticalPairs(int[] nums) {

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        for(int freq : map.values()){
            count += (freq * (freq-1)) / 2;
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-good-pairs/)