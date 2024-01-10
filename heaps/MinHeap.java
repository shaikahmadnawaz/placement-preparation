public class MinHeap {
  private int[] heap;
  private int size;
  private int capacity;

  public MinHeap(int capacity) {
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
    while (index > 0 && heap[index] < heap[getParentIndex(index)]) {
      swap(index, getParentIndex(index));
      index = getParentIndex(index);
    }
  }

  private void heapifyDown() {
    int index = 0;
    while (getLeftChildIndex(index) < size) {
      int smallerChildIndex = getLeftChildIndex(index);
      int rightChildIndex = getRightChildIndex(index);

      if (rightChildIndex < size && heap[rightChildIndex] < heap[smallerChildIndex]) {
        smallerChildIndex = rightChildIndex;
      }

      if (heap[index] < heap[smallerChildIndex]) {
        break;
      } else {
        swap(index, smallerChildIndex);
      }

      index = smallerChildIndex;
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

  public int extractMin() {
    if (size == 0) {
      throw new IllegalStateException("Heap is empty");
    }

    int min = heap[0];
    heap[0] = heap[size - 1];
    size--;
    heapifyDown();

    return min;
  }

  public static void main(String[] args) {
    MinHeap minHeap = new MinHeap(10);

    minHeap.insert(4);
    minHeap.insert(2);
    minHeap.insert(7);
    minHeap.insert(1);
    minHeap.insert(9);

    System.out.println("Min Heap: ");
    while (minHeap.size > 0) {
      System.out.print(minHeap.extractMin() + " ");
    }
  }
}
