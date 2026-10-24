-- Write a query to do the following:

-- FULL OUTER JOIN the 'student' and 'course' tables using 'Course_id' to match the tables. Output the joined table.
select * from student s
full outer join course c
on s.course_id = c.course_id; 