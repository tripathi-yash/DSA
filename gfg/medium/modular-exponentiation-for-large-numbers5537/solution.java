class Solution {
    // public long power(long x, int e, int M){
    //     if(e == 0) return 1;
        
    //     x = x % M;
    //     long p = power(x,e/2,M);
        
    //     return (e%2==0) ? (p * p) % M : ((p * p) % M) * x % M;
    // }
    public int powMod(int x, int n, int M) {
        // code here
        
        long ans = 1;
        
        while(n > 0){
            
            if((n & 1) == 1){
                ans = (x * ans) % M;
            }
            
            x = (int)(((long)x *x) % M); 
            n >>=1;
        }
        
        return (int)ans;
        
        
    }
}