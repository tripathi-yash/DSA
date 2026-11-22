class Solution {
    public boolean checkString(String s) {
        
        char[] arr = s.toCharArray();

        boolean foundB = false;

        for(int i=0; i<arr.length; i++){

            if(!foundB && arr[i] == 'b') foundB = true;
            if(foundB && arr[i] == 'a') return false;
        }

        return true;
    }
}