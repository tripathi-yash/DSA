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

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T05:30:08.002Z  

```java
class Solution {
    
    public void arrSort(int arr[], int l, int mid, int r){
        
        int[] auxArr = new int[r-l+1];
        int i=l , j = mid+1, k=0;
    
        while(i <= mid && j <= r){
            if(arr[i] < arr[j]){
                auxArr[k] = arr[i++];
            }
            else auxArr[k] = arr[j++];
            k++;
        }
        
        while(i<=mid) auxArr[k++] = arr[i++];
        while(j<=r) auxArr[k++] = arr[j++];
        
        for(int x=0; x<auxArr.length; x++){
            arr[l+x] = auxArr[x];
        }
    }
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) return;
        
        int mid = l + (r - l) / 2;
        
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        
        arrSort(arr, l, mid, r);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-sort/1)