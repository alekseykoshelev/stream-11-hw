public class Cycle1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year);
            }
        }

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        {
            int deposit = 29_000;
            int sum = 0;
            for (int i = 1; i <= 12; i++) {
                sum += deposit;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
            }
        }

        {
            int deposit = 29_000;
            double sum = 0;
            for (int i = 1; i <= 12; i++) {
                sum += deposit + (sum * 0.01);
                System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей\n", i, sum);
            }
        }

        int value = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(value + "*" + i + "=" + (value * i));
        }
    }
}
