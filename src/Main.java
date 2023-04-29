public class Main {
    public static void main(String[] args) {

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println();

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println();

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sum = boxer2 + boxer1;
        System.out.println(sum);
        System.out.println(boxer2 - boxer1);
        System.out.println();

        System.out.println(boxer2 % boxer1);

        var totalHours = 640;
        var hoursPerDay = 8;
        var employeeCount = totalHours / hoursPerDay;
        System.out.println("Всего работников в компании — " + employeeCount + " человек");

        var newEmployeeCount = employeeCount + 94;
        System.out.println("Если в компании работает " + newEmployeeCount
                           + " человек, то всего " + (newEmployeeCount * hoursPerDay) + " часов работы может быть поделено между сотрудниками");
        System.out.println("======================");

        int luda = 23;
        int anna = 27;
        int katya = 30;
        int papers = 480;
        int perOne = papers / (luda + anna + katya);
        System.out.println("На каждого ученика рассчитано " + perOne + " листов бумаги");
        System.out.println("======================");

        int perMinute = 16 / 2;
        int per20Minutes = perMinute * 20;
        int perDay = perMinute * 60 * 24;
        int per3Days = perDay * 3;
        int perMonth = perDay * 30;

        System.out.println("За 20 минут машина произвела " + per20Minutes + " штук бутылок");
        System.out.println("За день машина произвела " + perDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + per3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + perMonth + " штук бутылок");
        System.out.println("======================");

        int totalJars = 120;
        int whiteColorPerClass = 2;
        int brownColorPerClass = 4;
        int classCount = totalJars / (whiteColorPerClass + brownColorPerClass);

        System.out.println("В школе, где " + classCount + " классов, нужно " + (classCount * whiteColorPerClass)
                           + " банок белой краски и " + (classCount * brownColorPerClass) + " банок коричневой краски");
        System.out.println("======================");

        //
        int bananaGrams = 5 * 80;
        double milkGrams = 200 * 1.05;
        int iceCreamGrams = 2 * 100;
        int eggsGrams = 4 * 70;

        double totalInGrams = bananaGrams + milkGrams + iceCreamGrams + eggsGrams;
        System.out.println("Всего в граммах: " + totalInGrams);
        System.out.println("Всего в кг: " + totalInGrams / 1000);
        System.out.println("======================");

        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;
        int loss = 7 * 1000;

        int maxDays = loss / minGramsPerDay;
        int minDays = loss / maxGramsPerDay;
        System.out.println(minDays);
        System.out.println(maxDays);
        System.out.println((maxDays + minDays) / 2);
        double average = loss / ((minGramsPerDay + maxGramsPerDay) / 2d);
        System.out.println(average);
        System.out.println("======================");


        double maria = 67_760;
        double denis = 83_690;
        double kristina = 76_230;

        double increasedMaria = 67_760 * 1.1;
        double increasedDenis = 83_690 * 1.1;
        double increasedKristina = 76_230 * 1.1;

        double total = maria + denis + kristina;
        double increasedTotal = increasedDenis + increasedKristina + increasedMaria;

        System.out.println("Маша теперь получает " + increasedMaria + " рублей. Годовой доход вырос на " +
                           ((increasedMaria - maria) * 12) + " рублей");
    }
}