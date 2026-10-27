class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        int count = 1, maxCount = 1;
        int maxEl = arr[0], lastSeen = arr[0];
        
        for(int i=1; i<arr.length; i++){
            
            if(arr[i] == lastSeen){
                count++;
            }
            else{
                count = 1;
            }
            
            if(count >= maxCount){
            
                maxEl = Math.max(arr[i], maxEl);  
                maxCount = count;
            }
            
            lastSeen = arr[i];
        }
        
        return maxEl;
    }
}