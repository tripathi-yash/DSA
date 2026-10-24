class Solution {
    public boolean isPalindrome(int x) {

        // String orig = Integer.toString(x);
        
        // StringBuilder sb = new StringBuilder(orig).reverse();

        // return (sb.toString().equals(orig)); 
        if (x < 0) return false;     
        long ans = 0;
        int temp = x;
        
        
        while(temp != 0){
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp /= 10;
        }        

        return ans == x;
    }
}