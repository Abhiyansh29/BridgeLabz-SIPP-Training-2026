import java.util.Scanner;

public class WarehouseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== STOCK ARRAY =====
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] stock = new int[n];

        System.out.println("Enter item quantities:");
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        // Find max, min, total
        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int i = 0; i < n; i++) {
            if (stock[i] > max)
                max = stock[i];

            if (stock[i] < min)
                min = stock[i];

            total += stock[i];
        }

        System.out.println("\nMaximum Stock = " + max);
        System.out.println("Minimum Stock = " + min);
        System.out.println("Total Stock = " + total);

        // Detect duplicates
        System.out.println("\nDuplicate Quantities:");

        boolean duplicateFound = false;

        for (int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (stock[i] == stock[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted)
                continue;

            for (int j = i + 1; j < n; j++) {
                if (stock[i] == stock[j]) {
                    System.out.println(stock[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicates Found");
        }

        // ===== ARRAY ROTATION =====
        System.out.print("\nEnter rotation value k: ");
        int k = sc.nextInt();

        k = k % n;

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }

        System.out.println("Rotated Stock Array:");

        for (int value : rotated) {
            System.out.print(value + " ");
        }

        // ===== 2D SHELF GRID =====
        System.out.print("\n\nEnter rows of shelf grid: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns of shelf grid: ");
        int cols = sc.nextInt();

        int[][] shelf = new int[rows][cols];

        System.out.println("Enter shelf values:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                shelf[i][j] = sc.nextInt();
            }
        }

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = shelf[i][j];
            }
        }

        System.out.println("\nTranspose of Shelf Grid:");

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}