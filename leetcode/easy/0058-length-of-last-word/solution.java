class Solution {
    public int lengthOfLastWord(String s) {
        
        int ansLen = 0;

        for(int i=s.length()-1; i>=0; i--){
            
            char ch = s.charAt(i);
            if(ch != ' '){
                ansLen++;
            }else if(ansLen > 0) break;
        }

        return ansLen;
    }
}