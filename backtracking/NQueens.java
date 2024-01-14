public class NQueens {
  public static void main(String[] args) {
    int n = 4;
    int[][] board = new int[n][n];
    System.out.println(count(n, board));
  }

  static int count(int n, int[][] board) {
    if (n == 0) {
      printBoard(board);
      return 1;
    }

    int count = 0;
    for (int i = 0; i < board.length; i++) {
      if (isSafe(board, i, n - 1)) {
        board[i][n - 1] = 1;
        count += count(n - 1, board);
        board[i][n - 1] = 0;
      }
    }

    return count;
  }

  static boolean isSafe(int[][] board, int row, int col) {
    // Check this row on left side
    for (int i = 0; i < col; i++) {
      if (board[row][i] == 1) {
        return false;
      }
    }

    // Check upper diagonal on left side
    for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 1) {
        return false;
      }
    }

    // Check lower diagonal on left side
    for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
      if (board[i][j] == 1) {
        return false;
      }
    }

    return true;
  }

  static void printBoard(int[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
