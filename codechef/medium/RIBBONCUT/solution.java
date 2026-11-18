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
		
		for(int i=1; i<=x; i++){
		    int rem = x - i;
		    
		    if(i*2 == rem){
		        System.out.println("YES");
		        return;
		    }
		    
		}
		
		System.out.println("NO");
	}
}
