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
		int t = sc.nextInt();
		sc.nextLine();
		
		while(t-- > 0){
		    
    		String str = "";
    		
    		if(sc.hasNextLine()){
    		    str = sc.nextLine();
    		}
    		
    		int currStart = -1, currEnd = 0, bestStart = 0, bestEnd = 0, currLen = 0, maxLen = 0;
    		
    		for(int i=0; i<str.length(); i++){
    		    
    		    if(str.charAt(i) == 'm'){
    		        
    		        if(currStart == -1){
    		            currStart = i;
    		        }
    		    }
    		    else{
    		        
    		        if(currStart != -1){
    		            
    		            currEnd = i-1;
    		            currLen = currEnd - currStart +1;
    		            
    		            if(currLen > maxLen){
    		                maxLen = currLen;
    		                bestEnd = currEnd;
    		                bestStart = currStart;
    		            }
    		            
    		            currStart = -1;
    		        }
    		    }
    		    
    		}
    		
		    if(currStart != -1){
		            
	            currEnd = str.length()-1;
	            currLen = currEnd - currStart +1;
	            
	            if(currLen > maxLen){
	                maxLen = currLen;
	                bestEnd = currEnd;
	                bestStart = currStart;
	            }
		      }
    		
    		System.out.println(bestStart + " " + bestEnd);
		}
    
	}
}
