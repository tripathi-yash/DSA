# Average Salary Excluding the Minimum and Maximum Salary

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of  **unique**  integers `salary` where `salary[i]` is the salary of the `ith` employee.

Return  *the average salary of employees excluding the minimum and maximum salary*. Answers within `10-5` of the actual answer will be accepted.

 

 **Example 1:** 

```
Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

```

 **Example 2:** 

```
Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000

```

 

 **Constraints:** 

- 3 <= salary.length <= 100
- 1000 <= salary[i] <= 106
- All the integers of salary are unique.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.5 MB (beats 99.91%)  
**Submitted:** 2026-10-29T16:28:19.508Z  

```java
class Solution {
    public double average(int[] salary) {
        



 




                

            
        

    

    
        
    

        int minS = Integer.MAX_VALUE;
        int maxS = Integer.MIN_VALUE;

        double avg = 0, sum = 0;
        for(int i=0; i<salary.length; i++){
   
            sum += salary[i];
            if(minS > salary[i]) minS = Math.min(minS, salary[i]);
            if(maxS < salary[i]) maxS = Math.max(maxS, salary[i]);
        }

        avg = ( sum - minS - maxS) / (salary.length - 2);
 
       
        return avg;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/)