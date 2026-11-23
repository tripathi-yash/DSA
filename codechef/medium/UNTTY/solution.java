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
		
		String str = new String();
		str = sc.next();
		
		StringBuilder curr = new StringBuilder();
		
		for(int i=0; i<str.length(); i++){
		    
		    char c = str.charAt(i);
		    if(c == '#' && (curr.length()) != 0){
		        curr.deleteCharAt(curr.length()-1);
		    }else
		    curr.append(c);
		}
		
		System.out.println((curr.length() > 0 ) ? curr.toString() : "");
    
	}
}
