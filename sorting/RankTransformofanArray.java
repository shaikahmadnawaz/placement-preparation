import java.util.*;

class Solution {
  public int[] arrayRankTransform(int[] arr) {
    int[] sorted = arr.clone();
    Arrays.sort(sorted);
    Map<Integer, Integer> rank = new HashMap<>();
    int r = 1;
    for (int i : sorted) {
      if (!rank.containsKey(i)) {
        rank.put(i, r++);
      }
    }
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = rank.get(arr[i]);
    }
    return result;
  }
}