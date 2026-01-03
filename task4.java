import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        scanner.close();

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            long product = 1;
            for (int j = i; j <= 2 * i; j++) {
                product *= j;
            }
            sum += product;
        }

        System.out.println("Сумма = " + sum);
    }
}