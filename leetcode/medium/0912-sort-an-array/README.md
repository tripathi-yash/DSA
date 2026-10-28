# Sort an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums`, sort the array in ascending order and return it.

You must solve the problem  **without using any built-in**  functions in `O(nlog(n))` time complexity and with the smallest space complexity possible.

 

 **Example 1:** 

```
Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

```

 **Example 2:** 

```
Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessarily unique.

```

 

 **Constraints:** 

- 1 <= nums.length <= 5 * 104
- -5  *104 <= nums[i] <= 5*  104

## Solution

**Language:** Java  
**Runtime:** 28 ms (beats 39.90%)  
**Memory:** 86 MB (beats 60.09%)  
**Submitted:** 2026-10-28T04:46:34.716Z  

```java
class Solution {

    public void merge(int[] arr, int left, int mid, int right){

        int i=left, j= mid+1, k=0;
        int[] aux = new int[right - left + 1];

        while(i <= mid && j <= right){

            if(arr[i] <= arr[j]){
                aux[k++] = arr[i++];
            }
            else aux[k++] = arr[j++];
        }

        while(i <= mid) aux[k++] = arr[i++];
        while(j <= right) aux[k++] = arr[j++];

        for(int idx=left; idx<=right; idx++){
            arr[idx] = aux[idx-left];
        }
    }

    public void mergeSort(int[] arr,int left,int right){

        if(left >= right ) return;

        int mid = left + (right-left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }

    public int[] sortArray(int[] nums) {
        
        mergeSort(nums, 0, nums.length-1);

        return nums;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-an-array/)