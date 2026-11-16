# MULTITAB

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Gift Boxes

Chef wants to prepare $X$ gift boxes. Each box must contain exactly $3$ chocolates.

Chef has $Y$ chocolates. Determine whether he has enough chocolates to prepare all $X$ boxes.

### Input Format
- The first line contains an integer $T$, the number of test cases.
- Each test case contains two space-separated integers $X$ and $Y$ — the number of gift boxes and the number of chocolates Chef has, respectively.
### Output Format

For each test case, print `YES` if Chef has enough chocolates to prepare all $X$ boxes, or `NO` otherwise, on a separate line.

You may print the answer in any combination of uppercase and lowercase letters.

### Constraints
- $1 \le T \le 2000$
- $1 \le X \le 100$
- $0 \le Y \le 1000$
### Sample 1:
Input
Output

```
4
3 12
2 0
6 17
4 12
```

```
YES
NO
NO
YES
```

### Explanation:
- Test case 1: Chef needs $3 \times 3 = 9$ chocolates and has $12$, so he can prepare all the boxes.
- Test case 2: Chef needs $3 \times 2 = 6$ chocolates but has none.
- Test case 3: Chef needs $3 \times 6 = 18$ chocolates but has only $17$.
- Test case 4: Chef needs $3 \times 4 = 12$ chocolates and has exactly $12$, so he can prepare all the boxes.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T13:47:15.171Z  

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
		if(sc.hasNextInt()){
		    t = sc.nextInt();
		}
		
		while(t-- > 0){
		    
    		int x = 0;
    		int y = 0;
    		
    		if(sc.hasNextInt()){
    		    x = sc.nextInt();
    		    y = sc.nextInt();
    		}
    		
    		if(x * 3 <= x * y) System.out.println("YES");
    		else System.out.println("NO");
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MULTITAB)