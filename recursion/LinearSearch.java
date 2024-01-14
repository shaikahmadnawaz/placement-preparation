public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(linearSearch(arr, 0, 5));
  }

  static int linearSearch(int[] arr, int index, int key) {
    if (index == arr.length) {
      return -1;
    }
    if (arr[index] == key) {
      return index;
    }
    return linearSearch(arr, index + 1, key);
  }
}
