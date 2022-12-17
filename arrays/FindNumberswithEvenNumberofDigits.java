class Solution {
  public int findNumbers(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (isEven(num)) {
        count++;
      }
    }
    return count;
  }

  public static boolean isEven(int num) {
    int noOfDigits = digits(num);
    return noOfDigits % 2 == 0;
  }

  public static int digits(int num) {
    if (num < 0) {
      num = num * -1;
    }
    // if(num==0){
    // return 1;
    // }
    // int count = 0;
    // while(num>0){
    // count++;
    // num = num/10;
    // }
    // return count;
    return (int) (Math.log10(num)) + 1;
  }
}