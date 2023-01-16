import java.util.*;

class Solution {
  public int maxProduct(int[] nums) {
    int n = nums.length - 1;
    Arrays.sort(nums);
    int max = ((nums[n] - 1) * (nums[n - 1] - 1));
    return max;
  }
}