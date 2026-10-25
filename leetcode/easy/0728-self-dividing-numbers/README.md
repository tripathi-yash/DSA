# Self Dividing Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **self-dividing number**  is a number that is divisible by every digit it contains.

- For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

A  **self-dividing number**  is not allowed to contain the digit zero.

Given two integers `left` and `right`, return  *a list of all the  **self-dividing numbers**  in the range*  `[left, right]` (both  **inclusive**).

 

 **Example 1:** 

```
Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

```

 **Example 2:** 

```
Input: left = 47, right = 85
Output: [48,55,66,77]

```

 

 **Constraints:** 

- 1 <= left <= right <= 104

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 98.59%)  
**Memory:** 42.2 MB (beats 88.31%)  
**Submitted:** 2026-10-25T04:23:08.450Z  

```java
class Solution {

    private boolean isselfDividing(int num){
        
        int temp = num;

        while(temp != 0){

            int lstDig = temp % 10;
            if(lstDig == 0 || num % lstDig != 0) return false;
            temp /= 10;
        }

        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> ansNumbers = new ArrayList<>();

        for(int i=left; i<=right; i++){

            if(isselfDividing(i)) ansNumbers.add(i);
        }

        return ansNumbers;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/self-dividing-numbers/)