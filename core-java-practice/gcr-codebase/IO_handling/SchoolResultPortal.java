import java.io.*;

public class SchoolResultPortal {
    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true))
        ) {
            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);
                int m3 = Integer.parseInt(data[3]);

                double avg = (m1 + m2 + m3) / 3.0;

                bw.write("Name: " + name);
                bw.newLine();
                bw.write("Average Marks: " + avg);
                bw.newLine();
                bw.write("---------------------");
                bw.newLine();
            }

            System.out.println("Report card generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}