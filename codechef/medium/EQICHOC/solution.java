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
		int y = 0;
		
		if(sc.hasNextInt()){
		    x = sc.nextInt();
		    y = sc.nextInt();
		}
		
		System.out.println(Math.abs(x-y));
    
	}
}
