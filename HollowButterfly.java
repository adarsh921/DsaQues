// For any natural number 'n'
public class HollowButterfly {
    public static void main(String args[]) {
        int i, j, n = 15;
        // UPPER HALF
        // 1st part
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if ((i != 1 || i != 2) && (j != 1 && j != i))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            // Spaces
            for (j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");
            // 2nd part
            for (j = 1; j <= i; j++) {
                if ((i != 1 || i != 2) && (j != 1 && j != i))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        // LOWER HALF
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if ((i != 1 || i != 2) && (j != 1 && j != i))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            // Spaces
            for (j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");
            // 2nd part
            for (j = 1; j <= i; j++) {
                if ((i != 1 || i != 2) && (j != 1 && j != i))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

}
