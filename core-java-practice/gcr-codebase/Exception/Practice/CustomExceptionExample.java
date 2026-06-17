class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or older");
        }
    }
}

