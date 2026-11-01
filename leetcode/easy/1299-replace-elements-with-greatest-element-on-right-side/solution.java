class Solution {
    public int[] replaceElements(int[] arr) {
        
        int temp = arr[arr.length-1];
        int[] ans = new int[arr.length];
        ans[ans.length-1] = -1;

        for(int i=arr.length-1; i>0; i--){

            ans[i-1] = Math.max(ans[i], arr[i]);
        }

        return ans;
    }
}