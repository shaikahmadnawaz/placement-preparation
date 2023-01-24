class Solution {
  public boolean isLongPressedName(String name, String typed) {
    int m = name.length(), n = typed.length();
    int i = 0, j = 0;

    while (i < m && j < n) {
      char c1 = name.charAt(i), c2 = typed.charAt(j);
      if (c1 != c2)
        return false; // we are handling different chars, no!

      // count of consecutive c1/c2
      int count1 = 0;
      while (i < m && name.charAt(i) == c1) {
        count1++;
        i++;
      }

      // count of consecutive c1/c2
      int count2 = 0;
      while (j < n && typed.charAt(j) == c2) {
        count2++;
        j++;
      }

      if (count2 < count1)
        return false;
    }

    // they both reach the end
    return i == m && j == n;
  }
}

class Solution1 {
  public boolean isLongPressedName(String name, String typed) {
    int i = 0, m = name.length(), n = typed.length();
    for (int j = 0; j < n; ++j)
      if (i < m && name.charAt(i) == typed.charAt(j))
        ++i;
      else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1))
        return false;
    return i == m;
  }
}