public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int goal = 2_459_000;
        int amount = 0;
        int payment = 15000;
        int month = 1;
        while (amount <= goal) {
            amount = amount + payment;
            amount = amount + (amount/100);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amount + " рублей");
            month++;
        }
        System.out.println();

        // Task 2
        System.out.println("Task 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Task 3
        System.out.println("Task 3");
        int population = 12_000_000;
        int growPerThousand = 17;
        int mortalityPerThousand = 8;
        for (i = 1; i <= 10; i++) {
            population += population / 1000 * growPerThousand - population / 1000 * mortalityPerThousand;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.println();

        // Task 4
        System.out.println("Task 4");
        int interest = 7;
        int deposit = 15000;
        goal = 12_000_000;
        i = 1;
        while (deposit <= goal) {
            deposit += deposit / 100 * interest;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            i++;
        }
        System.out.println();

        // Task 5
        System.out.println("Task 5");
        //int interest = 7; // Не изменился с предыдущей задачи
        //goal = 12_000_000;
        deposit = 15000;
        i = 1;
        while (deposit <= goal) {
            deposit += deposit / 100 * interest;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            } else if (deposit > goal) {
                // Результат может быть достигнут за количество месяцев не кратное 6, но должен быть выведен
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            }
            i++;
        }
        System.out.println();

        // Task 6
        System.out.println("Task 6");
        //int interest = 7; // Не изменился с предыдущей задачи
        deposit = 15000;
        int years = 9;
        i = 1;
        while (i <= years * 12) {
            deposit += deposit / 100 * interest;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            }
            i++;
        }
        System.out.println();

        // Task 7
        System.out.println("Task 7");
        int friday = 1;
        int daysOfMonth = 31;
        while (friday <= daysOfMonth) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
        System.out.println();

        // Task 8
        System.out.println("Task 8");
        int year = 0;
        int period = 79;
        int start = 2024 - 200;
        int end = 2024 + 100;
        while (year <= end) {
            if (year >= start) {
                System.out.println(year);
            }
            year += period;
        }
    }
}