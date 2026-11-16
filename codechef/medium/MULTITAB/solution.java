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
