public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            divide(10, 0); // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("Rest of the code executes...");
    }

    // No `throws` keyword needed for unchecked exceptions
    public static void divide(int a, int b) {
        if (b == 0) {
            // Throwing an ArithmeticException
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println("Result: " + (a / b));
    }
}

