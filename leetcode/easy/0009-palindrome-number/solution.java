class Solution {
    public boolean isPalindrome(int x) {

        String orig = Integer.toString(x);
        
        StringBuilder sb = new StringBuilder(orig).reverse();

        return (sb.toString().equals(orig)); 
    }
}