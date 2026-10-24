# PPSQL08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com

A company maintains information about its departments, including their names and locations, in a database.

The management wants to identify departments located in cities whose names begin with the letter `S`.

The database contains the following table:

 **Table: departments** 

department_id	department_name	location
1	Human Resources	New York
2	Research and Development	San Francisco
3	Sales	Los Angeles
4	Marketing	New York
5	Customer Support	Boston
6	Finance	Austin
7	IT Support	Seattle
8	Product Management	San Francisco
9	Quality Assurance	Los Angeles
10	Legal	Boston

 **Task** 

Write an SQL query to retrieve the departments located in cities whose names start with the letter `S`.

The query must:

- Return only the department_name and location columns.
- Include only departments whose location begins with S.
- Preserve the original department names and locations without modification.

 **Expected Output** 

department_name	location
Research and Development	San Francisco
IT Support	Seattle
Product Management	San Francisco

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T14:22:05.558Z  

```sql
-- your code goes here
select department_name, location
from departments
where location like "s%";
```

---

[View on CodeChef](https://www.codechef.com/problems/PPSQL08)