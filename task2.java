import java.util.Scanner;

public class task2 {  // ← Изменили здесь
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите c: ");
        double c = scanner.nextDouble();

        scanner.close();

        if (a == 0) {
            System.out.println("Не квадратное уравнение");
            return;
        }

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double sqrtD = Math.sqrt(d);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);
            System.out.printf("x1 = %.2f, x2 = %.2f", x1, x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.printf("x = %.2f", x);
        } else {
            System.out.println("Нет действительных корней");
        }
    }
}