import java.util.Scanner;

public class MovieSeatReservation {

    static int[] seats = {101, 102, 103, 104, 105};

    public static int getSeat(int index) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid seat position: " + index);
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the seat number");

        int num=sc.nextInt();
        int seatNumber = getSeat(num);

        if (seatNumber != -1) {
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("Seat not found.");
        }
    }
}