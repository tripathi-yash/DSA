# LPYAS100B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com

Write a program to create a shopping list of `5` items and check if a given item exists in the list or not.

### Input Format
- The first line of input contains five space separated strings - the items of the shopping list.
- Next line contains a single string - the item which we need to check.
### Output Format
- Print on a single line YES if given item exists in the list, else print NO.
### Sample 1:
Input
Output

```
ToothBrush Pen NoteBook Pencil Chess
Ludo
```

```
NO
```

### Explanation:

Since the item `Ludo` doesn't exist in the shopping list, the output is  **NO**.

### Sample 2:
Input
Output

```
ToothBrush Pen NoteBook Pencil Chess
Pen
```

```
YES
```

### Explanation:

Since the item `Pen` exists in the shopping list, the output is  **YES**.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T15:29:28.170Z  

```py
# Write your code below

shopping_list = input().split(" ")
    
to_find = input()

if to_find in shopping_list:
    print("Yes")
else:
    print("No")
```

---

[View on CodeChef](https://www.codechef.com/problems/LPYAS100B)