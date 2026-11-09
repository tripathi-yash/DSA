# LSMALL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Lexicographically Smallest Subsequence

You are given a string $S$ of lowercase English letters and an integer $K$.

Find the lexicographically smallest subsequence of $S$ containing exactly $K$ characters.

A  **subsequence**  is obtained by deleting zero or more characters from a string without changing the relative order of the remaining characters.

For two different strings of the same length, the  **lexicographically smaller**  string is the one with the alphabetically earlier character at the first position where they differ.

### Input Format
- The first line contains an integer $T$, the number of test cases.
- For each test case: The first line contains the string $S$. The second line contains an integer $K$, the required subsequence length.
### Output Format

For each test case, print the lexicographically smallest subsequence of $S$ of length $K$ on a separate line.

### Constraints
- $1 \le T \le 5$
- $1 \le K \le |S| \le 10^5$
- $S$ contains only lowercase English letters.
### Sample 1:
Input
Output

```
2
cbacd
3
bbaba
3
```

```
acd
aba
```

### Explanation:
- Test case 1: Selecting the characters at positions $3$, $4$, and $5$ gives $\texttt{acd}$, the lexicographically smallest subsequence of length $3$.
- Test case 2: Selecting the characters at positions $3$, $4$, and $5$ gives $\texttt{aba}$. Although $\texttt{aab}$ is lexicographically smaller, it cannot be formed as a subsequence because no $\texttt{b}$ occurs after the second $\texttt{a}$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-09T16:15:01.551Z  

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
		
		int x = 0;
		
		if(sc.hasNextInt()){
		    x = sc.nextInt();
		}
		
		while(x-- > 0){
		    
		    String str = sc.nextLine();
		    int k = sc.nextInt();
		    
		    int l=0, r;
		    boolean isFound = false;
		    
		    for(r=0; r<str.length(); r++){
		        
		        while(  str.charAt(r) >= str.charAt(l) &&
		                r < str.length() ){
		                    
		                  r++;
		                  
		                  if((r-l+1) == k) {
		                      
		                      isFound = true;
		                      break; 
		                  }
		          }
		          
		          if(isFound) break;
		          
		          if(str.charAt(l) > str.length() ) l++;
		    }
		    
		    System.out.println(str.substring(l, r+1));
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LSMALL)