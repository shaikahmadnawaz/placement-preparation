import java.util.*;

class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correct = nums[i] - 1;
      if (nums[i] != nums[correct]) {
        swap(nums, i, correct);
      } else {
        i++;
      }
    }
    List<Integer> l = new ArrayList<Integer>();
    for (i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        l.add(i + 1);
      }
    }
    return l;
  }

  void swap(int[] nums, int first, int second) {
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
  }
}