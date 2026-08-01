class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        boolean [][] board = new boolean[n][n];
        queens(board,0);
        return ans;
    }
    void queens(boolean[][] board , int row){
        if(row==board.length){
            ans.add(display(board));
            return;
        }
        for( int col = 0 ; col<board.length ; col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                queens(board,row+1);
                board[row][col]=false;
            }

        }
    }
    public static boolean isSafe(boolean[][]board , int row , int col){
        //checking vertical upwards
        for(int i = 0 ; i<row ; i++){
            if(board[i][col]){
                return false;
            }
        }
        //checking diagonal leftwards 
        int maxLeft = Math.min(row,col);
        for(int i =1 ; i<=maxLeft ; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //checking diagonal rightwards
        int maxRight = Math.min(row, board.length-col-1);
        for(int i = 1 ; i<=maxRight ; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    List<String> display(boolean[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";

            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == true) {
                    row += "Q";
                } else {
                    row += ".";
                }
            }

            res.add(row);
        }
        return res;
    }


}