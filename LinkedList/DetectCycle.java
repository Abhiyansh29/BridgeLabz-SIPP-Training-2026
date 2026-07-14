class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DetectCycle {

    static boolean hasRedirectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Create cycle
        head.next.next.next.next = head.next;

        if (hasRedirectLoop(head))
            System.out.println("Cycle Found");
        else
            System.out.println("No Cycle");
    }
}