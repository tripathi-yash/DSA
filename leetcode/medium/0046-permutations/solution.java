class Solution {

    public void solve(int idx, int[] nums, List<Integer> curr, List<List<Integer>> ans, boolean[] isPresent){

        if(idx == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(isPresent[nums[i]+10]) continue;
            isPresent[nums[i]+10] = true;
            curr.add(nums[i]);

            solve(idx+1, nums,curr, ans, isPresent);
            curr.remove(curr.size()-1);
            isPresent[nums[i]+10] = false;
            
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] isPresent = new boolean[21];

        solve(0,nums, curr, ans, isPresent);
        return ans;
    }
}