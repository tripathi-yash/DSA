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
    		
    		int max1 = Integer.MIN_VALUE;
    		int max2 = Integer.MIN_VALUE;
    		
    		long sum = 0;
    		
    		for(int i=0; i<y; i++){
    		    
    		    sum += arr[i];
    		    
    		    if(max1 < arr[i]){
    		        max2 = max1;
    		        max1 = arr[i];
    		    }
    		    else if(max2 < arr[i]){
    		        max2 = arr[i];
    		    }
    		}
    		   
    		max1 /= 2;
    		max2 /=2;
    		
    	System.out.println(sum - max2 - max1);
    		
		}
	}
}
