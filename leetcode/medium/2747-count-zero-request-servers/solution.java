class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        
        // sorting + sliding windiw approach
        Arrays.sort(logs, (a,b) -> a[1] - b[1]);
        int[][] queriesWithIdx = new int[queries.length][2];

        for(int i=0; i<queries.length; i++){
            queriesWithIdx[i] = new int[]{queries[i], i};
        }
        Arrays.sort(queriesWithIdx, (a,b) -> a[0] - b[0]);

        HashMap<Integer,Integer> cnt = new HashMap<>();
        int[] ans = new int[queries.length];

        int leftPtr = 0, rightPtr = 0;

        for(int j=0; j<queriesWithIdx.length; j++){

            int lowerBound = queriesWithIdx[j][0] - x;
            int rightBound = queriesWithIdx[j][0];
            int originalIdx = queriesWithIdx[j][1];

            while( rightPtr < logs.length && 
                    logs[rightPtr][1] <= rightBound){

                        cnt.put(logs[rightPtr][0], cnt.getOrDefault(logs[rightPtr][0],0)+1);
                        rightPtr++;
                    }

            while( leftPtr < logs.length && 
                    logs[leftPtr][1] < lowerBound){

                        if( cnt.containsKey(logs[leftPtr][0]) ){

                            cnt.put(logs[leftPtr][0], cnt.get(logs[leftPtr][0])-1);
                            if(cnt.get(logs[leftPtr][0]) <= 0)  {
                                
                                cnt.remove(logs[leftPtr][0]);
                            }
                        }
                        leftPtr++;
                    }

            ans[originalIdx] = n - cnt.size();
        }
        return ans;
    }
}

        // int[] ans = new int[queries.length];
        // int[] currRange = new int[2];

        // for(int q=0; q<queries.length; q++){

        //     currRange[0] = queries[q] - x;
        //     currRange[1] = queries[q];
         
        //     HashSet<Integer> uniqueIds = new HashSet<>();

        //     for(int lg=0; lg<logs.length; lg++){

        //         int[] currLog = logs[lg];

        //         if( (currLog[1] >= currRange[0]) && 
        //             (currLog[1] <= currRange[1]) ) {

        //             uniqueIds.add(currLog[0]);
        //         }
        //     }

        //     ans[q] = n - uniqueIds.size();
        // }
