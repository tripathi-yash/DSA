class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxWords = 0;

        for(int i=0; i<sentences.length; i++){

            String[] newArr = sentences[i].split(" ");
            maxWords = Math.max(newArr.length, maxWords);
        }

        return maxWords;
    }
}