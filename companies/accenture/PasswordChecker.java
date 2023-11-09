// You are given a function.
// int CheckPassword(char str[], int n);
// The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
// str is a valid password if it satisfies the below conditions.

// – At least 4 characters
// – At least one numeric digit
// – At Least one Capital Letter
// – Must not have space or slash (/)
// – Starting character must not be a number

import java.util.Scanner;

class PasswordChecker {
  public static int checkPassword(String str, int n) {
    if (n < 4)
      return 0;
    if (str.charAt(0) >= '0' && str.charAt(0) <= '9')
      return 0;
    int num = 0, cap = 0;
    boolean hasSpaceOrSlash = false;
    for (int i = 0; i < n; i++) {
      if (str.charAt(i) == ' ' || str.charAt(i) == '/')
        hasSpaceOrSlash = true;
      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
        cap++;
      if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
        num++;
    }
    if (num > 0 && cap > 0 && !hasSpaceOrSlash)
      return 1;
    else
      return 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(checkPassword(str, str.length()));
    sc.close();
  }
}