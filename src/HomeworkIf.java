public class HomeworkIf {

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
        task9();
        System.out.println();
        task10();
        System.out.println();
        task11();
        System.out.println();

        int month = 2;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень!");
                break;

            default:
                System.out.println("Нет такого месяца!");
        }

    }

    private static void task11() {
        /*
         int distance = 23;
        if (distance > 100) {
            System.out.println("Доставки нет!");
        } else {
            int days = 1;
            if (distance > 20) {
                days++;
            }
            if (distance > 60) {
                days++;
            }
            System.out.println("Потребуется дней: " + days);
        }
         */
        int distance = 23;
        if (distance > 100) {
            System.out.println("Доставки нет!");
            return;
        }
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        System.out.println("Потребуется дней: " + days);
    }

    private static void task10() {
        int year = 2023;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void task9() {
        int year = 2015;
        int clientOS = 1;

        String os = clientOS == 0 ? "iOS" : "Android";
        String type = year < 2015 ? "облегченную" : "";
        System.out.println("Установите " + type + " версию приложенрия для " + os + " по ссылке");

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

    private static void task8() {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void task7() {
        int one = 1;
        int two = 2;
        int three = 3;

        int max;
        if (one > two) {
            max = one;
        } else {
            max = two;
        }

        if (max > three) {
            System.out.println(max);
        } else {
            System.out.println(three);
        }
    }

    private static void task6() {
        System.out.println("Задача 6");
        int totalPlace = 102;
        int seatsCount = 60;
        int busy = 70;
        if (busy >= totalPlace) {
            System.out.println("Вагон переполнен");
        } else {
            if (busy >= seatsCount) {
                System.out.println("Есть только стоячее место!");
            } else {
                System.out.println("Есть сидячие места!");
            }
        }
    }

    private static void task5() {
        int age = 5;
        boolean parent = false;
        if (age < 5) {
            System.out.println("не может кататься на аттракционе.");
        }
        if (age >= 5 && age < 14 && parent) {
            System.out.println("может кататься только в сопровождении взрослого");
        }
        if (age >= 14) {
            System.out.println("может кататься без сопровождения взрослого.");
        }
    }

    private static void task4() {
        int age = 1;
        if (age >= 2 && age <= 6) {
            System.out.println("Нужно ходить в детский сад.");
        }
        if (age > 6 && age <= 18) {
            System.out.println("Нужно ходить в школу.");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Нужно ходить в университет.");
        }
        if (age > 24) {
            System.out.println("Нужно ходить на работу.");
        }
    }

    private static void task3() {
        int speed = 60;
        if (speed > 60) {
            System.out.println("Придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }
    }

    private static void task2() {
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    private static void task1() {
        int age = 25;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия");
        }
    }

}
