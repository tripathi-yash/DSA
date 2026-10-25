class Solution {

    public int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a%b);
    }
    public int smallestEvenMultiple(int n) {
        
        int gcd = gcd(n , 2);

        return (2 * n) / gcd;
    }
}