import java.util.*;

public class Duplicate {

    public static boolean hasDuplicateToken(String[] tokens) {
        HashSet<String> set = new HashSet<>();

        for (String token : tokens) {
            if (set.contains(token))
                return true;
            set.add(token);
        }
        return false;
    }

    public static void main(String[] args) {
        String[] tokens = {"abc", "xyz", "abc"};

        System.out.println(hasDuplicateToken(tokens));
    }
}