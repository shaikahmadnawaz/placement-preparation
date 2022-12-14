class Solution {
  public int rob(int[] num) {

    int last = 0;
    int now = 0;
    int tmp;
    for (int n : num) {
      tmp = now;
      now = Math.max(last + n, now);
      last = tmp;
    }
    return now;
  }
}