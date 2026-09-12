class Solution {

    public boolean isSafe(char[][] board, int row, int col) {

        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal left
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonal right
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void nQueen(char[][] board, int row, List<List<String>> ans) {

        // Base condition
        if (row == board.length) {

            List<String> solution = new ArrayList<>();

            for (int i = 0; i < board.length; i++) {
                solution.add(new String(board[i]));
            }

            ans.add(solution);
            return;
        }

        // Column loop
        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {

                // Place Queen
                board[row][j] = 'Q';

                // Recursive call
                nQueen(board, row + 1, ans);

                // Backtracking
                board[row][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        // Initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();

        nQueen(board, 0, ans);

        return ans;
    }
}