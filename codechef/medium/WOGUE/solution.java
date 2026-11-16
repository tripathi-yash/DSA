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
		    
		    String s = sc.next();
		    String r = sc.next();
		    
		    StringBuilder m = new StringBuilder();
		    
		    for(int i=0; i<5; i++){
		        
		        if(s.charAt(i) == r.charAt(i)){
		            m.append('G');
		        }
		        else{
		            m.append('B');
		        }
		    }
		    
		    
		    System.out.println(new String(m));
		}
		
    
	}
}
