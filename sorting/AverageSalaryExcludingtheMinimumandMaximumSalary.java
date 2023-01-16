class Solution {
  public double average(int[] salary) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int i : salary) {
      min = Math.min(min, i);
      max = Math.max(max, i);
      sum += i;
    }
    return (double) (sum - min - max) / (salary.length - 2);
  }
}