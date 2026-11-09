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
		
		if(sc.hasNextInt()) {
		    t = sc.nextInt();
		}
		
		while(t-- > 0){
		    
    		int P = 0;
    		int D = 0;
    		int K = 0;
    		int B = 0;
    		
    		if(sc.hasNextInt()){
    		    P = sc.nextInt();
    		    D = sc.nextInt();
    		    K = sc.nextInt();
    		    B = sc.nextInt();
    		}
    		
    		int k_cost = K * D + P;
    		
    		if(k_cost > B) System.out.println("NO");
    		else System.out.println("YES");
		}
		
    
	}
}
