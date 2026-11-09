# DIWALIPC

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Diwali PC Build

Chef wants to build a PC for Diwali, which is $K$ days away.

The components currently cost $P$ rupees in total, including RAM. The RAM price increases by $D$ rupees each day, while all other prices remain unchanged.

Chef has decided to buy the components on Diwali. Will his budget of $B$ rupees be enough?

### Input Format
- The first line contains an integer $T$, the number of test cases.
- Each test case contains four space-separated integers $P$, $D$, $K$, and $B$ — the current total cost, the daily increase in RAM price, the number of days until Diwali, and Chef's budget, respectively.
### Output Format

For each test case, print `YES` if Chef can afford all the components on Diwali, or `NO` otherwise, on a separate line.

You may print the answer in any combination of uppercase and lowercase letters.

### Constraints
- $1 \le T \le 100$
- $1 \le P,B \le 10^5$
- $1 \le D \le 500$
- $0 \le K \le 30$
### Sample 1:
Input
Output

```
4
100 10 2 120
200 20 3 250
150 5 4 180
100 10 0 90
```

```
YES
NO
YES
NO
```

### Explanation:
- Test case 1: After $2$ days, the total cost is $100 + 10 \times 2 = 120$ rupees. Chef's budget exactly covers the cost.
- Test case 2: After $3$ days, the total cost is $200 + 20 \times 3 = 260$ rupees, which exceeds his budget of $250$ rupees.
- Test case 3: After $4$ days, the total cost is $150 + 5 \times 4 = 170$ rupees, which is within his budget of $180$ rupees.
- Test case 4: Diwali is today, so the total cost remains $100$ rupees. His budget of $90$ rupees is insufficient.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-09T14:07:00.221Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = 0;
		
		if(sc.hasNextInt()) {
		    t = sc.nextInt();
		}
		
		while(t-- > 0){
		    
    		int P = 0;
    		int D = 0;
    		int K = 0;
    		int B = 0;
    		
    		if(sc.hasNextInt()){
    		    P = sc.nextInt();
    		    D = sc.nextInt();
    		    K = sc.nextInt();
    		    B = sc.nextInt();
    		}
    		
    		int k_cost = K * D + P;
    		
    		if(k_cost > B) System.out.println("NO");
    		else System.out.println("YES");
		}
		
    
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DIWALIPC)