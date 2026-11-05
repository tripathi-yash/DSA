class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int count = 0;
        Arrays.sort(arr2);

        for(int i=0; i<arr1.length; i++){

            boolean isValid = true;

            int left = 0, right = arr2.length-1;

            while(left <= right){
                
                int mid = left + (right-left) / 2;

                if(Math.abs(arr1[i]-arr2[mid]) <= d) { 
                    isValid = false;
                    break;
                }
                else if(arr2[mid] > arr1[i]) {
                    right = mid-1;
                }
                else left = mid+1;
            }

            if(isValid) count++;
        }

        return count;
    }
}