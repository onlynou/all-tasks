import java.util.Scanner;

public class Task7 {

    public static int[] getArrayFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько чисел в массиве? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Размер должен быть больше 0");
            return null;
        }

        int[] arr = new int[n];

        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void showArray(int[] arr) {
        if (arr == null) {
            System.out.println("Массив пустой");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findLastMinPosition(int[] arr) {
        int pos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[pos]) {
                pos = i;
            }
        }
        return pos;
    }

    public static int findFirstMaxPosition(int[] arr) {
        int pos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[pos]) {
                pos = i;
            }
        }
        return pos;
    }

    public static int solution(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Нужно минимум 2 числа");
            return 0;
        }

        int minPos = findLastMinPosition(arr);
        int maxPos = findFirstMaxPosition(arr);

        System.out.println("Последний минимум: позиция " + minPos + ", значение " + arr[minPos]);
        System.out.println("Первый максимум: позиция " + maxPos + ", значение " + arr[maxPos]);

        int start, end;
        if (minPos < maxPos) {
            start = minPos;
            end = maxPos;
        } else {
            start = maxPos;
            end = minPos;
        }

        int sum = 0;
        System.out.print("Числа между ними: ");
        for (int i = start + 1; i < end; i++) {
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return sum;
    }

    public static void runAllTests() {
        System.out.println("=== ТЕСТЫ ===");

        int[] test1 = {3, 1, 4, 1, 5};
        System.out.print("Тест 1: ");
        showArray(test1);
        System.out.println("Сумма: " + solution(test1));
        System.out.println();

        int[] test2 = {9, 2, 3, 4, 1};
        System.out.print("Тест 2: ");
        showArray(test2);
        System.out.println("Сумма: " + solution(test2));
        System.out.println();

        int[] test3 = {5, 5, 5, 5};
        System.out.print("Тест 3: ");
        showArray(test3);
        System.out.println("Сумма: " + solution(test3));
        System.out.println();

        int[] test4 = {10, 1};
        System.out.print("Тест 4: ");
        showArray(test4);
        System.out.println("Сумма: " + solution(test4));
        System.out.println();

        int[] test5 = {1, 100, 2, 3, -1};
        System.out.print("Тест 5: ");
        showArray(test5);
        System.out.println("Сумма: " + solution(test5));
        System.out.println();

        int[] test6 = {0, 10, 0, 5};
        System.out.print("Тест 6: ");
        showArray(test6);
        System.out.println("Сумма: " + solution(test6));
        System.out.println();

        int[] test7 = {2, 1, 3};
        System.out.print("Тест 7: ");
        showArray(test7);
        System.out.println("Сумма: " + solution(test7));
        System.out.println();

        int[] test8 = {-5, -1, -10};
        System.out.print("Тест 8: ");
        showArray(test8);
        System.out.println("Сумма: " + solution(test8));
        System.out.println();

        int[] test9 = {-10, 5, -3, 8};
        System.out.print("Тест 9: ");
        showArray(test9);
        System.out.println("Сумма: " + solution(test9));
        System.out.println();

        int[] test10 = {42};
        System.out.print("Тест 10: ");
        showArray(test10);
        System.out.println("Сумма: " + solution(test10));
        System.out.println();
    }

    public static void userInputMode() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== ВВОД ПОЛЬЗОВАТЕЛЯ ===");
            System.out.println("1. Ввести массив");
            System.out.println("2. Назад");
            System.out.print("Выберите: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                int[] arr = getArrayFromUser();
                if (arr != null) {
                    System.out.print("Ваш массив: ");
                    showArray(arr);
                    int result = solution(arr);
                    System.out.println("Сумма элементов между ними: " + result);
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Неправильный выбор");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ПРОГРАММА: Сумма между последним минимумом и первым максимумом");

        while (true) {
            System.out.println("\n=== ГЛАВНОЕ МЕНЮ ===");
            System.out.println("1. Запустить все тесты");
            System.out.println("2. Ввести свой массив");
            System.out.println("3. Выход");
            System.out.print("Выберите: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                runAllTests();
            } else if (choice == 2) {
                userInputMode();
            } else if (choice == 3) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Неправильный выбор");
            }
        }
    }
}