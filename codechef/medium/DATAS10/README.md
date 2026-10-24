# DATAS10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T14:42:46.559Z  

```sql
/* Write a query cross join the table 'student' and 'course' and check out all possible courses a student can opt. Output the table after cross join */

select student.St_Name , course.Course_Name
from student 
cross join 
course;
```

---

[View on CodeChef](https://www.codechef.com/problems/DATAS10)