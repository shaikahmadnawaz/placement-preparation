public class NTo1 {
  public static void main(String[] args) {
    printNToOne(5);
    printOneToN(5);
    funBoth(5);
  }

  // Here it is keeping the calls into the recursion stack
  static void printNToOne(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    printNToOne(n - 1);
  }

  // Here it is printing the values while coming out of the recursion stack
  static void printOneToN(int n) {
    if (n == 0) {
      return;
    }
    printOneToN(n - 1);
    System.out.println(n);
  }

  static void funBoth(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    funBoth(n - 1);
    System.out.println(n);
  }
}
