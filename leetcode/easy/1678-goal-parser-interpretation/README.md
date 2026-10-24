# Goal Parser Interpretation

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You own a  **Goal Parser**  that can interpret a string `command`. The `command` consists of an alphabet of `"G"`, `"()"` and/or `"(al)"` in some order. The Goal Parser will interpret `"G"` as the string `"G"`, `"()"` as the string `"o"`, and `"(al)"` as the string `"al"`. The interpreted strings are then concatenated in the original order.

Given the string `command`, return  *the  **Goal Parser** 's interpretation of* `command`.

 

 **Example 1:** 

```
Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".

```

 **Example 2:** 

```
Input: command = "G()()()()(al)"
Output: "Gooooal"

```

 **Example 3:** 

```
Input: command = "(al)G(al)()()G"
Output: "alGalooG"

```

 

 **Constraints:** 

- 1 <= command.length <= 100
- command consists of "G", "()", and/or "(al)" in some order.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 77.55%)  
**Memory:** 42.2 MB (beats 98.37%)  
**Submitted:** 2026-10-24T06:29:01.373Z  

```java
class Solution {
    public String interpret(String command) {
        
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<command.length(); i++){
            
            char ch = command.charAt(i);
            // char chNext = command.charAt(i+1);

            if(ch == '(' && command.charAt(i+1) == ')'){
                sb.append('o');
                i += 1;
            }  
            else if(ch == '(' && command.charAt(i+1) == 'a'){
                sb.append("al");
                i += 3;
            }
            else sb.append(ch);

        }

        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/goal-parser-interpretation/)