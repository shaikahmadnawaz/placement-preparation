class Solution {
  public int minCostToMoveChips(int[] position) {
    int evenPosTowerChips = 0;
    int oddPosTowerChips = 0;
    for (int i : position) {
      if (i % 2 == 0) {
        evenPosTowerChips++;
      } else {
        oddPosTowerChips++;
      }
    }
    return Math.min(oddPosTowerChips, evenPosTowerChips);
  }
}