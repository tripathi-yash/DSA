# PPSQL06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com yash_kode devbrath.official@gmail.com

A university maintains student enrollment information and course details in two separate tables: `student` and `course`.

The university needs a consolidated report containing all student and course records, including students who are enrolled in courses that have no corresponding entry in the course table and courses that have no enrolled students.

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

Write an SQL query using `FULL OUTER JOIN` to combine the `student` and `course` tables based on their `Course_id` columns.

The query must:

- Include all matching student and course records.
- Include students whose Course_id has no matching record in the course table.
- Include courses that have no matching record in the student table.
- Display NULL for columns belonging to a table when no matching record exists.
- Return all columns from student, followed by all columns from course, preserving both Course_id columns.

 **Expected Output** 

St_id	St_Name	Department	Course_id	Course_id	Course_Name	Credits	Prof_id
1001	John Smith	Computer Science	CS101	CS101	Introduction to Computer Science	3	2001
1002	Emily Brown	History	HIS102	HIS102	World History II	3	2004
1003	David Lee	Mathematics	MAT202	MAT202	Linear Algebra	2	2002
1004	Sarah Johnson	English	ENG201	ENG201	Advanced Writing	4	2003
1005	Michael Chen	Biology	BIO103	NULL	NULL	NULL	NULL
NULL	NULL	NULL	NULL	BIO104	Principles of Bio-technology	4	2006

 **Note:**  The tables are already created and populated. Write only the SQL query. The order of the returned rows is not significant.

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T14:34:52.631Z  

```sql
-- Write a query to do the following:

-- FULL OUTER JOIN the 'student' and 'course' tables using 'Course_id' to match the tables. Output the joined table.
select * from student s
full outer join course c
on s.course_id = c.course_id; 
```

---

[View on CodeChef](https://www.codechef.com/problems/PPSQL06)