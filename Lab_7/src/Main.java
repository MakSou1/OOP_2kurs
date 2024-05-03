import java.util.ArrayList;
import java.util.Random;

public class Main {
    // Клас автомобіля
    static class Car {
        private String brand;
        private double enginePower;
        private Driver driver;
        private double price;
        private int year;

        // Конструктор з параметрами
        public Car(String brand, double enginePower, Driver driver, double price, int year) {
            this.brand = brand;
            this.enginePower = enginePower;
            this.driver = driver;
            this.price = price;
            this.year = year;
        }


        public String getBrand() {
            return brand;
        }

        public double getEnginePower() {
            return enginePower;
        }

        public void setEnginePower(double enginePower) {
            this.enginePower = enginePower;
        }

        public Driver getDriver() {
            return driver;
        }

        public void setDriver(Driver driver) {
            this.driver = driver;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    // Клас водія
    static class Driver {
        private String name;
        private int age;
        private int drivingExperience;

        // Конструктор з параметрами
        public Driver(String name, int age, int drivingExperience) {
            this.name = name;
            this.age = age;
            this.drivingExperience = drivingExperience;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getDrivingExperience() {
            return drivingExperience;
        }

        public void increaseExperience() {
            drivingExperience++;
        }
    }

    // Метод для вибору рандомного автомобіля
    static Car getRandomCar(ArrayList<Car> cars) {
        Random rand = new Random();
        return cars.get(rand.nextInt(cars.size()));
    }

    // Метод для перевірки досвіду водіїв і відправлення на курси
    static void checkDriverExperience(ArrayList<Car> cars) {
        for (Car car : cars) {
            Driver driver = car.getDriver();
            if (driver != null && driver.getDrivingExperience() < 5 && driver.getAge() > 25) {
                System.out.println("Водій " + driver.getName() + " відправляється на курси підвищення кваліфікації.");
                driver.increaseExperience();
            }
        }
    }

    // Основний метод
    public static void main(String[] args) {
        // Створення водіїв
        Driver driver1 = new Driver("Іван", 30, 5);
        Driver driver2 = new Driver("Петро", 35, 3); // Цей водій потребує курсів
        // ...

        // Створення автомобілів
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", 150, driver1, 20000, 2018));
        carList.add(new Car("BMW", 200, driver2, 30000, 2019));
        // ...

        // Ремонт та заміна водіїв
        for (Car car : carList) {
            if (car.getDriver() != null) {
                car.setEnginePower(car.getEnginePower() * 1.1); // Збільшення потужності на 10%
            }
        }

        // Підвищення потужності та ціни на кожну другу машину
        for (int i = 0; i < carList.size(); i += 2) {
            Car car = carList.get(i);
            car.setEnginePower(car.getEnginePower() * 1.1); // Збільшення потужності на 10%
            car.setPrice(car.getPrice() * 1.05); // Збільшення ціни на 5%
        }

        // Виклик методу для перевірки досвіду водіїв
        checkDriverExperience(carList);

        // Вибір рандомного автомобіля
        Car randomCar = getRandomCar(carList);
        System.out.println("Автомобіль марки " + randomCar.getBrand() + " з водієм " + randomCar.getDriver().getName() + " виїхав за вами.");



        System.out.println("Водій " + randomCar.getDriver().getName() + " прибув на місце.");
    }
}
