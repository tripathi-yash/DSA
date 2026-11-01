class Solution {
    public int findNumbers(int[] nums) {
        
        int ans = 0;

        for(int i=0; i<nums.length; i++){

            int temp = nums[i];
            int countDig = 0;

            while(temp != 0){
                
                temp /=10;
                countDig++;
            }

            if((countDig & 1) == 0) ans += 1;
        }

        return ans;
    }
}