import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    // Конструктор класу
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Функція для введення дати
    public void inputDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть день: ");
        this.day = scanner.nextInt();
        System.out.print("Введіть місяць: ");
        this.month = scanner.nextInt();
        System.out.print("Введіть рік: ");
        this.year = scanner.nextInt();
    }

    // Функція для виведення дати в європейському стандарті (ДД:ММ:РР)
    public void printEuropeanDate() {
        System.out.printf("%02d:%02d:%d%n", this.day, this.month, this.year);
    }

    // Функція для виведення дати в американському стандарті (ММ:ДД:РР)
    public void printAmericanDate() {
        System.out.printf("%02d:%02d:%d%n", this.month, this.day, this.year);
    }

    public static void main(String[] args) {
        // Приклад використання класу
        Date date = new Date(0, 0, 0); // Початкові значення
        date.inputDate(); // Введення дати
        System.out.print("Європейський стандарт: ");
        date.printEuropeanDate(); // Виведення в європейському стандарті
        System.out.print("Американський стандарт: ");
        date.printAmericanDate(); // Виведення в американському стандарті
    }
}

