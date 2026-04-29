import java.util.*;

public class Longest {
    public static void main(String[] args) {
        int a[] = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> s = new HashSet<>();
        for (int x : a)
            s.add(x);

        int max = 0;

        for (int x : a) {
            if (!s.contains(x - 1)) {
                int y = x, len = 1;

                while (s.contains(y + 1)) {
                    y++;
                    len++;
                }

                max = Math.max(max, len);
            }
        }

        System.out.println(max);
    }
}