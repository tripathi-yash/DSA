# Actors and Directors Who Cooperated At Least Three Times

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `ActorDirector`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| actor_id    | int     |
| director_id | int     |
| timestamp   | int     |
+-------------+---------+
timestamp is the primary key (column with unique values) for this table.

```

 

Write a solution to find all the pairs `(actor_id, director_id)` where the actor has cooperated with the director at least three times.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
ActorDirector table:
+-------------+-------------+-------------+
| actor_id    | director_id | timestamp   |
+-------------+-------------+-------------+
| 1           | 1           | 0           |
| 1           | 1           | 1           |
| 1           | 1           | 2           |
| 1           | 2           | 3           |
| 1           | 2           | 4           |
| 2           | 1           | 5           |
| 2           | 1           | 6           |
+-------------+-------------+-------------+
Output: 
+-------------+-------------+
| actor_id    | director_id |
+-------------+-------------+
| 1           | 1           |
+-------------+-------------+
Explanation: The only pair is (1, 1) where they cooperated exactly 3 times.

```

## Solution

**Language:** Python  
**Runtime:** 310 ms (beats 24.68%)  
**Memory:** 77 MB (beats 5.93%)  
**Submitted:** 2026-11-10T22:53:57.091Z  

```py
import pandas as pd

def actors_and_directors(actor_director: pd.DataFrame) -> pd.DataFrame:
    
    grouped = actor_director.groupby(['actor_id', 'director_id']).size().reset_index(name = 'count')

    ans = grouped[['actor_id','director_id']][grouped['count'] >= 3]

    return ans
```

---

[View on LeetCode](https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times/)