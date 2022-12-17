class Solution {
  public int maximumWealth(int[][] accounts) {
    int max = Integer.MIN_VALUE;
    for (int[] a : accounts) {
      int sum = 0;
      for (int b : a) {
        sum = sum + b;
      }
      if (sum > max) {
        max = sum;
      }
    }
    return max;
  }
}