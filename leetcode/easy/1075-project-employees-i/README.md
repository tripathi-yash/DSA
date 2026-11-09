# Project Employees I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Project`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| project_id  | int     |
| employee_id | int     |
+-------------+---------+
(project_id, employee_id) is the primary key of this table.
employee_id is a foreign key to Employee table.
Each row of this table indicates that the employee with employee_id is working on the project with project_id.

```

 

Table: `Employee`

```
+------------------+---------+
| Column Name      | Type    |
+------------------+---------+
| employee_id      | int     |
| name             | varchar |
| experience_years | int     |
+------------------+---------+
employee_id is the primary key of this table. It's guaranteed that experience_years is not NULL.
Each row of this table contains information about one employee.

```

 

Write an SQL query that reports the  **average**  experience years of all the employees for each project,  **rounded to 2 digits**.

Return the result table in  **any order**.

The query result format is in the following example.

 

 **Example 1:** 

```
Input: 
Project table:
+-------------+-------------+
| project_id  | employee_id |
+-------------+-------------+
| 1           | 1           |
| 1           | 2           |
| 1           | 3           |
| 2           | 1           |
| 2           | 4           |
+-------------+-------------+
Employee table:
+-------------+--------+------------------+
| employee_id | name   | experience_years |
+-------------+--------+------------------+
| 1           | Khaled | 3                |
| 2           | Ali    | 2                |
| 3           | John   | 1                |
| 4           | Doe    | 2                |
+-------------+--------+------------------+
Output: 
+-------------+---------------+
| project_id  | average_years |
+-------------+---------------+
| 1           | 2.00          |
| 2           | 2.50          |
+-------------+---------------+
Explanation: The average experience years for the first project is (3 + 2 + 1) / 3 = 2.00 and for the second project is (3 + 2) / 2 = 2.50

```

## Solution

**Language:** Python  
**Runtime:** 266 ms (beats 94.22%)  
**Memory:** 68.4 MB (beats 65.33%)  
**Submitted:** 2026-11-09T13:49:39.461Z  

```py
import pandas as pd

def project_employees_i(project: pd.DataFrame, employee: pd.DataFrame) -> pd.DataFrame:
    
    merged = pd.merge(
        left = project,
        right = employee,
        on = "employee_id",
        how = "inner"
    )

    grouped = merged.groupby('project_id')['experience_years'].mean().reset_index()

    grouped = grouped.rename(columns = {"experience_years" : "average_years"})
    grouped["average_years"] = grouped["average_years"].round(2)

    return grouped
```

---

[View on LeetCode](https://leetcode.com/problems/project-employees-i/)