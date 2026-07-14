class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAfter {

    static void insertAfter(Node current, int value) {
        if (current == null) return;

        Node newNode = new Node(value);

        // Save remaining list
        newNode.next = current.next;

        // Insert new node
        current.next = newNode;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);

        insertAfter(head.next, 30);

        display(head);
    }
}