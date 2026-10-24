# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `x`, return `true` if `x` is a  **palindrome**, and `false` otherwise.

 

 **Example 1:** 

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

```

 **Example 2:** 

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

```

 **Example 3:** 

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

 

 **Follow up:**  Could you solve it without converting the integer to a string?

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 14.34%)  
**Memory:** 45.6 MB (beats 85.96%)  
**Submitted:** 2026-10-24T07:33:07.158Z  

```java
class Solution {
    public boolean isPalindrome(int x) {

        // String orig = Integer.toString(x);
        
        // StringBuilder sb = new StringBuilder(orig).reverse();

        // return (sb.toString().equals(orig)); 
        long ans = 0;
        int temp = x;
        
        while(temp != 0){
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp /= 10;
        }        

        if (x < 0) return false;     
        return ans == x;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-number/)