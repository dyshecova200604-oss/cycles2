//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1");
        int targetAmount = 2459000;
        // Сумма, которую мы откладываем каждый месяц
        int monthlySavings = 15000;
        // Переменные для отслеживания накоплений и количества месяцев
        int totalSavings = 0;
        int months = 0;
        // Цикл для накопления средств
        while (totalSavings < targetAmount) {
            totalSavings += monthlySavings; // Увеличиваем сумму накоплений
            months++; // Увеличиваем счетчик месяцев
            // Выводим информацию о текущем месяце и сумме накоплений
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", months, totalSavings);
        }
        // Выводим общее количество месяцев, необходимых для достижения цели
        System.out.printf("Для накопления %d рублей потребуется %d месяцев.%n", targetAmount, months);

        System.out.println("Задача2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        // Переход на новую строку
        System.out.println();

        // Используем цикл for для вывода чисел от 10 до 1
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");

        }

        System.out.println();

        System.out.println("Задача3");
        int initialPopulation = 12000000; // Начальное население
        double birthRate = 17.0 / 1000; // Рождаемость на 1000 человек
        double deathRate = 8.0 / 1000; // Смертность на 1000 человек
        int years = 10; // Количество лет

        int currentPopulation = initialPopulation;


        for (int year = 1; year <= years; year++) {
            int births = (int) (currentPopulation * birthRate);
            int deaths = (int) (currentPopulation * deathRate);

            currentPopulation += births - deaths;

            System.out.printf("Год %d, численность населения составляет %d.%n", year, currentPopulation);
        }

        System.out.println();

        System.out.println("Задача4");
        double initiaAmount = 15000; // Начальная сумма вклада
        double targeAmount = 12000000; // Целевая сумма
        double monthlInterestRate = 0.07; // Процентная ставка (7%)

        double accumulatedAmount = initiaAmount; // Текущая сумма накоплений
        int monthes = 0; // Счетчик месяцев

        System.out.printf("%-10s %-15s%n", "Месяц", "Сумма накоплений");

        // Цикл для вычисления накоплений
        while (accumulatedAmount < targeAmount) {
            monthes++;
            accumulatedAmount *= (1 + monthlInterestRate); // Увеличиваем сумму на 7%
            System.out.printf("%-10d %-15.2f%n", monthes, accumulatedAmount);
        }

        System.out.println("Василию потребуется " + months + " месяцев, чтобы накопить 12 миллионов рублей.");

        System.out.println("Задача7");
        int firstFriday = 5;
        int daysInMonth = 31;
        for (int l = 0; l < 5; l ++) {
            int currentFriday = firstFriday + (l * 7);
            if (currentFriday <= daysInMonth) {

                System.out.println("Сегодня пятница, " + currentFriday + "-е число. Необходимо подготовить отчет.");
                System.out.println("Задача8");
                int currentYear = 2025;
                int yearComet = 0;
                while (yearComet <=currentYear) {
                    yearComet = yearComet + 79;
                    if (yearComet >= (currentYear - 200) && yearComet <= (currentYear + 100)) {
                        System.out.println(yearComet + " Год кометы ");
                    }
                }
                        System.out.println("Задача6");
                        int depositAmount3 = 15000;
                        int total3 = 0;
                        int i1 = 1;
                        int periogYear = 9;
                        int periodOnMounth = periogYear * 12;

                        for (; i <= periodOnMounth; i++) {
                            total3 = total3 + depositAmount3;
                            total3 = total3 + (total3 / 100 * 7);
                            if (i % 6 == 0) {
                                System.out.println("Месяц " + i + " накоплено " + total3 + " рублей");
                            }
                        }
                        System.out.println("Задача5");
                        int currentAmount = 15_000;
                        int depositFinals = 12_000_000;
                        double capitals = 0.07;
                        int monthss = 0;
                        while (currentAmount < depositFinals) {
                            currentAmount += currentAmount * capitals;
                            monthss+= 6;
                            System.out.println("Месяц " + monthss + ", сумма накоплений равна " + currentAmount + " рублей");
        } }}}}
