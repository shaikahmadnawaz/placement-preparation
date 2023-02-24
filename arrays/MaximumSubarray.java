class Solution {
  public int maxSubArray(int[] arr) {
    int n = arr.length;
    if (n == 0) {
      return 0;
    }

    int max = Integer.MIN_VALUE;
    int cur_max = 0;

    for (int i = 0; i < n; i++) {
      cur_max += arr[i];
      if (cur_max > max) {
        max = cur_max;
      }
      if (cur_max < 0) {
        cur_max = 0;
      }
    }
    return max;
  }
}