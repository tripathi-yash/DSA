# LPYAS150B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com

Write a program that accepts the count of test cases t, then for each test case, reads a string `s`, checks if it's a palindrome or not using the `check_palindrome` function, and outputs "YES" if `s` is palindrome, else "NO".

 **Note** : A string is palindrome if that reads the same backward or forward. For example string  **level**  is a palindrome.

### Sample 1:
Input
Output

```
3
amma
naman
hello
```

```
YES
YES
NO
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T15:37:08.471Z  

```py
def check_palindrome(s):
    # Complete the function
    
    start = 0
    end = len(s)-1
    
    while(start < end):
        
        if(s[start] != s[end]):
            return False
            
        start += 1
        end -= 1
    
    return True

def main():
    test_cases = int(input())
    # Complete the function
    
    while(test_cases > 0):
        
        s = input()
        
        if check_palindrome(s):
            print("Yes")
        else:
            print("No")
        
        test_cases -= 1

if __name__ == "__main__":
    main()
```

---

[View on CodeChef](https://www.codechef.com/problems/LPYAS150B)