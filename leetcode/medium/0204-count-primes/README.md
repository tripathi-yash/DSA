# Count Primes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer `n`, return  *the number of prime numbers that are strictly less than*  `n`.

 

 **Example 1:** 

```
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

```

 **Example 2:** 

```
Input: n = 0
Output: 0

```

 **Example 3:** 

```
Input: n = 1
Output: 0

```

 

 **Constraints:** 

- 0 <= n <= 5 * 106

## Solution

**Language:** Java  
**Runtime:** 111 ms (beats 91.28%)  
**Memory:** 50.6 MB (beats 93.38%)  
**Submitted:** 2026-10-31T12:02:44.082Z  

```java
class Solution {

    public void sieveOfErathasmus(boolean[] isPrime, int n){

        int i=2;
        while(i*i < n){

            if(isPrime[i]){

                for(int j=i*i; j<n; j += i){
                    isPrime[j] = false;
                }
            }

            i++;
        }

    }
    public int countPrimes(int n) {
        
        if(n<=2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);

        isPrime[0] = false;
        isPrime[1] = false;

        sieveOfErathasmus(isPrime, n);

        int count = 0;
        for(int i=0; i<n; i++){
            if(isPrime[i] == true) count++;
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-primes/)