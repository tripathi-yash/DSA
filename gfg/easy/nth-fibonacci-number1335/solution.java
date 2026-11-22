class Solution {
    static int nthFibonacci(int n) {
        // code here
        if (n==0) return 0;
        if (n==1) return 1;
        
        int first = 1, sec = 1;
        for(int i=2; i<=n; i++){
            
            int next = first + sec;
            first = sec;
            sec = next;
            
        }
        
        return first;
    }
}