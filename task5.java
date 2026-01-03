public class task5 {
    public static void printDiamond(int s) {
        if (s < 1 || s % 2 == 0) return;

        for (int i = 0; i < s; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int row = 1; row < s / 2; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int space = 0; space < s - 2 * row - 2; space++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int space = 0; space < s / 2; space++) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int row = s / 2 - 1; row >= 1; row--) {
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int space = 0; space < s - 2 * row - 2; space++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < s; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printDiamond(9);
    }
}