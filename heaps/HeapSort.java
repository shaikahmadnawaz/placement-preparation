import java.util.Arrays;

public class HeapSort {

  public static void heapSort(int[] arr) {
    int n = arr.length;

    // Build max heap
    for (int i = n / 2 - 1; i >= 0; i--) {
      heapify(arr, n, i);
    }

    // Extract elements from the heap one by one
    for (int i = n - 1; i > 0; i--) {
      // Swap the root (maximum element) with the last element
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;

      // Heapify the reduced heap
      heapify(arr, i, 0);
    }
  }

  private static void heapify(int[] arr, int n, int i) {
    int largest = i;
    int leftChild = 2 * i + 1;
    int rightChild = 2 * i + 2;

    if (leftChild < n && arr[leftChild] > arr[largest]) {
      largest = leftChild;
    }

    if (rightChild < n && arr[rightChild] > arr[largest]) {
      largest = rightChild;
    }

    if (largest != i) {
      // Swap and continue heapifying
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;

      heapify(arr, n, largest);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 12, 11, 13, 5, 6, 7 };

    System.out.println("Original array: " + Arrays.toString(arr));

    heapSort(arr);

    System.out.println("Sorted array: " + Arrays.toString(arr));
  }
}
