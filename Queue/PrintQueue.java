import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {

    Deque<Integer> queue = new ArrayDeque<>();

    void submitJob(int jobId) {
        queue.addLast(jobId);
    }

    void submitUrgentJob(int jobId) {
        queue.addFirst(jobId);
    }

    int printNextJob() {
        return queue.removeFirst();
    }

    void display() {
        System.out.println(queue);
    }

    public static void main(String[] args) {

        PrintQueue p = new PrintQueue();

        p.submitJob(101);
        p.submitJob(102);

        p.submitUrgentJob(999);

        p.submitJob(103);

        p.display();

        System.out.println("Printing : " + p.printNextJob());

        p.display();
    }
}