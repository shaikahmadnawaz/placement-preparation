import java.util.*;

public class OperationsBinaryString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(solve(s));
    sc.close();
  }

  public static int solve(String s) {
    if (s == null)
      return -1;
    int res = s.charAt(0) - '0';
    for (int i = 1; i < s.length();) {
      char prev = s.charAt(i);
      i++;
      if (prev == 'A')
        res = res & (s.charAt(i) - '0');
      else if (prev == 'B')
        res = res | (s.charAt(i) - '0');
      else
        res = res ^ (s.charAt(i) - '0');
      i++;
    }
    return res;
  }
}