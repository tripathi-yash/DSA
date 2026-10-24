/* Write a query cross join the table 'student' and 'course' and check out all possible courses a student can opt. Output the table after cross join */

select student.St_Name , course.Course_Name
from student 
cross join 
course;