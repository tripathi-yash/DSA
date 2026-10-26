class Solution {
    
    public void arrSort(int arr[], int l, int mid, int r){
        
        int[] auxArr = new int[r-l+1];
        int i=l , j = mid+1, k=0;
    
        while(i <= mid && j <= r){
            if(arr[i] < arr[j]){
                auxArr[k] = arr[i++];
            }
            else auxArr[k] = arr[j++];
            k++;
        }
        
        while(i<=mid) auxArr[k++] = arr[i++];
        while(j<=r) auxArr[k++] = arr[j++];
        
        for(int x=0; x<auxArr.length; x++){
            arr[l+x] = auxArr[x];
        }
    }
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) return;
        
        int mid = l + (r - l) / 2;
        
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        
        arrSort(arr, l, mid, r);
    }
}