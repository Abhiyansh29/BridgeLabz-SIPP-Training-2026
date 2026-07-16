import java.util.*;

public class Frequent {

    public static int mostFrequentErrorCode(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = arr[0];
        int max = 0;

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > max) {
                max = map.get(num);
                ans = num;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,2,5,1};

        System.out.println(mostFrequentErrorCode(arr));
    }
}