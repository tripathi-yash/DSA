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
		if(sc.hasNextInt()){
		    t = sc.nextInt();
		}
		
		while(t-- > 0) {
		    
    		int n = 0;
    		
    		if(sc.hasNextInt()){
    		    n = sc.nextInt();
    		}
    		
    		int[] arr = new int[n];
    		int i = 0;
    		
    		while(sc.hasNextInt() && i < n){
    		    arr[i++] = sc.nextInt();
    		}
    		
    		int countOnes = 0, countNegOnes = 0;
    		
    		for(int j=0; j<n; j++){
    		    if (arr[j] == 1) countOnes++;
    		    if (arr[j] == -1) countNegOnes++;
    		}
    		
    		int diff = Math.abs(countNegOnes - countOnes);
    		
    		if(diff % 2 == 1){
    		    System.out.println(-1);
    		}
    		
    		else System.out.println( diff / 2);
    	
		}
    
	}
}
