class Solution {

    private int gcd(int a, int b){

        while(b > 0){
            
            a %= b;
            int temp = b;
            b = a;
            a = temp;
        }

        return a;
    }
    public int commonFactors(int a, int b) {
        
        int gcd = gcd(a,b);
        int cmnFact = 0;

        for(int i=1; i*i <= gcd; i++){

            if((gcd % i) == 0) cmnFact++;
            if(i != (gcd/i) && (gcd % i) == 0) cmnFact++;
        }

        return cmnFact;
    }
}