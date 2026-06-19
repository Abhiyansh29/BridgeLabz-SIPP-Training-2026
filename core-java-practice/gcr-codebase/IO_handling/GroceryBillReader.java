import java.io.*;

public class GroceryBillReader {
    public static void main(String[] args) {

        int lineCount = 0;

        try {
            FileReader fr = new FileReader("bill.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Contents of bill.txt:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }

            System.out.println("\nTotal Number of Lines = " + lineCount);

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: bill.txt");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}