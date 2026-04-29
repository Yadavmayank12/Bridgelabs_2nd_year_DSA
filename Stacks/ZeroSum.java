import java.util.*;

public class ZeroSum {
    public static void main(String[] args) {
        int a[] = {3, -1, -2, 4, -4, 2};

        HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum == 0)
                System.out.println("0 to " + i);

            if (m.containsKey(sum)) {
                for (int x : m.get(sum))
                    System.out.println((x + 1) + " to " + i);
            }

            m.putIfAbsent(sum, new ArrayList<>());
            m.get(sum).add(i);
        }
    }
}