class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        
        int minSum = Integer.MAX_VALUE;

        while(l <= r){

            int currSum = 0;

            for(int i=0; i<l; i++){
                currSum += nums.get(i);
            }

            if(currSum > 0) minSum = Math.min(minSum, currSum);
            
            int rightBd = l;
            while(rightBd < nums.size()){

                currSum += nums.get(rightBd);
                currSum -= nums.get(rightBd - l);

                if(currSum > 0){
                    minSum = Math.min(currSum, minSum);
                }
                   
                rightBd++; 
            }

            l++;
        }

        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }
}