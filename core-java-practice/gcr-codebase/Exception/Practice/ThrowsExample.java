 import java.io.IOException;

public class ThrowsExample {

 
 public static void main(String[] args) {
        try {
            methodWithThrows();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    static void methodWithThrows() throws IOException {
        throw new IOException("Example IOException");
    }
}
