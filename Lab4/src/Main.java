
public class Main {
    public static void main(String[] args) {
// Завдання 1
        int[] evenNumbers = new int[50];
        int[] oddNumbers = new int[50];
        int even = 2;
        int odd = 1;
        for (int i = 0; i < 50; i++) {
            evenNumbers[i] = even;
            oddNumbers[i] = odd;
            even += 2;
            odd += 2;
        }

// Завдання 2
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

// перебрати його циклом while
        int index = 0;
        System.out.println("Перебір циклом while:");
        while (index < numbers.length) {
            System.out.print(numbers[index] + " ");
            index++;
        }
        System.out.println();

// перебрати його циклом for
        System.out.println("Перебір циклом for:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

// перебрати циклом while та вивести числа тільки з непарним індексом
        index = 1;
        System.out.println("Числа з непарним індексом:");
        while (index < numbers.length) {
            System.out.print(numbers[index] + " ");
            index += 2;
        }
        System.out.println();

// перебрати циклом for та вивести числа тільки з парним індексом
        System.out.println("Числа з парним індексом:");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

// вивести масив в зворотньому порядку
        System.out.println("Масив у зворотньому порядку:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

// Завдання 3
        double[] array = {1.5, 2.7, 3.8, 4.2, 5.1}; //одновимірний масив
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        System.out.println("Сума елементів масиву: " + sum);

// Завдання 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = -numbers[i];
            }
        }

// Вивід масиву після зміни знаку непарних елементів
        System.out.println("Масив після зміни знаку непарних елементів:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}