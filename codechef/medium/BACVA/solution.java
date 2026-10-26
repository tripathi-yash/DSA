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
		
		int t = 0;
		
		if(sc.hasNextInt()){
		    t = sc.nextInt();
		}
		 
		while( t-- > 0){
		    
		    long n = 0;
		    long sum = 0;
		    
		    if(sc.hasNextInt()){
		        n = sc.nextInt();
		    }
		    
		    while( n > 0){
		        
		        sum += n % 10;
		        n /= 10;
		    }
		    
		    if(sum % 10 == 0) System.out.println("Valid");
		    else System.out.println("Invalid");
		    
		}
	}
}
