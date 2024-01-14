public class Maze {
  public static void main(String[] args) {
    int r = 3, c = 3;
    System.out.println(count(r, c));
  }

  static int count(int r, int c) {
    if (r == 1 || c == 1)
      return 1;

    int left = count(r - 1, c);
    int right = count(r, c - 1);

    return left + right;
  }
}
