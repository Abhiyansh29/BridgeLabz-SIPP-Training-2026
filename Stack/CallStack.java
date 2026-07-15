class CallStack {

    static class Frame {

        String functionName;
        Frame next;

        Frame(String functionName, Frame next) {
            this.functionName = functionName;
            this.next = next;
        }
    }

    private Frame top = null;

    void push(String name) {
        top = new Frame(name, top);
    }

    String pop() {

        if (isEmpty())
            throw new RuntimeException("Stack Empty");

        String name = top.functionName;

        top = top.next;

        return name;
    }

    String peek() {

        if (isEmpty())
            throw new RuntimeException("Stack Empty");

        return top.functionName;
    }

    boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {

        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("display()");
        stack.push("print()");

        System.out.println("Current Function : " + stack.peek());

        System.out.println("Return : " + stack.pop());

        System.out.println("Current Function : " + stack.peek());
    }
}