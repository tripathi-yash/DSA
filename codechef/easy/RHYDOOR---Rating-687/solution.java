import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t= 0;
		
		if(sc.hasNextInt()){
		    t = sc.nextInt();
		}
		
		while(t-- > 0){
		    
		    int n = 0;
		    
		    if(sc.hasNextInt()){
		        n = sc.nextInt();
		    }
		    
		    String str = null;
		    
            if(sc.hasNext()){
                str = sc.next();
		    }

		    
		    int count = 1, ans = 0;
		  
		    for(int i=1; i<n; i++){
		        
                if(str.charAt(i-1) != str.charAt(i) || count == 3) {
                    count = 1;
                    
                }
      
                else count++;
                
                if(count == 3) ans++;
                
		    }
		    
		    System.out.println(ans);
		}
		
	}
}
