class Solution {
    public int minRange(int a, int b, int c) {
        
        int[] arr = {a,b,c};
        Arrays.sort(arr);

        int x = arr[0];
        int y = arr[1];
        int z = arr[2];

        int diff = z - x;
        
        return Math.min(y,diff);
    }
}