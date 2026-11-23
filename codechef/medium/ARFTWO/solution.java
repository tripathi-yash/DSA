import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int sum(int x, int y){
        return x + y;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int z = 0;
		int total = 0;
		
		if(sc.hasNextInt()){
		    x = sc.nextInt();
		    y = sc.nextInt();
		    z = sc.nextInt();
		    total = sc.nextInt();
		}
		
		int first = Integer.MIN_VALUE, sec = Integer.MIN_VALUE;
		
		if(x > z && x > y){
		    first = x;
		    if(y > z && y < x) sec = y;
		    else sec = z;
		}
		else if(y > x && y > z){
		    first = y;
		    if(x > z && x < y) sec = x;
		    else sec = z;
		}
		else {
		    first = z;
		    if(x < z && x > y) sec = x;
		    else sec = y;
		}
		System.out.println((sum(first, sec) >= total) ? "YES" : "NO");
    
	}
}
