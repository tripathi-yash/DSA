import java.util.Arrays;
import java.util.HashMap;

class Solution { 
    public int[] countServers(int n, int[][] logs, int x, int[] queries) { 
        // 1. Sort logs based on their timestamps
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1])); 
        
        // 2. Pair queries with their original indexes to preserve order after sorting
        int[][] queriesWithIdx = new int[queries.length][2]; 
        for (int i = 0; i < queries.length; i++) { 
            queriesWithIdx[i] = new int[]{queries[i], i}; 
        } 
        // Sort queries based on their query times
        Arrays.sort(queriesWithIdx, (a, b) -> Integer.compare(a[0], b[0])); 
        
        HashMap<Integer, Integer> cnt = new HashMap<>(); 
        int[] ans = new int[queries.length]; 
        int leftPtr = 0, rightPtr = 0; 
        
        // 3. Process each query using the sliding window approach
        for (int j = 0; j < queriesWithIdx.length; j++) { 
            int lowerBound = queriesWithIdx[j][0] - x; 
            int rightBound = queriesWithIdx[j][0]; 
            int originalIdx = queriesWithIdx[j][1]; 
            
            // Expand the window: Add logs that fall within the current right boundary
            while (rightPtr < logs.length && logs[rightPtr][1] <= rightBound) { 
                cnt.put(logs[rightPtr][0], cnt.getOrDefault(logs[rightPtr][0], 0) + 1); 
                rightPtr++; 
            } 
            
            // Shrink the window: Remove logs that fall behind the lower boundary
            while (leftPtr < logs.length && logs[leftPtr][1] < lowerBound) { 
                int serverId = logs[leftPtr][0];
                if (cnt.containsKey(serverId)) { 
                    cnt.put(serverId, cnt.get(serverId) - 1); 
                    if (cnt.get(serverId) == 0) { 
                        cnt.remove(serverId); 
                    } 
                } 
                leftPtr++; 
            } 
            
            // Total servers minus the count of active unique servers in the map
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
