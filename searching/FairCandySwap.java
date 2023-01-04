class Solution {
  public int[] fairCandySwap(int[] A, int[] B) {
    int sa = 0, sb = 0;
    for (int i = 0; i < A.length; i++)
      sa += A[i];
    for (int i = 0; i < B.length; i++)
      sb += B[i];
    int diff = (sa - sb) / 2;
    for (int i = 0; i < A.length; i++)
      for (int j = 0; j < B.length; j++)
        if (A[i] - B[j] == diff)
          return new int[] { A[i], B[j] };
    return null;
  }
}