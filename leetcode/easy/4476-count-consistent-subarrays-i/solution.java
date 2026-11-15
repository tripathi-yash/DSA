class Solution {
    public int countConsistent(int[] nums) {

        int count = 0;
        
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){

                int minEl = Integer.MAX_VALUE;
                int and = nums[j];
                
                for(int k = i; k<=j; k++){
                    
                    minEl = Math.min(minEl,nums[k]);  

                    and &= nums[k];
                }
                
                if(and == minEl) count++;
            }
        }

        return count;
    }
}