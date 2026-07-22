import java.util.*;

class TopKLargestDemo {

    static List<Integer> topK(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {

            if (minHeap.size() < k)
                minHeap.offer(num);

            else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }

        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {

        int[] arr = {5, 10, 2, 8, 15, 1, 20};

        System.out.println(topK(arr, 3));
    }
}