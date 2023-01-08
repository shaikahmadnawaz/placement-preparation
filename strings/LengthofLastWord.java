package strings;

class Solution {
  public int lengthOfLastWord(String s) {
    String sp = s.trim();
    int count = 0;
    for (int i = sp.length() - 1; i >= 0; i--) {
      if (sp.charAt(i) != ' ') {
        count++;
      } else {
        break;
      }
    }
    return count;
  }
}