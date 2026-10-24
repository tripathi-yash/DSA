# Defanging an IP Address

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a valid (IPv4) IP `address`, return a defanged version of that IP address.

A  *defanged IP address*  replaces every period `"."` with `"[.]"`.

 

 **Example 1:** 

```
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

```

 **Example 2:** 

```
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

```

 

 **Constraints:** 

- The given address is a valid IPv4 address.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.2 MB (beats 98.02%)  
**Submitted:** 2026-10-24T06:09:09.638Z  

```java
 class Solution {
    public String defangIPaddr(String address) {
        
        // String[] arr = address.split("\\.");
        // return String.join("[.]", arr);

        char[] chArr = new char[(address.length() + (3 * 2))];
        int pointer = 0;
        
        for(int i=0; i<address.length(); i++){
            
            char ch = address.charAt(i);

            if(ch == '.'){

                chArr[pointer++] = '[';
                chArr[pointer++] = '.';
                chArr[pointer++] = ']';
            }
            else chArr[pointer++] = ch;
        }

        return new String(chArr);

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/defanging-an-ip-address/)