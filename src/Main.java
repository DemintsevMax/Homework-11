public class Main {

    public static void calculateYear() {
        int year = 1583;
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

    public static void main(String[] args) {
        System.out.println("Task 1");
        calculateYear();
    }
}