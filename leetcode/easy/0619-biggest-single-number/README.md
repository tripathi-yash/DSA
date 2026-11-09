# Biggest Single Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `MyNumbers`

```
+-------------+------+
| Column Name | Type |
+-------------+------+
| num         | int  |
+-------------+------+
This table may contain duplicates (In other words, there is no primary key for this table in SQL).
Each row of this table contains an integer.

```

 

A  **single number**  is a number that appeared only once in the `MyNumbers` table.

Find the largest  **single number**. If there is no  **single number**, report `null`.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
MyNumbers table:
+-----+
| num |
+-----+
| 8   |
| 8   |
| 3   |
| 3   |
| 1   |
| 4   |
| 5   |
| 6   |
+-----+
Output: 
+-----+
| num |
+-----+
| 6   |
+-----+
Explanation: The single numbers are 1, 4, 5, and 6.
Since 6 is the largest single number, we return it.

```

 **Example 2:** 

```
Input: 
MyNumbers table:
+-----+
| num |
+-----+
| 8   |
| 8   |
| 7   |
| 7   |
| 3   |
| 3   |
| 3   |
+-----+
Output: 
+------+
| num  |
+------+
| null |
+------+
Explanation: There are no single numbers in the input table so we return null.

```

## Solution

**Language:** Python  
**Runtime:** 277 ms (beats 64.72%)  
**Memory:** 66.2 MB (beats 80.60%)  
**Submitted:** 2026-11-09T13:20:51.419Z  

```py
import pandas as pd

def biggest_single_number(my_numbers: pd.DataFrame) -> pd.DataFrame:
    my_numbers = my_numbers.drop_duplicates(keep=False)

    max_ = my_numbers.max()

    return pd.DataFrame({"num" : max_})

    

```

---

[View on LeetCode](https://leetcode.com/problems/biggest-single-number/)