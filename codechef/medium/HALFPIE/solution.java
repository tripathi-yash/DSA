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
		    
    		int y = 0;
		    y = sc.nextInt();
    		
    		int[] arr = new int[y];
    		
    		for(int i=0; i<y; i++){
    		    arr[i] = sc.nextInt();
    		}
    		
    		int min1 = Integer.MAX_VALUE;
    		int min2 = Integer.MAX_VALUE;
    		
    		long sum = 0;
    		int min = Integer.MAX_VALUE;
    		
    		for(int i=0; i<y; i++){
    		    
    		    sum += arr[i];
    		    
    		    if(i>0){
    		        
    		        min = Math.min(min, (arr[i] + arr[i-1])/2);
    		    }
    		}
    		
    	    System.out.println(sum - min);
		}
	}
}
