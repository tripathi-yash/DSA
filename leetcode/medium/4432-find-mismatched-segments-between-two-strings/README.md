# Q1. Find Mismatched Segments Between Two Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two strings `s1` and `s2` of the same length.

A  **mismatched segment**  is a  **maximal contiguous**  range of indices where the characters of `s1` and `s2` differ at every index.

Return a 2D array containing `[sub1, sub2]` for each mismatched segment, where `sub1` and `sub2` are the corresponding  **substrings**  from `s1` and `s2`, respectively. Return the segments in  **increasing**  order of their starting indices. If there are no mismatched segments, return an empty array.

A  **substring**  is a contiguous  **non-empty**  sequence of characters within a string.

 

 **Example 1:** 

 **Input:**  s1 = "earth", s2 = "empty"

 **Output:**  [["ar","mp"],["h","y"]]

 **Explanation:** 

- The characters at indices 1 and 2 differ, forming the mismatched segment ["ar","mp"].
- The characters at index 4 differ, forming the mismatched segment ["h","y"].

 **Example 2:** 

 **Input:**  s1 = "action", s2 = "nation"

 **Output:**  [["ac","na"]]

 **Explanation:** 

The characters at indices 0 and 1 differ, forming the mismatched segment `["ac","na"]`. All remaining characters are equal in both strings.

 **Example 3:** 

 **Input:**  s1 = "hot", s2 = "hot"

 **Output:**  []

 **Explanation:** 

The two strings are identical, so there are no mismatched segments.

 

 **Constraints:** 

- 1 <= s1.length == s2.length <= 100
- s1 and s2 consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 33.40%)  
**Memory:** 46.2 MB (beats 72.75%)  
**Submitted:** 2026-11-08T04:07:20.181Z  

```java
class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {

        List<List<String>> ans = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(int i=0; i<s1.length(); i++){

            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);


            if(ch1 != ch2) {

                sb1.append(ch1);
                sb2.append(ch2);
            }
            else{

                if(sb1.length() > 0){
                    
                    List<String> curr = new ArrayList<>(2);
    
                    curr.add(sb1.toString());
                    curr.add(sb2.toString());
                    ans.add(curr);

                    sb1.setLength(0);
                    sb2.setLength(0);
                } 
            }
        }

        if(sb1.length() > 0){        
            List<String> curr = new ArrayList<>(2);
    
            curr.add(sb1.toString());
            curr.add(sb2.toString());
            ans.add(curr);
    
            sb1.setLength(0);
            sb2.setLength(0);
        }
        
    return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-mismatched-segments-between-two-strings/)