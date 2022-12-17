import java.util.*;

class Solution {
  public int numIdenticalPairs(int[] nums) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    int ans = 0;
    for (int friend : nums) {
      int friendCount = hm.getOrDefault(friend, 0);
      ans += friendCount;
      hm.put(friend, friendCount + 1);
    }
    return ans;
  }
}