import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Завдання 1
        String phrase = "Java крута мова програмування";

        // Виведення фрази 50 разів використовуючи цикл for
        System.out.println("Виведення фрази 50 разів використовуючи цикл for:");
        for (int i = 0; i < 50; i++) {
            System.out.println(phrase);
        }

        // Виведення фрази 50 разів використовуючи цикл while
        System.out.println("\nВиведення фрази 50 разів використовуючи цикл while:");
        int count = 0;
        while (count < 50) {
            System.out.println(phrase);
            count++;
        }

        // Завдання 2
        System.out.println("\nВиведення часу від 0 h 0 min до 2 h 59 min використовуючи цикл for:");
        for (int hour = 0; hour < 3; hour++) {
            for (int min = 0; min < 60; min++) {
                System.out.printf("%d h %d min%n", hour, min);
            }
        }

        // Завдання 3
        System.out.println("\nВиведення часу від 0 h 0 min до 2 h 59 min використовуючи цикл while:");
        int hour = 0;
        int min = 0;
        while (hour < 3) {
            while (min < 60) {
                System.out.printf("%d h %d min%n", hour, min);
                min++;
            }
            min = 0;
            hour++;
        }

        // Завдання 4
        System.out.println("\nВиведення часу від 0 h 0 min 0 sec до 2 h 59 min 59 sec використовуючи цикл for:");
        for (int h = 0; h < 3; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    System.out.printf("%d h %d min %d sec%n", h, m, s);
                }
            }
        }

        // Завдання 5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть мінімальну межу діапазону: ");
        double minRange = scanner.nextDouble();
        System.out.print("Введіть максимальну межу діапазону: ");
        double maxRange = scanner.nextDouble();

        // Використання циклу for для табуляції функції
        int countFor = 0;
        for (double x = 0; x <= 2; x += 0.1) {
            double fx = Math.sin(x * x) + Math.cos(x * x) - 10 * x;
            if (fx >= minRange && fx <= maxRange) {
                countFor++;
            }
        }

        // Використання циклу while для табуляції функції
        int countWhile = 0;
        double x = 0;
        while (x <= 2) {
            double fx = Math.sin(x * x) + Math.cos(x * x) - 10 * x;
            if (fx >= minRange && fx <= maxRange) {
                countWhile++;
            }
            x += 0.1;
        }

        System.out.printf("Кількість значень функції в діапазоні [%.2f, %.2f] використовуючи for: %d%n", minRange, maxRange, countFor);
        System.out.printf("Кількість значень функції в діапазоні [%.2f, %.2f] використовуючи while: %d%n", minRange, maxRange, countWhile);

        if (countFor == 0 && countWhile == 0) {
            System.out.println("Жодне значення функції не знаходиться в заданому діапазоні.");
        }
    }
}