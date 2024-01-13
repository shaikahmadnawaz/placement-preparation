public class Palindrome {
  public static void main(String[] args) {
    System.out.println(isPalindrome(12321));
  }

  static boolean isPalindrome(int n) {
    if (n == 0) {
      return true;
    }
    return n % 10 == (n / (int) Math.pow(10, (int) Math.log10(n)))
        && isPalindrome((n % (int) Math.pow(10, (int) Math.log10(n))) / 10);
  }
}
