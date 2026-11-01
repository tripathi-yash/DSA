class Solution {
    public int finalValueAfterOperations(String[] operations) {

       int X = 0;

       for(int i=0; i<operations.length; i++){
            
            if("--X".equals(operations[i])) --X;
            if("X--".equals(operations[i])) X--;
            if("++X".equals(operations[i])) ++X;
            if("X++".equals(operations[i])) X++;
       } 

       return X;
    }
}