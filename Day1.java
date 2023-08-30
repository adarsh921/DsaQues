import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m, d;
        System.out.println("Enter number of days");
        n = in.nextInt();
        m = n / 30;
        d = n % 30;
        System.out.println(m);
        System.out.println(d);

    }

}
