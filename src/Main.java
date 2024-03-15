import java.time.LocalDate;

public class Main {

    public static void calculateYear(int year) {
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(+year + " год вискосный");
            } else {
                System.out.println(+year + " год не вискосный");
            }
        } else {
            System.out.println("Такого понятия как високосный год не существовало");
        }
    }

    public static void choiceSystem(int clientOS, int clientDeviceYear) {

        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void distanceСalculation(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется одни сутки");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется двое суток");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется трое суток");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет ");
        }
    }


    public static void main(String[] args) {
        System.out.println("Task 1");
        calculateYear(2021);

        System.out.println("Task 2");
        int currentYear = LocalDate.now().getYear();
        choiceSystem(0, currentYear);

        System.out.println("Task 3");
        distanceСalculation(75);


    }
}