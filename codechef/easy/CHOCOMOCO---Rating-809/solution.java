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
		t = sc.nextInt();
		
		while(t-- > 0) {
		    
    		int x = sc.nextInt();
    
    	    if( (x % 4) == 0) System.out.println("NO");
    	    else System.out.println("YES");
		}
		    
	}
}
