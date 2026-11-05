# Letter Combinations of a Phone Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string containing digits from `2-9` inclusive, return all possible letter combinations that the number could represent. Return the answer in  **any order**.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

 

 **Example 1:** 

```
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

```

 **Example 2:** 

```
Input: digits = "2"
Output: ["a","b","c"]

```

 

 **Constraints:** 

- 1 <= digits.length <= 4
- digits[i] is a digit in the range ['2', '9'].

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.3 MB (beats 69.24%)  
**Submitted:** 2026-11-05T12:12:18.622Z  

```java
class Solution {
    
    String[] phone = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public void solve(int index, String digits, List<String> ans, StringBuilder curr){
        
        if(index == digits.length()){
            String temp = curr.toString();
            ans.add(temp);
            return;
        }
        
        int j = digits.charAt(index) - '0';

        String sc = phone[j];

        for(int i=0; i<sc.length(); i++){
            curr.append(sc.charAt(i));
            solve(index+1, digits, ans, curr);

            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        
        List<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();

        solve(0,  digits, ans, curr);

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)