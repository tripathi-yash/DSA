# Calculate Money in Leetcode Bank

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Hercy wants to save money for his first car. He puts money in the Leetcode bank  **every day**.

He starts by putting in `$1` on Monday, the first day. Every day from Tuesday to Sunday, he will put in `$1` more than the day before. On every subsequent Monday, he will put in `$1` more than the  **previous Monday**.

Given `n`, return  *the total amount of money he will have in the Leetcode bank at the end of the* `nth` *day.* 

 

 **Example 1:** 

```
Input: n = 4
Output: 10
Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.

```

 **Example 2:** 

```
Input: n = 10
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.

```

 **Example 3:** 

```
Input: n = 20
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.

```

 

 **Constraints:** 

- 1 <= n <= 1000

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 34.26%)  
**Memory:** 41.3 MB (beats 99.42%)  
**Submitted:** 2026-10-24T03:15:32.790Z  

```java
class Solution {
    public int totalMoney(int n) {
       int monAmt = 1, runAmt = 0, dayCount = 0, nthDayAmt = 0;

       while(n-- > 0){
        
            if(dayCount > 0 && dayCount % 7 == 0){
                monAmt += 1;
                dayCount = 0;
                runAmt = monAmt;
            } else {
                runAmt += 1;
            }

            nthDayAmt += runAmt;
            dayCount++;
       }

       return nthDayAmt; 
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/calculate-money-in-leetcode-bank/)