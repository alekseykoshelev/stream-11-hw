public class Cycle2 {
    public static void main(String[] args) {

        {
            int sum = 0;
            int month = 1;
            while (sum < 2_459_000) {
                sum += 15_000;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
                month++;
            }
        }

        {
            int i = 1;
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();

            for (i = 10; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            int population = 12_000_000;
            int birthRate = 17;
            int deathRate = 8;
            int positiveRate = birthRate - deathRate;
            for (int i = 1; i <= 10; i++) {
                population += population / 1000 * positiveRate;
                System.out.println("Год " + i + ", численность населения составляет " + population);
            }
        }

        {
            int deposit = 15_000;
            var percent = 0.07;
            int month = 1;
            while (deposit < 12_000_000) {
                deposit += deposit * percent;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
                month++;
            }
        }

        {
            int deposit = 15_000;
            var percent = 0.07;
            int month = 1;
            while (deposit < 12_000_000) {
                deposit += deposit * percent;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
                }
                month++;
            }
        }

        {
            int deposit = 15_000;
            var percent = 0.07;
            int month = 1;
            while (month <= 9 * 12) {
                deposit += deposit * percent;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
                }
                month++;
            }
        }

        {
            for (int friday = 5; friday <= 31; friday += 7) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            }
        }

        {
            int startYear = 2023 - 200;
            int endYear = 2023 + 100;
            for (int i = 0; i < endYear; i += 79) {
                if (i > startYear) {
                    System.out.println(i);
                }
            }
        }

        {
            int startYear = 2023 - 200;
            int endYear = 2023 + 100;
            for (int i = startYear; i < endYear; i++) {
                if (i % 79 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
