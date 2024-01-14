
public class PrintingPaths {
  public static void main(String[] args) {
    int r = 3, c = 3;
    int[][] path = new int[r][c];
    System.out.println(count(r, c, path));
  }

  static int count(int r, int c, int[][] path) {
    if (r == 1 || c == 1) {
      path[r - 1][c - 1] = 1;
      printPath(path);
      return 1;
    }

    int left = count(r - 1, c, path);
    int right = count(r, c - 1, path);

    return left + right;
  }

  static void printPath(int[][] path) {
    for (int i = 0; i < path.length; i++) {
      for (int j = 0; j < path[0].length; j++) {
        System.out.print(path[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
