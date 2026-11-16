# LAEVNU

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Largest Even Number from String

You are given a string $S$ containing letters, digits, and special characters. A  **digit**  is any character from `0` to `9`.

Extract all digits from $S$ and rearrange them to form the largest possible even number. Ignore all non-digit characters.  **Every extracted digit must be used exactly once**, including repeated occurrences.

Print the resulting number without leading zeros. If all extracted digits are zero, print `0`.

If $S$ contains no digits, or no even number can be formed, print `-1`.

### Input Format

A single line contains the string $S$.

### Output Format

Print the largest possible even number that can be formed using all the extracted digits, or $-1$ if it is impossible.

### Constraints
- $1 \le |S| \le 1000$
- Every character of $S$ has an ASCII value between $33$ and $126$, inclusive. Thus, $S$ may contain English letters, digits, and punctuation symbols, but no spaces or other whitespace.
### Sample 1:
Input
Output

```
asdf@75483
```

```
87534
```

### Explanation:

The extracted digits are $7$, $5$, $4$, $8$, and $3$. The largest even number that can be formed using all of them is $87534$.

### Sample 2:
Input
Output

```
a1#7b5
```

```
-1
```

### Explanation:

All extracted digits are odd, so no arrangement can form an even number.

### Sample 3:
Input
Output

```
x0@0y
```

```
0
```

### Explanation:

Both extracted digits are zero. The resulting number is printed as $0$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T13:57:54.591Z  

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

[View on CodeChef](https://www.codechef.com/problems/LAEVNU)