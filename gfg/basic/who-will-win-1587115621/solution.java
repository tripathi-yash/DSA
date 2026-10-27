class Solution {
    
    public int helper(int[] arr, int target,int left, int right){
        
        if(right < left) return -1;
        
        int mid = left + (right -left) / 2;
        
        if(arr[mid] == target) return mid;
        
        if(arr[mid] > target) return helper(arr, target, left, mid -1);
        
        else return helper(arr, target, mid+1 , right);
        
    }
    
    public int binarySearch(int[] arr, int k) {
        // code here
        
        int ans = helper(arr, k , 0 , arr.length-1);
        
        return ans;
    }
}