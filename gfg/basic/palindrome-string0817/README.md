# Palindrome String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, find if it is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.

 **Examples :** 

```
Input: s = "abba"
Output: true
Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
```

```
Input: s = "abc" 
Output: false
Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T04:31:09.805Z  

```java
class Solution {
    boolean solver(String s,int l,int r){
        
        if(l >= r) return true;
        
        if(s.charAt(l) != s.charAt(r)) return false;
        
        return solver(s, ++l,--r);
    }
    
    boolean isPalindrome(String s) {
        // code here
        
        return solver(s, 0, s.length()-1);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/palindrome-string0817/1)