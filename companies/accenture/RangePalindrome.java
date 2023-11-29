import java.util.Scanner;

public class RangePalindrome {
  static int palindrome(int num) {
    int rem = 0;
    int div = num;
    while (div != 0) {
      int r = div % 10;
      rem = (rem * 10) + r;
      div = div / 10;
    }
    return rem;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Upper and Lower Limit");
    int ul = sc.nextInt();
    int ll = sc.nextInt();

    for (int i = ul; i <= ll; i++) {
      if (i == palindrome(i))
        System.out.print(i + " ");
    }
  }
}