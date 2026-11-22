class Solution {
    static int nthFibonacci(int n) {
        // code here
        int first = 0, sec = 1;
        for(int i=0; i<n; i++){
            
            int next = first + sec;
            first = sec;
            sec = next;
            
        }
        
        return first;
    }
}