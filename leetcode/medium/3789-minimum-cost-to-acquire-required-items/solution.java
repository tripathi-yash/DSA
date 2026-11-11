class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        
        long totalCost = 0;

        totalCost += (long)Math.min(cost1+cost2, costBoth) * Math.min(need1,need2);
        totalCost += (long)Math.min(cost1, costBoth) * (need1 - Math.min(need1,need2));
        totalCost += (long)Math.min(cost2, costBoth) * (need2 - Math.min(need1,need2));

        return totalCost;
    }
}