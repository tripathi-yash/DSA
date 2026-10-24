# PPSQL07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com

A university maintains student information and available courses in two separate tables: `student` and `course`.

The university wants to generate a report showing every possible course that each student can choose, regardless of their current enrollment.

The database contains the following tables:

 **Table 1: student** 

Column	Description
`St_id`	Unique student identifier
`St_Name`	Name of the student
`Department`	Department of the student
`Course_id`	Course identifier associated with the student

 **Table 2: course** 

Column	Description
`Course_id`	Unique course identifier
`Course_Name`	Name of the course
`Credits`	Number of course credits
`Prof_id`	Identifier of the professor teaching the course

 **Task** 

Write an SQL query using `CROSS JOIN` to generate all possible combinations of students and available courses.

The query must:

- Include every student with every course, regardless of the student's existing enrollment.
- Return exactly two columns: St_Name and Course_Name.
- Include each student-course combination exactly once, assuming student IDs and course IDs are unique.

 **Expected Output** 

St_Name	Course_Name
John Smith	Introduction to Computer Science
John Smith	World History II
John Smith	Linear Algebra
John Smith	Advanced Writing
John Smith	Principles of Bio-technology
Emily Brown	Introduction to Computer Science
Emily Brown	World History II
Emily Brown	Linear Algebra
Emily Brown	Advanced Writing
Emily Brown	Principles of Bio-technology
David Lee	Introduction to Computer Science
David Lee	World History II
David Lee	Linear Algebra
David Lee	Advanced Writing
David Lee	Principles of Bio-technology
Sarah Johnson	Introduction to Computer Science
Sarah Johnson	World History II
Sarah Johnson	Linear Algebra
Sarah Johnson	Advanced Writing
Sarah Johnson	Principles of Bio-technology
Michael Chen	Introduction to Computer Science
Michael Chen	World History II
Michael Chen	Linear Algebra
Michael Chen	Advanced Writing
Michael Chen	Principles of Bio-technology

 **Note:**  The tables are already created and populated. Write only the SQL query. The order of the returned rows is not significant.

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T14:42:43.642Z  

```sql
/* Write a query cross join the table 'student' and 'course' and check out all possible courses a student can opt. Output the table after cross join */

select student.St_Name , course.Course_Name
from student 
cross join 
course;
```

---

[View on CodeChef](https://www.codechef.com/problems/PPSQL07)