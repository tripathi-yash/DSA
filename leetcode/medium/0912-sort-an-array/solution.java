class Solution {

    public void merge(int[] arr, int left, int mid, int right){

        int i=left, j= mid+1, k=0;
        int[] aux = new int[right - left + 1];

        while(i <= mid && j <= right){

            if(arr[i] <= arr[j]){
                aux[k++] = arr[i++];
            }
            else aux[k++] = arr[j++];
        }

        while(i <= mid) aux[k++] = arr[i++];
        while(j <= right) aux[k++] = arr[j++];

        for(int idx=left; idx<=right; idx++){
            arr[idx] = aux[idx-left];
        }
    }

    public void mergeSort(int[] arr,int left,int right){

        if(left >= right ) return;

        int mid = left + (right-left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }

    public int[] sortArray(int[] nums) {
        
        mergeSort(nums, 0, nums.length-1);

        return nums;
    }
}