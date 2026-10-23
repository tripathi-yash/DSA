class Solution {

    public void solver(int[] nums, int i, List<List<Integer>> ans, List<Integer> subset){

        if(i == nums.length) {
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        solver(nums, i+1, ans, subset);
        subset.remove(subset.size()-1);
        solver(nums, i+1, ans, subset);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        solver(nums, 0, ans, subset);
        return ans;
    }
}