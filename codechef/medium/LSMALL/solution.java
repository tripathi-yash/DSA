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
		    
		    String str = sc.next();
		    int k = sc.nextInt();
		    
		    int l=0, r;
		    boolean isFound = false;
		    
		    for(r=0; r<str.length(); r++){
		        
		        while(  str.charAt(r) >= str.charAt(l) &&
		                r < str.length() ){
		                    
		                  r++;
		                  
		                  if((r-l+1) == k) {
		                      
		                      isFound = true;
		                      break; 
		                  }
		          }
		          
		          if(isFound) break;
		          
		          if(str.charAt(l) > str.charAt(r) ) l++;
		    }
		    
		    System.out.println(str.substring(l, r+1));
		}
	}
}
