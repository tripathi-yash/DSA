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
**Submitted:** 2026-11-16T15:04:42.584Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static long formDig(int startIdx, int[] arr){
        
        long ans = arr[startIdx];
        
        for(int i=arr.length-1; i>=0; i--){
            
            if(startIdx == i) continue;
            ans = ans * 10 + arr[i];
        }
        
        return ans;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
	    
	    int n = s.length();
	    
	    HashSet<Integer> unique = new HashSet<>(); 
		
		for(int i=0; i<n; i++){
		    
		    if(s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9){
		        unique.add(s.charAt(i) - '0');
		    }
		}
		
		if(unique.size() == 1 && unique.contains(0)) { 
		    System.out.println(0);
		    return;
		}
		else if (unique.size() == 0) {
		    System.out.println(-1);
		    return;
		}
		else if(unique.size() == 1){
		    
		    int dig = 0;
		    for (int val : unique){
		        dig = val;
		    }
		    
		    if(dig % 2 == 0) {
		        System.out.println(dig);
		    }
		    else {
		        System.out.println(-1);
		    }
		    
		    return;
		}
		
		int sz = unique.size();
		int[] arr = new int[sz];
		
		int j = 0;
		
		for(int i=9; i>=0; i--){
		    if(unique.contains(i)){
		        arr[j++] = i;
		    }
		}
		
		int startIdx = 0;
		long maxDig = Long.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
		    
		    startIdx = i;
		    if(arr[startIdx] == 0) continue;
		    
		    long dig = formDig(startIdx, arr);
		    
		    if(dig % 2 == 0) maxDig = Math.max(maxDig, dig);
		}
		
		if(maxDig == Long.MIN_VALUE) System.out.println(-1);
		else System.out.println(maxDig);
    
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LAEVNU)