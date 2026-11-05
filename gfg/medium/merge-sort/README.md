# Merge Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.

 **Examples:** 

```
Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: We get the sorted array after using merge sort

```

```
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: We get the sorted array after using merge sort 
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T17:21:26.327Z  

```py
class Solution:
    
    def mergeArr(self,arr, l, mid, r): 
        n = r-l+1
        temp = [0]*n
        i = l
        j = mid+1
        k = 0
        
        while(i<=mid and j<=r):
            
            if(arr[i] < arr[j]):
                temp[k] = arr[i]
                i+=1
            else:
                temp[k] = arr[j]
                j+=1
            k+=1
            
        while(i<=mid):
            temp[k] = arr[i]
            i+=1
            k+=1
            
        while(j<=r):
            temp[k] = arr[j]
            j+=1
            k+=1
            
        for x in range(n):
            arr[x+l] = temp[x]
        
            
    def mergeSort(self, arr, l, r):
        # code here
        
        if(l>=r): 
            return
        
        mid = l + (r-l)//2
        
        self.mergeSort(arr, l, mid)
        self.mergeSort(arr, mid+1, r)
        
        self.mergeArr(arr,l,mid,r)
        
        
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-sort/1)