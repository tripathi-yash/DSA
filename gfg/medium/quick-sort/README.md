# Quick Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array arr[], with starting index low and ending index high, complete the functions partition() and quickSort() so that the array becomes sorted in ascending order.

 **Examples:** 

```
Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: After sorting, all elements are arranged in ascending order.
```

```
Input: arr[] = [2, 1, 6, 10, 4, 1, 3, 9, 7]
Output: [1, 1, 2, 3, 4, 6, 7, 9, 10]
Explanation: Duplicate elements (1) are retained in sorted order.
```

```
Input: arr[] = [5, 5, 5, 5]
Output: [5, 5, 5, 5]
Explanation: All elements are identical, so the array remains unchanged.
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T02:20:42.178Z  

```py
class Solution:
    def quickSort(self, arr, low, high):
        # code here
        
        if(low < high):
            
            pivot = self.partition(arr,low,high)
            
            self.quickSort(arr,low,pivot-1)
            self.quickSort(arr,pivot+1,high)

    def partition(self, arr, low, high):
        # code here
        pivot = arr[high]
        
        i = low-1
        
        for j in range(low,high):
            
            if(arr[j] < pivot):
                i += 1
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
                
        temp = arr[i+1]
        arr[i+1] = arr[high]
        arr[high] = temp
        
        return i+1
        
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/quick-sort/1)