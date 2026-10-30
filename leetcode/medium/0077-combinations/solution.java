class Solution {

    public void solve(int idx, int n, int k, List<Integer> curr, List<List<Integer>> ans){
 
        if(curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=idx; i<=n; i++){
            curr.add(i);
            solve(i+1,n,k,curr,ans);
            curr.remove(curr.size()-1);
        }

    }
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>(); // final answer

        List<Integer> curr = new ArrayList<>(); // temp list to store combinations
        solve(1,n,k,curr,ans);

        return ans;
    }
}