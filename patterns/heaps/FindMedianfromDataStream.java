import java.util.PriorityQueue;

class MedianFinder {
  private PriorityQueue<Integer> maxHeap;
  private PriorityQueue<Integer> minHeap;

  public MedianFinder() {
    maxHeap = new PriorityQueue<>((a, b) -> b - a);
    minHeap = new PriorityQueue<>();
  }

  public void addNum(int num) {
    maxHeap.offer(num);

    minHeap.offer(maxHeap.poll());

    if (maxHeap.size() < minHeap.size()) {
      maxHeap.offer(minHeap.poll());
    }

  }

  public double findMedian() {
    if (maxHeap.size() == minHeap.size()) {
      return (maxHeap.peek() + minHeap.peek()) / 2.0;
    } else {
      return maxHeap.peek();
    }
  }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */