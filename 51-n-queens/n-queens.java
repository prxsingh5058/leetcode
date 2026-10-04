class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        solve(board, 0, result, n);
        return result;
    }

    void solve(char[][] board, int row, List<List<String>> result, int n) {

        if(row == n) {
            List<String> solution = new ArrayList<>();
            
            for(int i = 0; i < n; i++) {
                solution.add(new String(board[i]));
            }
            result.add(solution);
            return; //recursion + backtracking, come back to last level
        }

        for(int col = 0; col < n; col++) {

            if(isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                solve(board, row + 1, result, n);
                board[row][col] = '.'; //backtracking
            }
        }
    }

    boolean isSafe(char[][] board, int row, int col, int n) {

        //same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }


        //upper left diagonal
        int r = row - 1;
        int c = col - 1;

        while (r >= 0 && c >= 0) {

            if (board[r][c] == 'Q') {
                return false;
            }

            r--;
            c--;
        }


        //upper right diagonal
        r = row - 1;
        c = col + 1;

        while (r >= 0 && c < n) {

            if (board[r][c] == 'Q') {
                return false;
            }

            r--;
            c++;
        }


        return true;
    }
}