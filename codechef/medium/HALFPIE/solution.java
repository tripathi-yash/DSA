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
    		
    		for(int i=0; i<y; i++){
    		    
    		    sum += arr[i];
    		    
    		    if(min1 > arr[i]){
    		        min2 = min2;
    		        min1 = arr[i];
    		    }
    		    else if(min2 > arr[i]){
    		        min2 = arr[i];
    		    }
    		}
    		   
    		min1 /= 2;
    		min2 /=2;
    		
    	System.out.println(sum - min1 - min2);
    		
		}
	}
}
