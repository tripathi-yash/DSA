class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        
        long totalCost = 0;

        if((cost1+cost2) <= costBoth){
            totalCost += (long)cost1 * need1 + (long)cost2 * need2;
        }
        else{
            int min = Math.min(need1,need2);
            totalCost += (long)costBoth * Math.min(need1,need2);

            need1 -= min;
            need2 -= min;

            if(need1 > 0) totalCost += (long) Math.min(cost1,costBoth) * need1;
            if(need2 > 0) totalCost += (long) Math.min(cost2,costBoth) * need2;
        }
        // totalCost += (long)Math.min(cost1+cost2, costBoth) * Math.min(need1,need2);
        // totalCost += (long)Math.min(cost1, costBoth) * (need1 - Math.min(need1,need2));
        // totalCost += (long)Math.min(cost2, costBoth) * (need2 - Math.min(need1,need2));

        return totalCost;
    }
}