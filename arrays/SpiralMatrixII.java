class Solution {
  public int[][] generateMatrix(int n) {
    int[][] m = new int[n][n];
    if (n == 0) {
      return m;
    }

    int rs = 0;
    int re = n - 1;
    int cs = 0;
    int ce = n - 1;
    int val = 1;

    while (rs <= re && cs <= ce) {
      for (int i = cs; i <= ce; i++) {
        m[rs][i] = val++;
      }
      rs++;

      for (int i = rs; i <= re; i++) {
        m[i][ce] = val++;
      }
      ce--;

      for (int i = ce; i >= cs; i--) {
        m[re][i] = val++;
      }
      re--;

      for (int i = re; i >= rs; i--) {
        m[i][cs] = val++;
      }
      cs++;
    }
    return m;
  }
}