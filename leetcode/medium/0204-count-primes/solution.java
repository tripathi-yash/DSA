class Solution {

    public void sieveOfErathasmus(boolean[] isPrime, int n){

        int i=2;
        while(i*i < n){

            if(isPrime[i]){

                for(int j=2*i; j<n; j += i){
                    isPrime[j] = false;
                }
            }

            i++;
        }

    }
    public int countPrimes(int n) {
        
        if(n<=2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);

        isPrime[0] = false;
        isPrime[1] = false;

        sieveOfErathasmus(isPrime, n);

        int count = 0;
        for(int i=0; i<n; i++){
            if(isPrime[i] == true) count++;
        }

        return count;
    }
}