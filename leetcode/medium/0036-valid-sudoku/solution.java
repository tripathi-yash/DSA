class Solution {

    public boolean unique(char[][] board, int[] indices){

        int lastRowIdx = indices[0];
        int lastColIdx = indices[1];

        for(int currRowIdx = indices[0] - 3; currRowIdx < lastRowIdx; currRowIdx++){

            for(int currColIdx = indices[1] - 3; currColIdx < lastColIdx; currColIdx++){
                
                char currVal;
                if(board[currRowIdx][currColIdx] != '.'){

                    currVal = board[currRowIdx][currColIdx];

                    for(int i = indices[0] - 3 ; i < lastRowIdx; i++){

                        for(int k = indices[1] - 3 ; k < lastColIdx; k++){

                            if( (currVal == board[i][k]) && (i != currRowIdx || k != currColIdx) ){
                                return false;
                            }  
                        }
                    }

                }
            }
        }

        return true;
    }

    public boolean unique(char[] arr){

        for(int i=0; i<arr.length; i++){

            char val = arr[i];
            for(int j=0; j<arr.length; j++){
                
                if( arr[i] != '.' && (i != j) && (arr[j] == val)){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        
        // row check
        for(int i=0; i<9; i++){

            char[] arr = new char[board.length];
            for(int j=0; j<9; j++){
                
                arr[j] = board[i][j]; 
            }
            if(!unique(arr)){
                return false;
            }
        }

        // column check
        for(int i=0; i<9; i++){

            char[] arr = new char[board.length];

            for(int j=0; j<9; j++){
                
                arr[j] = board[j][i]; 
            }
            if(!unique(arr)){
                return false;
            }
        }

        // 3 * 3 matrix check
        int[][] indices = {{3,3},{3,6},{3,9},{6,3},{6,6},{6,9},{9,3},{9,6},{9,9}};
        
        for(int i=0; i<9; i++){

            int[] currIdxPairs = indices[i];

            if(!unique(board,currIdxPairs)){
                return false;
            }
        }

        return true;
    }
}