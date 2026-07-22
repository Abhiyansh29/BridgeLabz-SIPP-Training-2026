import java.util.PriorityQueue;

class KthLargestDemo {

    static int kthLargest(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {

            if (minHeap.size() < k)
                minHeap.offer(num);

            else if (num > minHeap.peek()) {

                minHeap.poll();
                minHeap.offer(num);
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 6, 4};

        System.out.println(kthLargest(arr, 2));
    }
}