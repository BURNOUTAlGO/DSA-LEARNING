class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == word.charAt(0) && isFound(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isFound(char[][] board, int r, int c, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) {
            return false;
        }
        if (board[r][c] == '*' || board[r][c] != word.charAt(index)) {
            return false;
        }
        char ch = board[r][c];
        board[r][c] = '*';

        if      (  isFound(board, r - 1, c, word, index + 1) //up
                || isFound(board, r, c + 1, word, index + 1) //right
                || isFound(board, r + 1, c, word, index + 1) //down
                || isFound(board, r, c - 1, word, index + 1)) //left 
                {
            return true;
        }
        board[r][c] = ch;
        return false;

    }
}