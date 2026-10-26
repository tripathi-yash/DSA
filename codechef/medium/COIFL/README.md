# COIFL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coin Flip

A coin has $1$ printed on one side and $2$ on the other. Each flip adds the number on the face-up side to a running sum, initially $0$.

Find the number of distinct sequences of flips whose sum is exactly $S$. Two sequences are different if they differ in length or in the result of at least one flip. For example, $(1, 2)$ and $(2, 1)$ are different sequences.

### Input Format

The input contains a single integer $S$, the required sum.

### Output Format

Print the number of distinct sequences of flips whose sum is exactly $S$.

### Constraints
- $1 \le S \le 20$
### Sample 1:
Input
Output

```
3
```

```
3
```

### Explanation:

To achieve a sum of 3, there are three ways:

- (1, 2)
- (2, 1)
- (1, 1, 1)
### Sample 2:
Input
Output

```
2
```

```
2
```

### Explanation:

To achieve a sum of 2, there are two ways:

- (1, 1)
- (2)

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T16:09:22.153Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int serve(int x, int y){
        return x * y;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		if(sc.hasNextInt()){
		    x = sc.nextInt();
		    y = sc.nextInt();
		}
		
		System.out.println(serve(x,y));
    
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/COIFL)