class Solution {
    public boolean isThree(int n) {
        
        int count = 0;

        for(int i=1; i*i<=n; i++){

            if((n % i == 0) && (i != (n/i))) count+=2;
            else if(n % i == 0)count++;
        }

        if(count == 3) return true;

        return false;
    }
}