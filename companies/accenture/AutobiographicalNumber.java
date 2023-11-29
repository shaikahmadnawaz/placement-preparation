import java.util.Scanner;

public class AutobiographicalNumber {

    public static int findAutoCount(String n) {
        int sum = 0;
        int[] digitCount = new int[10];

        for (int i = 0; i < n.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(n.charAt(i)));
            sum += digit;
            digitCount[digit]++;
        }

        if (sum == n.length()) {
            int count = 0;
            for (int i : digitCount) {
                if (i != 0) {
                    count++;
                }
            }
            return count;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String str = sc.next();
        System.out.println("Output: " + findAutoCount(str));
    }
}
