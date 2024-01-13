public class NoOfZeroes {
  public static void main(String[] args) {
    System.out.println(noOfZeroes(100));
  }

  static int noOfZeroes(int n) {
    if (n == 0) {
      return 0;
    }
    if (n % 10 == 0) {
      return 1 + noOfZeroes(n / 10);
    }
    return noOfZeroes(n / 10);
  }
}
