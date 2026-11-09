# KPITMISCHIEF

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Largest Mischievous Group

You are the principal of a school that has some mischievous students. The students stand in a row, described by a string of length $N$: the character `m` is a mischievous student and `g` is a good student.

A  **mischievous group**  is a maximal block of one or more consecutive `m` characters. Find the largest mischievous group and print its starting and ending positions (both inclusive), with positions numbered from $0$. If several groups have the maximum length, report the one that appears first.

### Input Format
- The first line contains an integer $N$ - the length of the string.
- The second line contains a string of length $N$ consisting of the characters m and g.
### Output Format

Print two space-separated integers: the starting and the ending index of the largest mischievous group.

### Constraints
- $1 \leq N \leq 10^5$
- The string contains only m and g, and at least one m.
### Sample 1:
Input
Output

```
5
mgmmm

```

```
2 4

```

### Explanation:

The groups are $[0, 0]$ (length $1$) and $[2, 4]$ (length $3$). The largest is $[2, 4]$.

### Sample 2:
Input
Output

```
8
mmgmmgmg

```

```
0 1

```

### Explanation:

The groups $[0, 1]$ and $[3, 4]$ both have length $2$; the first one is reported.

### Sample 3:
Input
Output

```
4
gggm

```

```
3 3

```

### Explanation:

The only group is the single student at index $3$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-09T15:54:12.754Z  

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
		int n = sc.nextInt();
		sc.nextLine();
	
		String str = "";
		
		if(sc.hasNextLine()){
		    str = sc.nextLine();
		}
		
		int currStart = -1, currEnd = 0, bestStart = 0, bestEnd = 0, currLen = 0, maxLen = 0;
		
		for(int i=0; i<n; i++){
		    
		    if(str.charAt(i) == 'm'){
		        
		        if(currStart == -1){
		            currStart = i;
		        }
		    }
		    else{
		        
		        if(currStart != -1){
		            
		            currEnd = i-1;
		            currLen = currEnd - currStart +1;
		            
		            if(currLen > maxLen){
		                maxLen = currLen;
		                bestEnd = currEnd;
		                bestStart = currStart;
		            }
		            
		            currStart = -1;
		        }
		    }
		    
		}
		
	    if(currStart != -1){
	            
            currEnd = n-1;
            currLen = currEnd - currStart +1;
            
            if(currLen > maxLen){
                maxLen = currLen;
                bestEnd = currEnd;
                bestStart = currStart;
            }
	      }
		
		System.out.println(bestStart + " " + bestEnd);
	}

}

```

---

[View on CodeChef](https://www.codechef.com/problems/KPITMISCHIEF)