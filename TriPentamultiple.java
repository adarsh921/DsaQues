import java.util.*;

class TriPentamultiple {
    public static void main(String args[]) {
        int i, n = 1000000000, s = 0;
        for (i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                s = s + i;
        }
        System.out.println(s);
    }
}