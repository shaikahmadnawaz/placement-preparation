class Solution {
  public String reverseWords(String s) {
    final int len = s.length(); // saving the length as constant so as to avoid calling s.length() again and
                                // again.

    if (len == 1) // no need to iterate if string is of length 1
      return s;

    int firstIndex, lastIndex;
    char[] ch = s.toCharArray(); // converting the string into it's corresponding character array
    char temp;

    for (int index = 0; index < len; index++) {

      firstIndex = index; // store the first index of word

      while (++index < len && ch[index] != ' ')
        ; // iterate until space is found i.e. to get the last index of the word

      lastIndex = index - 1; // store the last index of the word

      // reverse characters of the word
      while (firstIndex < lastIndex) {
        temp = ch[firstIndex];
        ch[firstIndex++] = ch[lastIndex];
        ch[lastIndex--] = temp;
      }
    }

    return new String(ch); // convert the character into string and return it
  }
}