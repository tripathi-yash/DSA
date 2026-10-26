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

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T09:56:01.973Z  

```java
class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if( low < high){
            
            int pivot = partition(arr, low, high); 
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        
        int pivot = arr[high];
        int i = low-1;
        
        for(int j=low; j<high; j++){
            
            if(arr[j] <= pivot) {
                
               i += 1;
               int temp = arr[j];
               arr[j] = arr[i];
               arr[i] = temp;
            }
        }
        
        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        
        return i+1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/quick-sort/1)