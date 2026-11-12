# Water Bottles

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

There are `numBottles` water bottles that are initially full of water. You can exchange `numExchange` empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers `numBottles` and `numExchange`, return  *the  **maximum**  number of water bottles you can drink*.

 

Original
Java
 **Example 1:** 

```
Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.

```

 **Example 2:** 

```
Input: numBottles = 15, numExchange = 4
Output: 19
Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
Number of water bottles you can drink: 15 + 3 + 1 = 19.

```

 

 **Constraints:** 

- 1 <= numBottles <= 100
- 2 <= numExchange <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.4 MB (beats 89.32%)  
**Submitted:** 2026-11-12T11:50:03.610Z  

```java
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int totalDrunk = numBottles;
        int exchangedBottles = numBottles / numExchange;
        int remToDrink = exchangedBottles + (numBottles % numExchange);

        while(remToDrink >= numExchange){

            totalDrunk += exchangedBottles;
            exchangedBottles = remToDrink / numExchange;
            remToDrink = exchangedBottles + (remToDrink % numExchange);
        }

        return totalDrunk += exchangedBottles;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/water-bottles/)