class Solution {
    boolean solver(String s,int l,int r){
        
        if(l >= r) return true;
        
        if(s.charAt(l) != s.charAt(r)) return false;
        
        return solver(s, ++l,--r);
    }
    
    boolean isPalindrome(String s) {
        // code here
        
        return solver(s, 0, s.length()-1);
    }
}