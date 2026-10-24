class Solution {
    public int numIdenticalPairs(int[] nums) {

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        for(int freq : map.values()){
            count += (freq * (freq-1)) / 2;
        }

        return count;
    }
}