import java.util.Scanner;

public class CinemaSeatAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int n = sc.nextInt();

        int[] seats = new int[n];

        System.out.println("Enter seat status (0=Empty, 1=Booked):");

        for(int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }

        int booked = 0;
        int available = 0;

        int maxLength = 0;
        int currentLength = 0;

        int start = -1;
        int end = -1;
        int tempStart = -1;

        for(int i = 0; i < n; i++) {

            if(seats[i] == 0) {

                available++;

                if(currentLength == 0) {
                    tempStart = i;
                }

                currentLength++;

                if(currentLength > maxLength) {
                    maxLength = currentLength;
                    start = tempStart;
                    end = i;
                }
            }
            else {

                booked++;
                currentLength = 0;
            }
        }

        System.out.println("\nBooked Seats: " + booked);
        System.out.println("Available Seats: " + available);

        System.out.println("Longest Available Block:");
        System.out.println("Start Position: " + (start + 1));
        System.out.println("End Position: " + (end + 1));
        System.out.println("Length: " + maxLength);

        if(maxLength >= 5) {
            System.out.println("Group of 5 people CAN sit together.");
        }
        else {
            System.out.println("Group of 5 people CANNOT sit together.");
        }

        sc.close();
    }
}