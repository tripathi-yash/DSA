import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int gcd(int x, int y){
        
        while(y != 0){
            
            int temp = y;
            y = x % y;
            x = temp;
        }
        
        return x;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = 0;
		t = sc.nextInt();
		
		while(t-- > 0) {
		    
    		int x = 0;
    		int y = 0;
    		
    		if(sc.hasNextInt()){
    		    x = sc.nextInt();
    		    y = sc.nextInt();
    		}
    		
    		int i = 1;
    		
    		while(((x % i) == 0) && ((y % i) == 0)){
    		    
    		    i++;
    		}
    		
    		System.out.println(gcd(x,y));
		}
    
	}
}
