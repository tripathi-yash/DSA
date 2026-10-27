# Binary Search

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a sorted array  **arr[]**  of distinct integers and an integer  **k**, return the 0-based index of k if it is present in the array. Otherwise, return -1.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 6], k = 6
Output: 4
Explanation: 6 is present at index 4.
```

```
Input: arr[] = [1, 2, 4, 5, 6], k = 3
Output: -1
Explanation: 3 is not present in the array.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T04:35:08.399Z  

```java
class Solution {
    
    public int helper(int[] arr, int target,int left, int right){
        
        if(right < left) return -1;
        
        int mid = left + (right -left) / 2;
        
        if(arr[mid] == target) return mid;
        
        if(arr[mid] > target) return helper(arr, target, left, mid -1);
        
        else return helper(arr, target, mid+1 , right);
        
    }
    
    public int binarySearch(int[] arr, int k) {
        // code here
        
        int ans = helper(arr, k , 0 , arr.length-1);
        
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1)