class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxWealth = 0;

        for(int i=0; i<accounts.length; i++){
            int w = 0;
            
            for(int j=0; j<accounts[i].length; j++){
                w += accounts[i][j];
            } 

            maxWealth = Math.max(maxWealth, w);
        }

        return maxWealth;
    }
}