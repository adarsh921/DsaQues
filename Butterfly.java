public class Butterfly {
    public static void main(String args[]) {
        int n = 4, i, j;
        // UPPER HALF
        // 1st Part
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (i == 3 && j == 2 || i == 4 && (j == 2 || j == 3))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            // Spaces
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (j = 1; j <= i; j++) {
                if (i == 3 && j == 2 || i == 4 && (j == 2 || j == 3))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        // LOWER HALF
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if (i == 3 && j == 2 || i == 4 && (j == 2 || j == 3))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            // Spaces
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (j = 1; j <= i; j++) {
                if (i == 3 && j == 2 || i == 4 && (j == 2 || j == 3))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

    }

}
