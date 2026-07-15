class UndoBuffer {

    private String[] data;
    private int top;

    UndoBuffer(int capacity) {
        data = new String[capacity];
        top = -1;
    }

    boolean push(String edit) {
        if (top == data.length - 1) {
            System.out.println("Stack Overflow");
            return false;
        }

        data[++top] = edit;
        return true;
    }

    String pop() {
        if (isEmpty())
            throw new RuntimeException("Nothing to Undo");

        return data[top--];
    }

    String peek() {
        if (isEmpty())
            throw new RuntimeException("Stack Empty");

        return data[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        UndoBuffer stack = new UndoBuffer(5);

        stack.push("Edit1");
        stack.push("Edit2");
        stack.push("Edit3");

        System.out.println("Top : " + stack.peek());

        System.out.println("Undo : " + stack.pop());

        System.out.println("Top : " + stack.peek());
    }
}