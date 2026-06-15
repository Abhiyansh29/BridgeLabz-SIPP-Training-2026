public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        int sum = 0, min = arr[0], max = arr[0];
        for (int n : arr) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        double avg = sum / (double) arr.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);

        System.out.print("Numbers: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        double[] stats = findAverageMinMax(arr);
        System.out.println("Average = " + stats[0]);
        System.out.println("Min = " + stats[1]);
        System.out.println("Max = " + stats[2]);
    }
}
