public class Main {

    public static void main(String[] args) {
        // 1. Додавання, віднімання, множення та ділення 10 цілих змінних:
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;
        int num4 = 20;
        int num5 = 25;
        int num6 = 30;
        int num7 = 35;
        int num8 = 40;
        int num9 = 45;
        int num10 = 50;

        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        int difference = num1 - num2 - num3 - num4 - num5 - num6 - num7 - num8 - num9 - num10;
        int product = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num10;
        double quotient = (double) (num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num10);

        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + difference);
        System.out.println("Добуток: " + product);
        System.out.println("Частка: " + quotient);

        // 2. Створення речення з 10-12 слів:
        String word1 = "Wenomechainsama";
        String word2 = "Tumajarbisaun";
        String word3 = "Wifenlooof";
        String word4 = "Eselifterbraun";
        String word5 = "Anweculbetugtbaby";
        String word6 = "Aslonskysrblu";
        String word7 = "Yuaksoinocenow";
        String word8 = "Buchyulaidsosun";
        String word9 = "Wenomechainsama?";
        String word10 = "Rusoriz";

        System.out.println(word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5 + " " + word6 + " " + word7 + " " + word8 + " " + word9 + " " + word10);

        // 3. Створення класу User та обчислення значень їх віку, ваги та зросту:
        User[] users = new User[10];
        users[0] = new User(1, 25, "Іван", "Петров", 70.5, 180.3);
        users[1] = new User(2, 30, "Марія", "Іванова", 65.2, 170.5);
        users[2] = new User(3, 28, "Олександр", "Коваленко", 80.0, 185.0);
        users[3] = new User(4, 35, "Ольга", "Сидоренко", 55.8, 165.7);
        users[4] = new User(5, 22, "Павло", "Григорович", 75.3, 178.9);
        users[5] = new User(6, 29, "Юлія", "Бондар", 63.5, 172.4);
        users[6] = new User(7, 27, "Василь", "Петренко", 68.2, 176.0);
        users[7] = new User(8, 33, "Наталія", "Козлова", 57.0, 163.0);
        users[8] = new User(9, 31, "Андрій", "Мельник", 73.7, 181.5);
        users[9] = new User(10, 26, "Тетяна", "Шевченко", 60.1, 168.3);
        // Додайте решту об'єктів користувачів

        int totalAge = 0;
        double totalWeight = 0;
        double totalHeight = 0;

        for (User user : users) {
            totalAge += user.age;
            totalWeight += user.weight;
            totalHeight += user.height;
        }

        System.out.println("Загальний вік користувачів: " + totalAge);
        System.out.println("Загальна вага користувачів: " + totalWeight);
        System.out.println("Загальний зріст користувачів: " + totalHeight);


        // Додайте решту об'єктів автомобілів
        Car[] cars = new Car[10];
        cars[0] = new Car(150, 2.0, "Toyota", "Corolla", "Black", 5, true);
        cars[1] = new Car(200, 2.5, "Honda", "Civic", "Red", 4, false);
        cars[2] = new Car(180, 2.2, "Ford", "Mustang", "Blue", 2, true);
        cars[3] = new Car(190, 2.3, "Chevrolet", "Camaro", "Yellow", 4, false);
        cars[4] = new Car(170, 2.1, "BMW", "X5", "White", 5, true);
        cars[5] = new Car(160, 2.4, "Mercedes-Benz", "E-Class", "Silver", 4, false);
        cars[6] = new Car(210, 2.6, "Audi", "A4", "Grey", 5, true);
        cars[7] = new Car(220, 2.7, "Lexus", "RX", "Green", 5, false);
        cars[8] = new Car(230, 2.8, "Volkswagen", "Golf", "Orange", 4, true);
        cars[9] = new Car(240, 2.9, "Subaru", "Outback", "Brown", 5, false);

        // Виведення інформації про кожен автомобіль
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Автомобіль " + (i + 1) + ":");
            System.out.println("Потужність: " + cars[i].horsepower);
            System.out.println("Об'єм двигуна: " + cars[i].engineVolume);
            System.out.println("Марка: " + cars[i].brand);
            System.out.println("Модель: " + cars[i].model);
            System.out.println("Колір: " + cars[i].color);
            System.out.println("Кількість дверей: " + cars[i].numberOfDoors);
            System.out.println("Наявність кондиціонера: " + (cars[i].hasAirConditioner ? "Так" : "Ні"));
            System.out.println();
        }
    }

    public static class User {
        int id;
        int age;
        String name;
        String surname;
        double weight;
        double height;

        public User(int id, int age, String name, String surname, double weight, double height) {
            this.id = id;
            this.age = age;
            this.name = name;
            this.surname = surname;
            this.weight = weight;
            this.height = height;
        }
    }

    public static class Car {
        int horsepower;
        double engineVolume;
        String brand;
        String model;
        String color;
        int numberOfDoors;
        boolean hasAirConditioner;

        public Car(int horsepower, double engineVolume, String brand, String model, String color, int numberOfDoors, boolean hasAirConditioner) {
            this.horsepower = horsepower;
            this.engineVolume = engineVolume;
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.numberOfDoors = numberOfDoors;
            this.hasAirConditioner = hasAirConditioner;
        }
    }
}
