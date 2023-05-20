import java.time.LocalDate;
import java.util.Scanner;

public class MethodsHw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите метод: \n1. Високосный год \n2. Проверка устройства \n3. Количество дней");
            var type = scanner.nextInt();
            switch (type) {
                case 1:
                    System.out.print("Введите год: ");
                    var year = scanner.nextInt();
                    printLeapYear(year);
                    break;
                case 2:
                    System.out.print("Введите тип OS: ");
                    var osType = scanner.nextInt();
                    printDevice(osType);
                    break;
                case 3: {
                    System.out.print("Введите дистанцию: ");
                    var days = calculateDays(scanner.nextInt());
                    if (days == -1) {
                        System.out.println("Доставки нет!");
                    } else {
                        System.out.println("Потребуется дней: " + days);
                    }
                }
            }
            System.out.println();
        }
    }

    private static void printLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void printDevice(int clientOS) {
        int year = LocalDate.now().getYear();
        if (year < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (year < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (year >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static int calculateDays(int distance) {
        if (distance > 100) {
            return -1;
        }
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        return days;
    }
}
