class Solution {
    public int commonFactors(int a, int b) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=1; i*i <= a; i++){
            
            if((a % i) == 0) {
                map.put(i, map.getOrDefault(i,0) + 1);
                if (i != (a/i))
                map.put((a/i), map.getOrDefault((a/i),0) + 1);
            }
        }

        for(int i=1; i*i <= b; i++){
            if((b % i) == 0) {
                map.put(i, map.getOrDefault(i,0) + 1);
                if (i != (b/i))
                map.put((b/i), map.getOrDefault((b/i),0) + 1);
            }
        }

        int cmnFact = 0;
        for(int val : map.values()){
            if (val > 1) cmnFact++;
        }

        return cmnFact;
    }
}