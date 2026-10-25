class Solution {
    public int commonFactors(int a, int b) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=1; i*i <= a; i++){
            
            if((a % i) == 0) {
                set.add(i);
                set.add(a/i);
            }
        }

        int cmnFact = 0;
        for(int i=1; i*i <= b; i++){

            if((b % i) == 0) {

                if(set.contains(i)) cmnFact++;
                if(i != (b/i) && set.contains(b/i)) cmnFact++;
            }
        }

        return cmnFact;
    }
}