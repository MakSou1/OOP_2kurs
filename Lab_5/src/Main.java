public class Main {

    // Метод для обчислення та повернення площі ромба
    public static double calculateRhombusArea(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

    // Метод, що приймає три числа, виводить та повертає найменше
    public static int findMinimum(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Найменше число: " + min);
        return min;
    }

    // Метод, що виводить масив
    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    // Метод, що повертає найбільше число з масиву
    public static int findMaximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Приклади використання методів
        double area = calculateRhombusArea(5, 6);
        System.out.println("Площа ромба: " + area);

        int min = findMinimum(10, 5, 8);
        System.out.println("Найменше число: " + min);

        int[] array = {5, 3, 8, 1, 9};
        printArray(array);

        int max = findMaximum(array);
        System.out.println("Найбільше число в масиві: " + max);
    }
}