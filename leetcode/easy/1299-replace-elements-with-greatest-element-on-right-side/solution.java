class Solution {
    public int[] replaceElements(int[] arr) {
        
        // int[] ans = new int[arr.length];
        // ans[ans.length-1] = -1;

        // for(int i=arr.length-1; i>0; i--){

        //     ans[i-1] = Math.max(ans[i], arr[i]);
        // }

        // return ans;

        int maxSoFar = -1;

        for(int i=arr.length-1; i>=0; i--){

            int curr = arr[i];
            arr[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar,curr);
        }

        return arr;
    }
}