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

**Language:** Python  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 19.4 MB (beats 33.35%)  
**Submitted:** 2026-11-05T12:40:37.799Z  

```py
class Solution:

    phone = ["", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"]

    def solve(self,idx,digits,ans,curr):

        if not digits:
            return []

        if idx == len(digits):
            ans.append(curr)
            return

        j = ord(digits[idx]) - ord('0')

        temp = self.phone[j]

        for i in range(len(temp)):

            curr += temp[i]
            self.solve(idx+1,digits,ans,curr)
            curr = curr[:len(curr)-1]

    def letterCombinations(self, digits: str) -> list[str]:
        
        ans = []
        curr = ""

        self.solve(0,digits,ans,curr)

        return ans
```

---

[View on LeetCode](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)