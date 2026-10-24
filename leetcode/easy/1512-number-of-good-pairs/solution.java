class Solution {
    public int numIdenticalPairs(int[] nums) {

        int count = 0;
        int[] map = new int[101];

        for(int num : nums){
            map[num]++;
        }

        for(int freq : map){
            count += (freq * (freq-1)) / 2;
        }

        return count;
    }
}