
public class MaxHeap {
  private int[] heap;
  private int size;
  private int capacity;

  public MaxHeap(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.heap = new int[capacity];
  }

  private int getParentIndex(int index) {
    return (index - 1) / 2;
  }

  private int getLeftChildIndex(int index) {
    return 2 * index + 1;
  }

  private int getRightChildIndex(int index) {
    return 2 * index + 2;
  }

  private void swap(int index1, int index2) {
    int temp = heap[index1];
    heap[index1] = heap[index2];
    heap[index2] = temp;
  }

  private void heapifyUp() {
    int index = size - 1;
    while (index > 0 && heap[index] > heap[getParentIndex(index)]) {
      swap(index, getParentIndex(index));
      index = getParentIndex(index);
    }
  }

  private void heapifyDown() {
    int index = 0;
    while (getLeftChildIndex(index) < size) {
      int largerChildIndex = getLeftChildIndex(index);
      int rightChildIndex = getRightChildIndex(index);

      if (rightChildIndex < size && heap[rightChildIndex] > heap[largerChildIndex]) {
        largerChildIndex = rightChildIndex;
      }

      if (heap[index] > heap[largerChildIndex]) {
        break;
      } else {
        swap(index, largerChildIndex);
      }

      index = largerChildIndex;
    }
  }

  public void insert(int value) {
    if (size == capacity) {
      throw new IllegalStateException("Heap is full");
    }

    heap[size] = value;
    size++;
    heapifyUp();
  }

  public int extractMax() {
    if (size == 0) {
      throw new IllegalStateException("Heap is empty");
    }

    int max = heap[0];
    heap[0] = heap[size - 1];
    size--;
    heapifyDown();

    return max;
  }

  public static void main(String[] args) {
    MaxHeap maxHeap = new MaxHeap(10);

    maxHeap.insert(4);
    maxHeap.insert(2);
    maxHeap.insert(7);
    maxHeap.insert(1);
    maxHeap.insert(9);

    System.out.println("Max Heap: ");
    while (maxHeap.size > 0) {
      System.out.print(maxHeap.extractMax() + " ");
    }
  }
}
