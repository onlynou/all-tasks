import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double e = scanner.nextDouble();
        scanner.close();

        if (Math.abs(x) >= 1) return;

        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double an = 1;

        for (int i = 0; i < n; i++) {
            sum1 += an;
            if (Math.abs(an) > e) sum2 += an;
            if (Math.abs(an) > e/10) sum3 += an;
            an = -an * x;
        }

        System.out.printf("%.6f%n", sum1);
        System.out.printf("%.6f%n", sum2);
        System.out.printf("%.6f%n", sum3);
        System.out.printf("%.6f%n", 1.0/(1 + x));
    }
}