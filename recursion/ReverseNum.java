public class ReverseNum {
  public static void main(String[] args) {
    System.out.println(reverseNum(12345));
  }

  static int reverseNum(int n) {
    if (n == 0) {
      return 0;
    }
    System.out.println(n);
    System.out.println(n / 10);
    System.out.println((int) Math.log10(n));
    System.out.println((int) Math.pow(10, (int) Math.log10(n)));
    System.out.println(n % 10 * (int) Math.pow(10, (int) Math.log10(n)));
    return n % 10 * (int) Math.pow(10, (int) Math.log10(n)) + reverseNum(n / 10);
  }
}
