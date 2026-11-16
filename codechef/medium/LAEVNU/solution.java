import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static long formDig(int startIdx, int[] arr){
        
        long ans = arr[startIdx];
        
        for(int i=arr.length-1; i>=0; i--){
            
            if(startIdx == i) continue;
            ans = ans * 10 + arr[i];
        }
        
        return ans;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
	    
	    int n = s.length();
	    
	    HashSet<Integer> unique = new HashSet<>(); 
		
		for(int i=0; i<n; i++){
		    
		    if(s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9){
		        unique.add(s.charAt(i) - '0');
		    }
		}
		
		if(unique.size() == 1 && unique.contains(0)) { 
		    System.out.println(0);
		    return;
		}
		else if (unique.size() == 0) {
		    System.out.println(-1);
		    return;
		}
		else if(unique.size() == 1){
		    
		    int dig = 0;
		    for (int val : unique){
		        dig = val;
		    }
		    
		    if(dig % 2 == 0) {
		        System.out.println(dig);
		    }
		    else {
		        System.out.println(-1);
		    }
		    
		    return;
		}
		
		int sz = unique.size();
		int[] arr = new int[sz];
		
		int j = 0;
		
		for(int i=9; i>=0; i--){
		    if(unique.contains(i)){
		        arr[j++] = i;
		    }
		}
		
		int startIdx = 0;
		long maxDig = Long.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
		    
		    startIdx = i;
		    if(arr[startIdx] == 0) continue;
		    
		    long dig = formDig(startIdx, arr);
		    
		    if(dig % 2 == 0) maxDig = Math.max(maxDig, dig);
		}
		
		if(maxDig == Long.MIN_VALUE) System.out.println(-1);
		else System.out.println(maxDig);
    
	}
}
