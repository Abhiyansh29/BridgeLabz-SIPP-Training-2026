import java.util.Scanner;

public class WarehouseStockRecovery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] stock = new int[n];

        int zeroPosition = -1;
        int sum = 0;
        int count = 0;

        System.out.println("Enter stock quantities:");

        for(int i = 0; i < n; i++) {

            stock[i] = sc.nextInt();

            if(stock[i] == 0) {
                zeroPosition = i;
            }
            else {
                sum += stock[i];
                count++;
            }
        }

        int average = sum / count;

        stock[zeroPosition] = average;

        System.out.println("\nMissing Stock Found At Position: "
                + (zeroPosition + 1));

        System.out.println("Average Stock = " + average);

        System.out.println("\nUpdated Inventory:");

        for(int value : stock) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}