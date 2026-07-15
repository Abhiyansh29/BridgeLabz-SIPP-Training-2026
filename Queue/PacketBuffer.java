class PacketBuffer {

    private int[] data;
    private int front;
    private int count;

    PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    boolean enqueue(int packetId) {

        if (count == data.length) {
            System.out.println("Buffer Full");
            return false;
        }

        int rear = (front + count) % data.length;
        data[rear] = packetId;
        count++;
        return true;
    }

    int dequeue() {

        if (count == 0)
            throw new RuntimeException("Buffer Empty");

        int value = data[front];

        front = (front + 1) % data.length;

        count--;

        return value;
    }

    void display() {

        System.out.print("Queue : ");

        for (int i = 0; i < count; i++) {
            System.out.print(data[(front + i) % data.length] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        PacketBuffer q = new PacketBuffer(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Removed : " + q.dequeue());

        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);

        q.display();
    }
}