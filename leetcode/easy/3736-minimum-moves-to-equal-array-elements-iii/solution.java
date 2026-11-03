class Solution {
    public int minMoves(int[] nums) {
        int maxi = Integer.MIN_VALUE, sum = 0;
        for(int num : nums) maxi = Math.max(maxi, num);

        for(int num : nums) sum += (maxi - num);

        return sum;   
    }
}