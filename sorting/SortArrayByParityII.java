class Solution {
  public int[] sortArrayByParityII(int[] A) {
    int even = 0, odd = 1;
    while (true) {
      while (even < A.length && A[even] % 2 == 0) /* (1) */
        even += 2;
      while (odd < A.length && A[odd] % 2 != 0) /* (2) */
        odd += 2;
      if (odd >= A.length || even >= A.length)
        return A;

      /* (3) */
      int temp = A[even];
      A[even] = A[odd];
      A[odd] = temp;
    }
  }
}