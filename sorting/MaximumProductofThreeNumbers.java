import java.util.*;

class Solution {
  public int maximumProduct(int[] nums) {
    // Arrays.sort(nums);
    // int n = nums.length;
    // int product = Integer.MIN_VALUE;
    // product = nums[n-1] * nums[n-2] * nums[n-3];
    // return product;

    Arrays.sort(nums);
    int n = nums.length;
    int ans = Integer.MIN_VALUE;
    ans = Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
    return ans;
  }
}