# BMC15A

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice problem - Apples and oranges

Rushitote went to a programming contest to distribute apples and oranges to the contestants.
He has $N$ apples and $M$ oranges, which need to be divided  **equally**  amongst the contestants. Find the maximum possible number of contestants such that:

- Every contestant gets an equal number of apples; and
- Every contestant gets an equal number of oranges.

Note that every fruit with Rushitote  *must*  be distributed, there cannot be any left over.

For example, $2$ apples and $4$ oranges can be distributed equally to two contestants, where each one receives $1$ apple and $2$ oranges.
However, $2$ apples and $5$ oranges can only be distributed equally to one contestant.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line of each test case contains two space-separated integers $N$ and $M$ — the number of apples and oranges, respectively.
### Output Format

For each test case, output on a new line the answer: the maximum number of contestants such that everyone receives an equal number of apples and an equal number of oranges.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N, M \leq 10^9$
### Sample 1:
Input
Output

```
3
1 5
2 4
4 6
```

```
1
2
2
```

### Explanation:

 **Test case $1$:**  There's only one apple, so distributing to more than one person is impossible.

 **Test case $2$:**  As explained in the statement, $2$ people can each receive $1$ apple and $2$ oranges.

 **Test case $3$:**  $2$ people can each receive $2$ apples and $3$ oranges. It's not possible to distribute equally to more than two people.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-09T14:30:43.703Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public int gcd(int x, int y){
        
        while(y != 0){
            
            int temp = y;
            y = x % y;
            x = temp;
        }
        
        return x;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = 0;
		t = sc.nextInt();
		
		while(t-- > 0) {
		    
    		int x = 0;
    		int y = 0;
    		
    		if(sc.hasNextInt()){
    		    x = sc.nextInt();
    		    y = sc.nextInt();
    		}
    		
    		int i = 1;
    		
    		while(((x % i) == 0) && ((y % i) == 0)){
    		    
    		    i++;
    		}
    		
    		System.out.println(gcd(x,y));
		}
    
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BMC15A)