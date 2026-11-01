class Solution {

    public int DigCount(int n){
        
        int count = 0;
        
        while(n != 0){
            n /= 10;
            count++;
        }

        return count;
    }
    public int minMergedInteger(int[] nums) {

        int minSoFar = Integer.MAX_VALUE;
        int i=0;

        while(i < nums.length){

            int merged = nums[i] * (int)Math.pow(10, DigCount(nums[i+1]) ) + nums[i+1];
            minSoFar = Math.min(merged , minSoFar);

            i+=2;
        }

        return minSoFar;
    }
}