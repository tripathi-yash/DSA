import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{

	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x-- > 0){
		    
		    int n = sc.nextInt();
		    
		    int[] arr = new int[n];
		    
		    for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		    int winner = 0;
		    
		    for(int i=0; i<n; i++){
		        
		        int countSmall = 0;
		        int countBig = 0;
		        
		        for(int j=0; j<n; j++){
		            
		            if(arr[j] <= arr[i]) countSmall++;
		            else countBig++;
		        }
		        
		        if(countSmall > countBig) winner++;
		    }
		    
		    System.out.println(winner);
		    
		}
	}
}
